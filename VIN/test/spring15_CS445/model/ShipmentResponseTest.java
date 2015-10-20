/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring15_CS445.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Lalit
 */
public class ShipmentResponseTest {
    List<Wine> list = new ArrayList<Wine>();
    public ShipmentResponseTest() {
    }

    @Test
    public void testGetSm() {
        System.out.println("getSm");
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);
        String expResult = "a";
        String result = instance.getSm();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetSm() {
        System.out.println("setSm");
        String sm = "b";
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        instance.setSm(sm);
        assertEquals(sm, instance.getSm());
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        String expResult = "b";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "b";
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        instance.setStatus(status);
        assertEquals(status, instance.getStatus());
    }

    @Test
    public void testGetDt() {
        System.out.println("getDt");
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        String expResult = "c";
        String result = instance.getDt();
        assertEquals(expResult, result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDt() {
        System.out.println("setDt");
        String dt = "d";
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        instance.setDt(dt);
        assertEquals(dt, instance.getDt());
    }

    @Test
    public void testGetWt() {
        System.out.println("getWt");
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        String expResult = "d";
        String result = instance.getWt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetWt() {
        System.out.println("setWt");
        String wt = "d";
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        instance.setWt(wt);
        assertEquals(wt, instance.getWt());
    }

    @Test
    public void testGetWines() {
        System.out.println("getWines");
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        List<Wine> expResult = new ArrayList<Wine>();
        List<Wine> result = instance.getWines();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetWines() {
        System.out.println("setWines");
        List<Wine> wines = new ArrayList<Wine>();
        ShipmentResponse instance = new ShipmentResponse("a","b","c","d",list);;
        instance.setWines(wines);
        assertEquals(wines, instance.getWines());
    }
    
}
