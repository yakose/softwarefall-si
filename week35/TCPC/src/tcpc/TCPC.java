/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpc;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author yakos
 */
public class TCPC 
{
    // Three I/O streams attached to the client:
    static Scanner cin;        // incoming stream from the local console
    static PrintWriter out;    // outcoming stream from client to server (the request)
    static Scanner in;         // incoming stream from the server to the client(the response)
    
    public static int PORT = 4000;
    
    public static String request, response;
        
    public static void main(String[] args) throws IOException
    {
        // Server socket
        InetAddress ip = null;
        Socket socket = null;

        if (args.length == 2)
            socket = new Socket(args[0], parseInt(args[1]));
        else
        {
            System.err.println("Server data missing");
            ip =  InetAddress.getByName(null);
            socket = new Socket(ip, PORT);
        }
        System.out.println("Socket: " + socket);       
        
        try (Scanner cin = new Scanner(System.in);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            Scanner in = new Scanner(socket.getInputStream());)
            {
                System.out.println("Client up and running");
                System.out.println("Send a message or \"stop\" to close connection");

                // User types request from the keyboard and the app sends it to the server
                while ((request = cin.nextLine()) != null)
                {
                    // Send the user message to the server
                    out.println(request);

                    // Get the response of the Server and print it out to the Client
                    response = in.nextLine();
                    System.out.println(response);
                }
        }
        catch (UnknownHostException e)
        {
            System.err.println("No host " + ip);
            System.exit(1);
        }
        catch (IOException e)
        {
            System.err.println("No I/O connection to " + ip);
            System.exit(1);
        }
        finally
        {
            //socket.close();
            System.out.println("Client closing...");           
        }
    }
}