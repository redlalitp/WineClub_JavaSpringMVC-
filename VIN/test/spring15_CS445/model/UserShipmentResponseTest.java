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
public class UserShipmentResponseTest {
	UserShipmentResponse instance = new UserShipmentResponse(0,"abc","status");
    public UserShipmentResponseTest() {
    }

    
    @Test
    public void testSetSid() {
        System.out.println("setSid");
        int sid = 0;
        
        instance.setSid(sid);
        assertEquals(sid, instance.getSid());
    }

    @Test
    public void testGetSm() {
        System.out.println("getSm");
        
        String expResult = "abc";
        String result = instance.getSm();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetSm() {
        System.out.println("setSm");
        String sm = "gfs";
        
        instance.setSm(sm);
        assertEquals(sm, instance.getSm());
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        
        String expResult = "status";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "status change";
        
        instance.setStatus(status);
        assertEquals(status, instance.getStatus());
    }
    
}
