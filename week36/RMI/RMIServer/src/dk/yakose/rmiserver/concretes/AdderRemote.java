/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiserver.concretes;

import dk.yakose.rmiserver.abstracts.Adder;
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author yakos
 */
public class AdderRemote extends UnicastRemoteObject implements Adder {

    public AdderRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }

}
