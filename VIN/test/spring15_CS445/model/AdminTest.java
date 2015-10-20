/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring15_CS445.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lalit
 */
public class AdminTest {
    
    public AdminTest() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Admin instance = new Admin();
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Admin instance = new Admin();
        instance.setName(name);
        
    }

    @Test
    public void testUpdateInfo() {
        System.out.println("updateInfo");
        String name = "";
        Admin instance = new Admin();
        instance.updateInfo(name);
        
    }

    @Test
    public void testGetDOJ() {
        System.out.println("getDOJ");
        Admin instance = new Admin();
        String expResult = new java.util.Date().toString();
        String result = instance.getDOJ();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDOJ() {
        System.out.println("setDOJ");
        String dOJ = "";
        Admin instance = new Admin();
        instance.setDOJ(dOJ);
        
    }

    @Test
    public void testGetCreator() {
        System.out.println("getCreator");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getCreator();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCreator() {
        System.out.println("setCreator");
        String creator = "";
        Admin instance = new Admin();
        instance.setCreator(creator);
        
    }
    
}
