package com.alexander.classwork.lesson11.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;



public class Demo3_Annotation {
	// execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	// execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute before test
	@Before
	public void before() {
		System.out.println("in before");
	}

	// execute after test
	@After
	public void after() {
		System.out.println("in after");
	}

	// test case
	@org.junit.Test
	public void test() {
		System.out.println("in test");
	}

	// test case ignore and will not execute
	@Ignore
	@org.junit.Test
	public void ignoreTest() {
		System.out.println("in ignore test");
	}

}
