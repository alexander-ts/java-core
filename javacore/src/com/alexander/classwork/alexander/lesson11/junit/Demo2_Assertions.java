package com.alexander.classwork.alexander.lesson11.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Demo2_Assertions {

	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = { "one", "two", "three", "null" };
		String[] resultArray = { "one", "two", "three", "test" };
		ArrayList list = new ArrayList<String>();
		list.add("test");
		
		ArrayList list2 = new ArrayList<String>();
		list2.add("test");

		// Check that two objects are equal
		assertEquals(str1, str2);

		// Check that a condition is true
		assertTrue(val1 < val2);

		// Check that a condition is false
		assertFalse(val1 > val2);

		// Check that an object isn't null
		assertNotNull(str1);

		// Check that an object is null
		assertNull(str3);

		// Check if two object references point to the same object
		assertSame(str4, str5);

		// Check if two object references not point to the same object
		assertNotSame(str1, str3);

		// Check whether two arrays are equal to each other.
		assertArrayEquals(expectedArray, resultArray);
		
	}

}
