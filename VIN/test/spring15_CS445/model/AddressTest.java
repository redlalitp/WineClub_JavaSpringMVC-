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
public class AddressTest {
    
    public AddressTest() {
    }

    @Test
    public void testGetState() {
        System.out.println("getState");
        Address instance = new Address();
        String expResult = "Anystate";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetState() {
        System.out.println("setState");
        String state = "IL";
        Address instance = new Address();
        instance.setState(state);
        assertEquals(state, instance.getState());
    }

    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Address instance = new Address();
        String expResult = "123 Main ST, Apt 2F";
        String result = instance.getStreet();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "abc";
        Address instance = new Address();
        instance.setStreet(street);
        assertEquals(street, instance.getStreet());
    }

    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address();
        String expResult = "Anytown";
        String result = instance.getCity();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Chicago";
        Address instance = new Address();
        instance.setCity(city);
        assertEquals(city, instance.getCity());
    }

    @Test
    public void testGetZip() {
        System.out.println("getZip");
        Address instance = new Address();
        String expResult = "12345";
        String result = instance.getZip();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetZip() {
        System.out.println("setZip");
        String zip = "60616";
        Address instance = new Address();
        instance.setZip(zip);
        assertEquals(zip, instance.getZip());
    }
    
}
