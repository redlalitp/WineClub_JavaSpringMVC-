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
public class AdminArrayTest {
    
    public AdminArrayTest() {
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int iD = 0;
        AdminArray instance = new AdminArray(0,"abc");
        instance.setID(iD);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        AdminArray instance = new AdminArray(0,"abc");
        instance.setName("abc");
        
    }
    
}
