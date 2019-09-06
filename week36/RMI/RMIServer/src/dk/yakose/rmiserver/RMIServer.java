/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiserver;

import dk.yakose.rmiserver.abstracts.Adder;
import dk.yakose.rmiserver.concretes.AdderRemote;
import java.rmi.*;
import java.rmi.registry.*;




import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;







/**
 *
 * @author yakos
 */
public class RMIServer {
     public static Registry registry;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            System.out.println("RMI server localhost starts");
            
            // Create a server registry at default port 4000
            registry = LocateRegistry.createRegistry(4000);
            System.out.println("RMI registry created ");
            
            // Create engine of remote services, running on the server
            Adder remoteEngine = new AdderRemote();
            
            // Give a name to this engine
            String engineName = "Adder";
            
            // Register the engine by the name, which later will be given to the clients
            Naming.rebind("//127.0.0.1:4000/" + engineName, remoteEngine);
            System.out.println("Engine " + engineName + " bound in registry"); 

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
