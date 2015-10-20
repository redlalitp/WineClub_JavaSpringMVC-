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
public class IdGeneratorTest {
    
    public IdGeneratorTest() {
    }

    @Test
    public void testNewID() {
        System.out.println("newID");
        int expResult = IdGenerator.newID()+1;
        int result = IdGenerator.newID();
        assertEquals(expResult, result);
        
    }
    
}
