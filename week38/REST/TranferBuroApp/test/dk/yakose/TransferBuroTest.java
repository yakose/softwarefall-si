/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose;

import javax.ws.rs.container.AsyncResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yakos
 */
public class TransferBuroTest {
    
    public TransferBuroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getExchangeFromKroneToDollarXml method, of class TransferBuro.
     */
    @Test
    public void testGetExchangeFromKroneToDollarXml() {
        System.out.println("getExchangeFromKroneToDollarXml");
        AsyncResponse asyncResponse = null;
        double amount;
        amount = 0.0;
        TransferBuro instance = new TransferBuro();
        instance.getExchangeFromKroneToDollarXml(asyncResponse, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
