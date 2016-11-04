package com.alexander.classwork.lesson11.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Demo4_CalculatorTest {

	private Calculator classUnderTest;

	@Before
	public void setUp() throws Exception {
		System.out.println("create object");
		this.classUnderTest = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("delete calculator");
		classUnderTest = null;
	}

	@Test
	public void testAdd_positiveNumbers_shouldReturnResult() {
		System.out.println("test");
		assertEquals("add", 7, classUnderTest.add(3, 4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdd_negativeNumbers_shouldThrowException() {
		classUnderTest.add(-3, -4);
	}

	@Test
	public void testSubstract() {
		assertEquals("substract", 2, classUnderTest.substract(5, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals("multiply", 56, classUnderTest.multiply(7, 8));
	}
	@Test
	public void testMultiply2() {
		assertEquals("multiply", 884, classUnderTest.multiply(26, 34));
	}
	
	@Test
	public void testMultiply21() {
		assertEquals("multiply", 224, classUnderTest.multiply(16,14));
	}	
	
	@Test
	public void testMultiply3() {
		assertEquals("multiply", 2021, classUnderTest.multiply(43, 47));
	}

	@Test
	public void testSquare() {
		assertEquals("square", 1849, classUnderTest.square(43));

	}
	
	@Test
	public void testSquare2() {
		assertEquals("square", 2209, classUnderTest.square(47));

	}
	
	@Test
	public void testSquare3() {
		assertEquals("square", 121, classUnderTest.square(11));

	}
	
	@Test
	public void testSquare4() {
		assertEquals("square",1156, classUnderTest.square(34));

	}
	
	@Test
	public void testSquare5() {
		assertEquals("square", 3969, classUnderTest.square(63));

	}
	
	@Test
	public void testSquare6() {
		assertEquals("square", 1849, classUnderTest.square(43));

	}
	
	@Test
	public void testSquare7() {
		assertEquals("square", 25, classUnderTest.square(5));
			

	}
	
	
	
	
	

}
