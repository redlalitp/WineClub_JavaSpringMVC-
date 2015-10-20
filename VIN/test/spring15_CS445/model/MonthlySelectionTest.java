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
public class MonthlySelectionTest {
    
	
    public MonthlySelectionTest() {
    }

    @Test
    public void testAddWine() {
        System.out.println("addWine");
        Wine w = null;
        MonthlySelection instance = new MonthlySelectionImpl();
        instance.addWine(w);
        
    }

    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        String kw = "abc";
        MonthlySelection instance = new MonthlySelectionImpl();
        boolean expResult = false;
        boolean result = instance.isMatch(kw);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetMst() {
        System.out.println("getMst");
        MonthlySelection instance = new MonthlySelectionImpl();
        MonthlySelectionType expResult = null;
        MonthlySelectionType result = instance.getMst();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetMst() {
        System.out.println("setMst");
        MonthlySelectionType mst = null;
        MonthlySelection instance = new MonthlySelectionImpl();
        instance.setMst(mst);
        
    }

    @Test
    public void testGetYm() {
        System.out.println("getYm");
        MonthlySelection instance = new MonthlySelectionImpl();
        String expResult = "2015-09";
        String result = instance.getYm();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetYm() {
        System.out.println("setYm");
        String ym = "";
        MonthlySelection instance = new MonthlySelectionImpl();
        instance.setYm(ym);
        
    }

    @Test
    public void testGetMs() {
        System.out.println("getMs");
        MonthlySelection instance = new MonthlySelectionImpl();
        List<Wine> expResult = new ArrayList<Wine>();
        List<Wine> result = instance.getMs();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetMs() {
        System.out.println("setMs");
        List<Wine> ms = null;
        MonthlySelection instance = new MonthlySelectionImpl();
        instance.setMs(ms);
        
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        MonthlySelection instance = new MonthlySelectionImpl();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        MonthlySelection instance = new MonthlySelectionImpl();
        instance.setId(id);
        
    }

    public class MonthlySelectionImpl extends MonthlySelection {

        public void addWine(Wine w) {
        }
    }
    
}
