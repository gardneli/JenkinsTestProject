/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitchology.jenkinstestproject;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gardneli
 */
public class NamedStorageBeanTest {
    
    public NamedStorageBeanTest() {
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
     * Test of getName method, of class NamedStorageBean.
     */
    @Test
    public void testGetName() throws Exception {
        System.out.println("getName");
        /*
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NamedStorageBean instance = (NamedStorageBean)container.getContext().lookup("java:global/classes/NamedStorageBean");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        * 
        container.close();
        */
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class NamedStorageBean.
     */
    @Test
    public void testSetName() throws Exception {
        System.out.println("setName");
        /*
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NamedStorageBean instance = (NamedStorageBean)container.getContext().lookup("java:global/classes/NamedStorageBean");
        instance.setName(name);
        container.close();
        * */
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}