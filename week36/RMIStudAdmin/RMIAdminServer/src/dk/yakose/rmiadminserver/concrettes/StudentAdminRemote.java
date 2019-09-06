/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.rmiadminserver.concrettes;

import java.rmi.server.*;

import dk.yakose.rmiadminserver.abstracts.StudentAdmin;
import dk.yakose.rmiadminserver.pojos.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author yakos
 */
public class StudentAdminRemote extends UnicastRemoteObject implements StudentAdmin {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials 
    static final String USER = "sa";
    static final String PASS = "password";
    static final String CSV_FILE_NAME = "./CSV/students.csv";

    public StudentAdminRemote() throws RemoteException {
        super();
    }

    @Override
    public List<Student> getSecondSemesterStudentsData() throws RemoteException {
        List<Student> list = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
                // PreparedStatement ps = con.prepareStatement("select name, email,address from student");
                //  ResultSet rs = ps.executeQuery();

                Statement stmt = con.createStatement();
                String sql = "select id, name, email,address from student";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    // name, email,address;
                    Student s = new Student();
                    s.setId(rs.getInt(1));
                    s.setName(rs.getString(2));
                    s.setEmail(rs.getString(3));
                    s.setAddress(rs.getString(4));
                    list.add(s);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    /**
     *
     * @return @throws RemoteException
     */
    @Override
    public List<Student> getFirstSemesterStudentsData() throws RemoteException {
        List<Student> students = new ArrayList<>();
        Path pathToFile = Paths.get(CSV_FILE_NAME);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                
               //  int id = Integer.parseInt(attributes[0]);
                 String name = attributes[1];
                 String email =attributes[2];
                 String address = attributes[3];

                Student s = new Student();
                s.setName(name);
                s.setEmail(email);
                s.setAddress(address);
                // adding student into ArrayList
                students.add(s);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
        }

        return students;
    }

}
