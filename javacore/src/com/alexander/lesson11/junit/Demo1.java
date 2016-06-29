package com.alexander.lesson11.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo1 {
	
	private ArrayList<String> collection;
	 
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }
 
    @After
    public void tearDown() {
        collection.clear();
        System.out.println("@After - tearDown");
    }
 
    @Test
    public void testEmptycollection() {
        assertTrue(collection.isEmpty());
       
        System.out.println("@Test - testEmptycollection");
    }
 
    @Test
    public void testOneItemcollection() {
        collection.add("itemA");
       
        assertEquals(1, collection.size());
        assertEquals("itemA", collection.get(0));
        System.out.println("@Test - testOneItemcollection");
    }
}

	

