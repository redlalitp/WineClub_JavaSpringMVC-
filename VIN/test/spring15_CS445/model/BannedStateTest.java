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
public class BannedStateTest {
    
    public BannedStateTest() {
    }

    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Address a = new Address();
        BannedState instance = new BannedState();
        boolean expResult = false;
        boolean result = instance.isMatch(a);
        assertEquals(expResult, result);
        
    }
    
}
