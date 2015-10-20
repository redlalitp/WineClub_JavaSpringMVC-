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
public class ReceiptArrayTest {
    
    public ReceiptArrayTest() {
    }

   
    @Test
    public void testSetRid() {
        System.out.println("setRid");
        int rid = 0;
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        instance.setRid(rid);
        assertEquals(rid, instance.getRid());
    }

    @Test
    public void testGetDt() {
        System.out.println("getDt");
        ReceiptArray instance = new ReceiptArray(0,new java.util.Date().toString(),0,"def");;
        String expResult = new java.util.Date().toString();
        String result = instance.getDt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDt() {
        System.out.println("setDt");
        String dt = new java.util.Date().toString();
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        instance.setDt(dt);
        assertEquals(dt, instance.getDt());
    }

    @Test
    public void testGetSubID() {
        System.out.println("getSubID");
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        int expResult = 0;
        instance.setSubID(expResult);
        int result = instance.getSubID();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetSubID() {
        System.out.println("setSubID");
        int subID = 0;
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        instance.setSubID(subID);
        assertEquals(subID, instance.getSubID());
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        String expResult = "abc";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "abc";
        ReceiptArray instance = new ReceiptArray(0,"abc",0,"def");;
        instance.setName(name);
        assertEquals(name, instance.getName());
    }
    
}
