/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiadminserver.abstracts;

import dk.yakose.rmiadminserver.pojos.Student;
import java.rmi.*;  
import java.util.*;  

/**
 *
 * @author yakos
 */
public interface StudentAdmin  extends Remote{
    public List<Student> getSecondSemesterStudentsData()throws RemoteException;  
    public List<Student> getFirstSemesterStudentsData()throws RemoteException;  
    
}
