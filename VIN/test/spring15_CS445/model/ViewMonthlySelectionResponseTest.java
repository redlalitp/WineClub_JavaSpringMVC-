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
public class ViewMonthlySelectionResponseTest {
	List<Wine> list = new ArrayList<Wine>();
	ViewMonthlySelectionResponse instance = new ViewMonthlySelectionResponse(0,"a","b","c",1,list);
    
    public ViewMonthlySelectionResponseTest() {
    }

    
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetSm() {
        System.out.println("getSm");
        String expResult = "a";
        String result = instance.getSm();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetSm() {
        System.out.println("setSm");
        String sm = "abc";
        instance.setSm(sm);
        assertEquals(sm, instance.getSm());
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        String expResult = "b";
        String result = instance.getType();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "nmb";
        instance.setType(type);
        assertEquals(type, instance.getType());
    }

    @Test
    public void testGetCd() {
        System.out.println("getCd");
        String expResult = "c";
        String result = instance.getCd();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCd() {
        System.out.println("setCd");
        String cd = "";
        instance.setCd(cd);
        assertEquals(cd, instance.getCd());
    }

    @Test
    public void testGetCreatedBy() {
        System.out.println("getCreatedBy");
        int expResult = 1;
        int result = instance.getCreatedBy();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCreatedBy() {
        System.out.println("setCreatedBy");
        int createdBy = 0;
        instance.setCreatedBy(createdBy);
        assertEquals(createdBy, instance.getCreatedBy());
        
    }

    @Test
    public void testGetWa() {
        System.out.println("getWa");
        List<WineArray> expResult = new ArrayList<WineArray>();
        List<WineArray> result = instance.getWa();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetWa() {
        System.out.println("setWa");
        List<WineArray> wa = null;
        instance.setWa(wa);
        assertEquals(wa, instance.getWa());
    }
    
}
