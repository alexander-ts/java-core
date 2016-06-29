package com.alexander.lesson11.junit;

import static org.junit.Assert.assertEquals;

import java.net.*;
import java.util.Arrays;
import java.util.Collesson;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class Demo5_Parameterized {

	private Integer inputNumber;
	private Boolean expectedResult;
	private Demo5_Test primeNumberChecker;

	@Before
	public void initialize() {
		primeNumberChecker = new Demo5_Test();
	}

	public Demo5_Parameterized(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collesson primeNumbers() {
		return Arrays.asList(
				new Object[][] { 
						{ 2, true },
						{ 6, false },
						{ 19, true },
						{ 22, false },
						{ 23, true } });
	}

	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}
}