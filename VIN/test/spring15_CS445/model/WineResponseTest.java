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
public class WineResponseTest {
    
	
    public WineResponseTest() {
    }

    
    @Test
    public void testSetWid() {
        System.out.println("setWid");
        int wid = 3;
        WineResponse instance = new WineResponse();
        instance.setWid(wid);
        assertEquals(wid, instance.getWid());
    }

    @Test
    public void testGetVar() {
        System.out.println("getVar");
        WineResponse instance = new WineResponse();
        String expResult = "abc";
        instance.setVar(expResult);
        String result = instance.getVar();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetVar() {
        System.out.println("setVar");
        String var = "def";
        WineResponse instance = new WineResponse();
        instance.setVar(var);
        assertEquals(var, instance.getVar());
    }

    @Test
    public void testGetVt() {
        System.out.println("getVt");
        WineResponse instance = new WineResponse();
        String expResult = "abc";
        instance.setVt(expResult);
        String result = instance.getVt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetVt() {
        System.out.println("setVt");
        String vt = "xyz";
        WineResponse instance = new WineResponse();
        instance.setVt(vt);
        assertEquals(vt, instance.getVt());
    }

    @Test
    public void testGetLable() {
        System.out.println("getLable");
        WineResponse instance = new WineResponse();
        String expResult = "";
        instance.setLable(expResult);
        String result = instance.getLable();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetLable() {
        System.out.println("setLable");
        String lable = "lable1";
        WineResponse instance = new WineResponse();
        instance.setLable(lable);
        assertEquals(lable, instance.getLable());
    }

    @Test
    public void testGetGrape() {
        System.out.println("getGrape");
        WineResponse instance = new WineResponse();
        String expResult = "NewGrape";
        instance.setGrape(expResult);
        String result = instance.getGrape();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetGrape() {
        System.out.println("setGrape");
        String grape = "grape1";
        WineResponse instance = new WineResponse();
        instance.setGrape(grape);
        assertEquals(grape, instance.getGrape());
    }

    @Test
    public void testGetRegion() {
        System.out.println("getRegion");
        WineResponse instance = new WineResponse();
        String expResult = "Napa";
        instance.setRegion(expResult);
        String result = instance.getRegion();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetRegion() {
        System.out.println("setRegion");
        String region = "Napa";
        WineResponse instance = new WineResponse();
        instance.setRegion(region);
        assertEquals(region, instance.getRegion());
    }

    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        WineResponse instance = new WineResponse();
        String expResult = "abc";
        instance.setCountry(expResult);
        String result = instance.getCountry();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "contry";
        WineResponse instance = new WineResponse();
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }

    @Test
    public void testGetMaker() {
        System.out.println("getMaker");
        WineResponse instance = new WineResponse();
        String expResult = "maker1";
        instance.setMaker(expResult);
        String result = instance.getMaker();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetMaker() {
        System.out.println("setMaker");
        String maker = "maker2";
        WineResponse instance = new WineResponse();
        instance.setMaker(maker);
        assertEquals(maker,instance.getMaker());
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        WineResponse instance = new WineResponse();
        String expResult = "2001";
        instance.setYear(expResult);
        String result = instance.getYear();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetYear() {
        System.out.println("setYear");
        String year = "2002";
        WineResponse instance = new WineResponse();
        instance.setYear(year);
        assertEquals(year, instance.getYear());
    }

    @Test
    public void testGetRating_count() {
        System.out.println("getRating_count");
        WineResponse instance = new WineResponse();
        int expResult = 4;
        instance.setRating_count(expResult);
        int result = instance.getRating_count();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetRating_count() {
        System.out.println("setRating_count");
        int rating_count = 0;
        WineResponse instance = new WineResponse();
        instance.setRating_count(rating_count);
        assertEquals(rating_count, instance.getRating_count());
    }

    @Test
    public void testGetRating() {
        System.out.println("getRating");
        WineResponse instance = new WineResponse();
        float expResult = 0.2F;
        instance.setRating(expResult);
        float result = instance.getRating();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetRating() {
        System.out.println("setRating");
        float rating = 3.0F;
        WineResponse instance = new WineResponse();
        instance.setRating(rating);
        assertEquals(rating, instance.getRating(),0.0);
    }
    
}
