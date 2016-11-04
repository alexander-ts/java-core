package com.alexander.classwork.alexander.lesson11.junit;


	
import static org.junit.Assert.assertEquals;
	import java.util.Arrays;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;

	@RunWith(value = Parameterized.class)
	public class Demo6_Parameterized {

		private int numberA;
		private int numberB;
		private int expected;
		private Calculator calculator = new Calculator();

		
		public Demo6_Parameterized(int numberA, int numberB, int expected) {
			this.numberA = numberA;
			this.numberB = numberB;
			this.expected = expected;
		}

		
		@Parameters(name = "{index}: mult({0} * {1})={2}")
		public static Iterable<Object[]> data1() {
			return Arrays.asList(new Object[][] { 
				{ 4,4,16 },
				{ 5,4,20 },
				{2, 43, 86}
				
			});
		}

		/*@Test
		public void test_add() {	
			assertEquals(expected,calculator.add(numberA, numberB));
		}*/

		
		@Test
		public void test_mult() {	
			assertEquals(expected,calculator.multiply(numberA, numberB));
		}
		
		

	

}
