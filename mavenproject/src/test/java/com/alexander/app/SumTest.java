package com.alexander.app;

import org.junit.Assert;
import org.junit.Test;

import com.alexander.app.Sum;

public class SumTest extends Sum {

	@Test
	public void testAddWithTwoAddends() {
		final int expectedSum = 7;
		final int resultSum = add(3, 4);
		Assert.assertEquals(
				"Sum of two added integers does not match expected result.",
				expectedSum, resultSum);
	}

	@Test
	public void testAddWithThreeAddends() {
		final int expectedSum = 11;
		final int resultSum = add(3, 4, 4);
		Assert.assertEquals(
				"Sum of three added integers does not match expected result.",
				expectedSum, resultSum);
	}

	@Test
	public void testAddWithFourAddends() {
		final int expectedSum = 18;
		final int resultSum = add(3, 4, 6 , 5);
		Assert.assertEquals(
				"Sum of four added integers does not match expected result.",
				expectedSum, resultSum);
	}

	@Test
	public void testAddWithTwoNegativeNumbers() {
		final int expectedSum = -10;
		final int resultSum = add(-6, -4);
		Assert.assertEquals(
				"Sum of two negative integers does not match expected result.",
				expectedSum, resultSum);
	}

	

}
