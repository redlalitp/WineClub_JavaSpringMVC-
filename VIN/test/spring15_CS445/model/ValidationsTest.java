/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring15_CS445.model;

import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lalit
 */
public class ValidationsTest {
	 Collection<Subscriber> subs = VinClub.subs;
     Subscriber s = new Subscriber();
     Address a = new Address();
    public ValidationsTest() {
    }

    @Test
    public void testUserHasAccount() {
        System.out.println("userHasAccount");
       
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.userHasAccount(subs, s);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testAddressInBannedState() {
        System.out.println("addressInBannedState");
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.addressInBannedState(a);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testIsInvalidName() {
        System.out.println("isInvalidName");
        String s = "";
        Validations instance = new Validations();
        boolean expResult = true;
        boolean result = instance.isInvalidName(s);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsInvalidEmail() {
        System.out.println("isInvalidEmail");
        String s = "";
        Validations instance = new Validations();
        boolean expResult = true;
        boolean result = instance.isInvalidEmail(s);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsInvalidStreet() {
        System.out.println("isInvalidStreet");
        Validations instance = new Validations();
        boolean expResult = true;
        boolean result = instance.isInvalidStreet(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsInvalidCity() {
        System.out.println("isInvalidCity");
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.isInvalidCity(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsInvalidZipCode() {
        System.out.println("isInvalidZipCode");
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.isInvalidZipCode(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsInvalidPhone() {
        System.out.println("isInvalidPhone");
        String s = "";
        Validations instance = new Validations();
        boolean expResult = true;
        boolean result = instance.isInvalidPhone(s);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsblank() {
        System.out.println("isblank");
        String str = "abc";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.isblank(str);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsASubscriber() {
        System.out.println("isASubscriber");
        int sid = 0;
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.isASubscriber(sid, subs);
        assertEquals(expResult, result);
        
    }
    
}
