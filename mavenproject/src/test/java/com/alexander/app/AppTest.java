package com.alexander.app;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
	
	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
 
	}
	
	@Test
	public void testPrintHelloWorld2() {
 
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
 
	}
}
