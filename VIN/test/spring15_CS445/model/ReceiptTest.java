/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring15_CS445.model;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lalit
 */
public class ReceiptTest {
    
	Receipt r1 = new Receipt("delivered_to",2);
	
    public ReceiptTest() {
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        Receipt instance = new Receipt();
        int expResult = IdGenerator.newID()-1;
        int result = instance.getID();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int iD = 0;
        Receipt instance = new Receipt();
        instance.setID(iD);
        assertEquals(iD, instance.getID());
    }

   

    @Test
    public void testSetDt() {
        System.out.println("setDt");
        Date dt = new java.util.Date();
        Receipt instance = new Receipt();
        instance.setDt(dt);
        assertEquals(dt, instance.getDt());
    }

    @Test
    public void testGetTOD() {
        System.out.println("getTOD");
        Receipt instance = new Receipt();
        String expResult = new Date().toString().split(" ")[3];
        String result = instance.getTOD();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetTOD() {
        System.out.println("setTOD");
        String tOD = new Date().toString().split(" ")[3];
        Receipt instance = new Receipt();
        instance.setTOD(tOD);
        assertEquals(tOD, instance.getTOD());
    }

    @Test
    public void testGetSubID() {
        System.out.println("getSubID");
        Receipt instance = new Receipt();
        int expResult = 0;
        instance.setSubID(expResult);
        int result = instance.getSubID();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetSubID() {
        System.out.println("setSubID");
        int subID = IdGenerator.newID()+1;
        Receipt instance = new Receipt();
        instance.setSubID(subID);
        assertEquals(subID, instance.getID());
    }

    @Test
    public void testGetSubName() {
        System.out.println("getSubName");
        Receipt instance = new Receipt();
        String expResult = "abc";
        instance.setSubName(expResult);
        String result = instance.getSubName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSubName() {
        System.out.println("setSubName");
        String subName = "abc";
        Receipt instance = new Receipt();
        instance.setSubName(subName);
        assertEquals(subName, instance.getSubName());
    }

    @Test
    public void testGetRecieverName() {
        System.out.println("getRecieverName");
        Receipt instance = new Receipt();
        String expResult = "";
        instance.setRecieverName(expResult);
        String result = instance.getRecieverName();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetRecieverName() {
        System.out.println("setRecieverName");
        String recieverName = "";
        Receipt instance = new Receipt();
        instance.setRecieverName(recieverName);
        assertEquals(recieverName, instance.getRecieverName());
    }
    
}
