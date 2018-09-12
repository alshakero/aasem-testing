/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testing;

import com.sun.net.httpserver.Authenticator;
import javax.naming.InsufficientResourcesException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Aasem
 */
public class TestTest {

    public TestTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of FindTheRoot method, of class Test.
     */
    /**
     * Test of LastThree method, of class Test.
     */
    @Test
    public void testLastThree() {
        System.out.println("LastThree");
        int[] args = {6, 9, 3, 4};
        //length =4 
        //length -3= 1
        com.mycompany.testing.Test instance = new com.mycompany.testing.Test();
        int[] expResult = {9, 3, 4};
        int[] result = instance.LastThree(args);
        assertArrayEquals("It should return the last 3 elements ", expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of LastThree method, of class Test.
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testLastThreeFailure() throws IndexOutOfBoundsException {
        System.out.println("LastThree");
        int[] args = {6, 9};
        //length =4 
        //length -3= 1

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Array too short");
        com.mycompany.testing.Test instance = new com.mycompany.testing.Test();

        instance.LastThree(args);

    }

    /**
     * Test of SayZero method, of class Test.
     */
    @Test
    public void testSayZero() {
        System.out.println("SayZero");
        com.mycompany.testing.Test instance = new com.mycompany.testing.Test();
        int expResult = 0;
        int result = instance.SayZero();
        boolean test = expResult == result;
        assertTrue(test);

    }

}
