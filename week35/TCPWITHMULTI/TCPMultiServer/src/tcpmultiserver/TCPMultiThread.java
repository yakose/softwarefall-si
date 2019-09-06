/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpmultiserver;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author yakos
 */
public class TCPMultiThread  extends Thread{
    
    private Socket openSocket = null;
 
    public TCPMultiThread(Socket socket) {
        super("TCPMultiThread");
        this.openSocket = socket;
    }
    
    public void run() {

        String request, response;

        try {
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
                    response = new StringBuilder(request).reverse().toString();
                    out.println(response);
                    // Log response on the server's console, too
                    System.out.println("Log: " + response);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
