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
public class AWTest {
    
    public AWTest() {
    }

    @Test
    public void testAddWine() {
        System.out.println("addWine");
        Wine w = new Wine();
        AW instance = new AW();
        instance.addWine(w);
       
    }
    
}
