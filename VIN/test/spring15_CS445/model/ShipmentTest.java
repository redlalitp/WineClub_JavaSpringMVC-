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
public class ShipmentTest {
    List<Wine> list = new ArrayList<Wine>();
	Shipment instance = new Shipment(WineVariety.RED,"abc",list);
    public ShipmentTest() {
    }

    @Test
    public void testSetSid() {
        System.out.println("setSid");
        int sid = 0;
        
        instance.setSid(sid);
        assertEquals(sid, instance.getSid());
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String expResult = "status";
        instance.setStatus(expResult);
        String result = instance.getStatus();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "iop";
        instance.setStatus(status);
        assertEquals(status, instance.getStatus());
    }

    @Test
    public void testGetWt() {
        System.out.println("getWt");
        WineVariety expResult = WineVariety.RED;
        WineVariety result = instance.getWt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetWt() {
        System.out.println("setWt");
        WineVariety wt = WineVariety.ROSE;
        
        instance.setWt(wt);
        assertEquals(wt, instance.getWt());
    }

    @Test
    public void testGetWines() {
        System.out.println("getWines");
        
        List<Wine> expResult = new ArrayList<Wine>();
        List<Wine> result = instance.getWines();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetWines() {
        System.out.println("setWines");
        List<Wine> wines = new ArrayList<Wine>();
        
        instance.setWines(wines);
        assertEquals(wines, instance.getWines());
    }

    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        List<Note> expResult = new ArrayList<Note>();
        List<Note> result = instance.getNotes();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        List<Note> notes = new ArrayList<Note>();
        instance.setNotes(notes);
        assertEquals(notes, instance.getNotes());
    }

    @Test
    public void testGetDt() {
        System.out.println("getDt");
        String expResult = "abc";
        String result = instance.getDt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDt() {
        System.out.println("setDt");
        String dt = new java.util.Date().toString();
        instance.setDt(dt);
        assertEquals(dt, instance.getDt());
    }
    
}
