/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiclient;

import java.rmi.*;
/**
 *
 * @author yakos
 * 
 */
import dk.yakose.rmiserver.abstracts.Adder;
public class RMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {

            Adder stub = (Adder) Naming.lookup("//127.0.0.1:4000/Adder");
            System.out.println(stub.add(34, 4));

        }catch(Exception e){System.out.println(e);}
    }

}
