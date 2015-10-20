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
public class RevenueResponseTest {
    
    public RevenueResponseTest() {
    }

    @Test
    public void testGetUnits_delivered() {
        System.out.println("getUnits_delivered");
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        int expResult = 2;
        int result = instance.getUnits_delivered();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetUnits_delivered() {
        System.out.println("setUnits_delivered");
        int units_delivered = 0;
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        instance.setUnits_delivered(units_delivered);
        assertEquals(units_delivered, instance.getUnits_delivered(), 0.0);
    }

    @Test
    public void testGetUnits_returned() {
        System.out.println("getUnits_returned");
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        int expResult = 0;
        int result = instance.getUnits_returned();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetUnits_returned() {
        System.out.println("setUnits_returned");
        int units_returned = 2;
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        instance.setUnits_returned(units_returned);
        assertEquals(units_returned, instance.getUnits_returned(), 0.0);
    }

    @Test
    public void testGetWine_revenue() {
        System.out.println("getWine_revenue");
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        double expResult = 49.0;
        double result = instance.getWine_revenue();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetWine_revenue() {
        System.out.println("setWine_revenue");
        double wine_revenue = 50.0;
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        instance.setWine_revenue(wine_revenue);
        assertEquals(wine_revenue, instance.getWine_revenue(), 0.0);
    }

    @Test
    public void testGetDelivery_revenue() {
        System.out.println("getDelivery_revenue");
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        double expResult = 99.0;
        double result = instance.getDelivery_revenue();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetDelivery_revenue() {
        System.out.println("setDelivery_revenue");
        double delivery_revenue = 80.0;
        RevenueResponse instance = new RevenueResponse(2,0,49.0,99.0);
        instance.setDelivery_revenue(delivery_revenue);
        assertEquals(delivery_revenue, instance.getDelivery_revenue(), 0.0);
    }
    
}
