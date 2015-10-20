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
public class SubscriberTest {
    
	Subscriber instance = new Subscriber();
    
	Subscriber instance1 = new Subscriber("user","user@work.com","1234567890",new Address());
	Subscriber instance2 = new Subscriber("user","user@work.com","1234567890",new Address(),"fbHandle","twHandle");
	Subscriber instance3 = new Subscriber("user","user@work.com","1234567890");
	
    public SubscriberTest() {
    }

    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        String kw = "";
        boolean expResult = true;
        boolean result = instance.isMatch(kw);
        assertEquals(expResult, result);
        
    }

    

    @Test
    public void testUpdateInfo() {
        System.out.println("updateInfo");
        String name = "";
        String email = "";
        String phone = "";
        instance.updateInfo(name, email, phone);
        
    }

    @Test
    public void testGetPreference() {
        System.out.println("getPreference");
        MonthlySelectionType expResult = MonthlySelectionType.RW;
        MonthlySelectionType result = instance.getPreference();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPreference() {
        System.out.println("setPreference");
        MonthlySelectionType t = null;
        instance.setPreference(t);
        
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        String expResult = "1234567890";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        instance.setPhone(phone);
        
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Jane Doe";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        instance.setName(name);
        
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "jane.doe@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        instance.setEmail(email);
        
    }

    @Test
    public void testGetShipmentList() {
        System.out.println("getShipmentList");
        List<Shipment> expResult = new ArrayList<Shipment>();
        List<Shipment> result = instance.getShipmentList();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetShipmentList() {
        System.out.println("setShipmentList");
        List<Shipment> shipmentList = null;
        instance.setShipmentList(shipmentList);
        
    }
    
}
