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
public class WineArrayTest {
    
	WineArray instance = new WineArray(0,"abc");
    
    public WineArrayTest() {
    }

    

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetLabel_name() {
        System.out.println("getLabel_name");
        String expResult = "abc";
        String result = instance.getLabel_name();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetLabel_name() {
        System.out.println("setLabel_name");
        String label_name = "cbd";
        instance.setLabel_name(label_name);
        assertEquals(label_name, instance.getLabel_name());
    }
    
}
