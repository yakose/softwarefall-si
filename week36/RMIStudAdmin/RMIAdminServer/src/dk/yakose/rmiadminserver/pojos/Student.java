/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiadminserver.pojos;

/**
 *
 * @author yakos
 */
public class Student implements java.io.Serializable{

    public Student() {
    }

    public Student( int id, String name, String email, String address) {
         this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;       
    }
    private String name, email,address;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     @Override
    public String toString() {
        return "Student[ name=" + name + ", email=" + email + ", address=" + address  + "]";
    }
    
}
