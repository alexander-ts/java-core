package com.alexander.classwork.alexander.lesson11.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Demo0_Mock_Interface {
	private static final String HELLO_WORLD = "Hello2";

	@Test
	public void fooGreets() {
		Demo0_Int demo = mock(Demo0_Int.class);
		when(demo.greet()).thenReturn(HELLO_WORLD);
		System.out.println("Demo greets: " + demo.greet());
		assertEquals(demo.greet(), "hello");
	}

}
