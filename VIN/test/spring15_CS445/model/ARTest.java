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
public class ARTest {
    
    public ARTest() {
    }

    @Test
    public void testAddWine() {
        System.out.println("addWine");
        Wine w = new Wine();
        AR instance = new AR();
        instance.addWine(w);
        
    }
    
}
