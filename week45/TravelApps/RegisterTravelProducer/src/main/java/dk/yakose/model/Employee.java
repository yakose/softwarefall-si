/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Employee implements Serializable{
    private String firstName; 
    private String lastName; 
    private String Id; 
    private String manager; 

    public Employee() {
    }

    public Employee(String firstName, String lastName, String Id, String manager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Id = Id;
        this.manager = manager;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", Id=" + Id + ", manager=" + manager + '}';
    }
    
    
    
}
