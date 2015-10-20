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
public class ErrorsTest {
    
    public ErrorsTest() {
    }

    @Test
    public void testGetErrorID() {
        System.out.println("getErrorID");
        Errors instance = new Errors(0,"abc");
        int expResult = 0;
        int result = instance.getErrorID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetErrorID() {
        System.out.println("setErrorID");
        int errorID = 0;
        Errors instance = new Errors(0,"abc");
        instance.setErrorID(errorID);
        assertEquals(errorID, instance.getErrorID());
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Errors instance = new Errors(0,"abc");
        String expResult = "Desc";
        instance.setDescription("Desc");
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Errors instance = new Errors(0,"abc");;
        instance.setDescription(description);
        
    }
    
}
