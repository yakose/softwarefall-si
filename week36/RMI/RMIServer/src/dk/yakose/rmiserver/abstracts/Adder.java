/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiserver.abstracts;

import java.rmi.*;
public interface Adder extends Remote{

public int add(int x,int y)throws RemoteException;
}
