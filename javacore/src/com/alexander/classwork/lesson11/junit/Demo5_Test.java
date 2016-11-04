package com.alexander.classwork.lesson11.junit;

public class Demo5_Test {
	
	public Boolean validate(final Integer primeNumber) {
	      for (int i = 2; i < (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
}
