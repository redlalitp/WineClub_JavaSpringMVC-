/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring15_CS445.model;

import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lalit
 */
public class SubscriberResponseTest {
    
    public SubscriberResponseTest() {
    }

    

    @Test
    public void testSetID() {
        System.out.println("setID");
        int iD = 0;
        SubscriberResponse instance = new SubscriberResponse();
        instance.setID(iD);
        assertEquals(iD, instance.getID());
    }

   
    
}
