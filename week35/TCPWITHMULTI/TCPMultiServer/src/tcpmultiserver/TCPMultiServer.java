/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpmultiserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author yakos
 */
public class TCPMultiServer {

    public static final int PORT = 4000;
    //public ServerSocket serverSocket = null; // Server gets found
    public Socket openSocket = null;
    private static ArrayList<TCPMultiThread> clients = new ArrayList<>();
    static ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void configureServer() throws UnknownHostException, IOException {
        // get server's own IP address
        String serverIP = InetAddress.getLocalHost().getHostAddress();
        System.out.println("Server ip: " + serverIP);

        ServerSocket serverSocket = new ServerSocket(PORT);

        while (true) {
            System.out.println(" [Server]now waiting for Clients Connection");
            Socket listening = serverSocket.accept();
            System.out.println(" [Server] Connected to client");
            TCPMultiThread tcpMultiThread = new TCPMultiThread(listening);
            clients.add(tcpMultiThread);
            
            
            pool.execute(tcpMultiThread);
        }

    }

    public static void main(String[] args) throws IOException {
        try {
            configureServer();

        } catch (Exception e) {
            System.out.println(" Connection fails: " + e);
        } finally {
            // openSocket.close();
            System.out.println("Connection to client closed");

            //serverSocket.close();
            System.out.println("Server port closed");
        }

    }
}
