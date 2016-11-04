package com.alexander.classwork.alexander.lesson4.array;

import java.util.Arrays;

public class Demo6_equals {
	
	 public static void main(String[] args) {
		    int[][] a = { { 4, 2, 8 },
		                  { 3, 1, 5 }
		                };
		    int[][] b = { { 4, 2, 8 },
		                  { 3, 1, 5 }
		                };
		    int [] a1 = {1,3,4};
		    int [] a2 = {1,3,7};
		    System.out.println(Arrays.equals(a,b));  
		    System.out.println(Arrays.deepEquals(a,b));
		    System.out.println(Arrays.equals(a1, a2));
		  }

}
