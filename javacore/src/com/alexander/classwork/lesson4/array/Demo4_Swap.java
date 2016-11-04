package com.alexander.classwork.lesson4.array;

import java.util.Arrays;

public class Demo4_Swap {

	  public static void swap(int[][] a, int i0, int j0, int i1, int j1) {
		    int temp = a[i0][j0];
		    
		    a[i0][j0] = a[i1][j1];
		    
		    a[i1][j1] = temp;
		  }
	  
		  public static void main(String[] args) {
			  
		    int[][] a = { { 3, 4, 2 },
		                  { 2, 6, 8 },
		                  { 9, 5, 1 }
		                };
		    System.out.println(Arrays.deepToString(a));
		    
		    swap(a,0,1,2,0); // swap a[0][1] with a[2][0]
		    
		    System.out.println(Arrays.deepToString(a));
		  }
		}


