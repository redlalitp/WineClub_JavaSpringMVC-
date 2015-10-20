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
public class NoteTest {
    
    public NoteTest() {
    }

    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Note instance = new Note("content");
        String expResult = "content";
        String result = instance.getContent();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "test";
        Note instance = new Note("content");
        instance.setContent(content);
        assertEquals(content, instance.getContent());
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Note instance = new Note("content");
        int expResult = IdGenerator.newID()-1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Note instance = new Note("content");
        instance.setId(id);
        
    }

    @Test
    public void testGetDt() {
        System.out.println("getDt");
        Note instance = new Note("content");
        Date expResult = new java.util.Date();
        Date result = instance.getDt();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDt() {
        System.out.println("setDt");
        Date dt = new java.util.Date();
        Note instance = new Note("Content");
        instance.setDt(dt);
        
    }
    
}
