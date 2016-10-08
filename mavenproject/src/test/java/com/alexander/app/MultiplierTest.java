package com.alexander.app;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest extends Multiplier
{
	   /** No-arguments constructor. */
	   public MultiplierTest() {}

	   @Test
	   public void testMultiplyTwoIntegers()
	   {
	      final int expectedProduct = 300;
	      final int resultProduct = multiply(3,5, 4, 5 );
	      Assert.assertEquals(
	         "Product of multiplication of two integers does not match.",
	         expectedProduct, resultProduct);
	   }

	   @Test
	   public void testMultiplyTwoNegativeIntegers()
	   {
	      final int expectedProduct = 20;
	      final int resultProduct = multiply(-4,-5);
	      Assert.assertEquals(
	         "Product of multiplication of two negative integers does not match.",
	         expectedProduct, resultProduct);
	   }

	   @Test
	   public void testMultiplyTwoMixedSignIntegers()
	   {
	      final int expectedProduct = -12;
	      final int resultProduct = multiply(-3,4);
	      Assert.assertEquals(
	         "Product of multiplication of two integers of mixed sign does not match.",
	         expectedProduct, resultProduct);
	   }
	}