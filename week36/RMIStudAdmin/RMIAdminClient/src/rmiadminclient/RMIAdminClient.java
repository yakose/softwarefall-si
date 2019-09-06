/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiadminclient;

import dk.yakose.rmiadminserver.abstracts.StudentAdmin;
import dk.yakose.rmiadminserver.pojos.Student;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author yakos
 */
public class RMIAdminClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> list = null;
        try {

            StudentAdmin stub = (StudentAdmin) Naming.lookup("//127.0.0.1:4000/getFirstSemesterStudentsData");

            list = stub.getFirstSemesterStudentsData();            
            if(list.size() > 0){
                System.out.println("Retrieving First Semester Students From Files....");
                list.forEach((s) -> {
                    System.out.println(s);
                });

            }            
            list.clear();
            StudentAdmin secondStub = (StudentAdmin) Naming.lookup("//127.0.0.1:4000/getSecondSemesterStudentsData");

            list = secondStub.getSecondSemesterStudentsData();            
            if(list.size() > 0){
                System.out.println("Retrieving Second Semester Students From SQL....");
                list.forEach((s) -> {
                    System.out.println(s);
                });

            }
            

        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println(e);
        }
    }

}
