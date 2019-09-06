package bankingserivice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BankingSerivice {

    public static final int PORT = 6666;
    public static ServerSocket serverSocket = null; // Server gets found
    public static Socket openSocket = null;         // Server communicates with the client

    public static Socket configureServer() throws UnknownHostException, IOException {
        // get server's own IP address
        String serverIP = InetAddress.getLocalHost().getHostAddress();
        System.out.println("Server ip: " + serverIP);

        // create a socket at the predefined port
        serverSocket = new ServerSocket(PORT);

        // Start listening and accepting requests on the serverSocket port, blocked until a request arrives
        openSocket = serverSocket.accept();
        System.out.println("Server accepts requests at: " + openSocket);

        return openSocket;
    }

    public static void connectClient(Socket openSocket) throws IOException {
        String request, response;

        int money = 500000;
        // two I/O streams attached to the server socket:       
        Scanner in;         // Scanner is the incoming stream (requests from a client)
        PrintWriter out;    // PrintWriter is the outcoming stream (the response of the server)
        in = new Scanner(openSocket.getInputStream());
        out = new PrintWriter(openSocket.getOutputStream(), true);
        // Parameter true ensures automatic flushing of the output buffer

        // Server keeps listening for request and reading data from the Client,  
        // until the Client sends "stop" requests
        while (in.hasNextLine()) {
            request = in.nextLine();

            if (request.equals("stop")) {
                out.println("Good bye, client!");
                System.out.println("Log: " + request + " client!");
                break;
            } else {
                // server responses
                if (request.startsWith("deposit")) {
                    int deposit = Integer.parseInt(request.substring(8));
                    money = deposit * 100;
                    System.out.println(deposit + " kr. added to the account");

                } else if (request.startsWith("withdraw")) {
                    int withdraw = Integer.parseInt(request.substring(9));
                    if (money >= withdraw * 100) {
                        money -= withdraw * 100;
                        System.out.println(withdraw + " kr. withdraw to the account");
                    } else {
                        out.println("You don't have enough funds to withdraw that much.");
                    }

                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            openSocket = configureServer();
            connectClient(openSocket);
        } catch (Exception e) {
            System.out.println(" Connection fails: " + e);
        } finally {
            openSocket.close();
            System.out.println("Connection to client closed");

            serverSocket.close();
            System.out.println("Server port closed");
        }

    }
}
