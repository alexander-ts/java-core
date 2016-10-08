package com.alexander.app;

public class Sum {

	public Sum() {}

	  
	   public int add(final int augend, final int addend, final int ... addends)
	   {
	      int sum = augend + addend;
	      for (final int individualAddend : addends)
	      {
	         sum += individualAddend;
	      }
	      return sum;
	   }
	}

