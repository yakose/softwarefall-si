/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiadminserver;

import dk.yakose.rmiadminserver.abstracts.StudentAdmin;
import dk.yakose.rmiadminserver.concrettes.StudentAdminRemote;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author yakos
 */
public class RMIAdminServer {
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
            StudentAdmin remoteEngine = new StudentAdminRemote();
            
            // Give a name to this engine
            String engineName1= "getFirstSemesterStudentsData";
            String engineName2= "getSecondSemesterStudentsData";
            
            // Register the engine by the name, which later will be given to the clients
            Naming.rebind("//127.0.0.1:4000/" + engineName1, remoteEngine);
            System.out.println("Engine " + engineName1 + " bound in registry"); 
            
            
             // Register the engine by the name, which later will be given to the clients
            Naming.rebind("//127.0.0.1:4000/" + engineName2, remoteEngine);
            System.out.println("Engine " + engineName2 + " bound in registry"); 

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
