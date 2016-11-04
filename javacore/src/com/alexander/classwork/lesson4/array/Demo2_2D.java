package com.alexander.classwork.lesson4.array;

import java.util.Arrays;

public class Demo2_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { 
						{ 4, 2, 8 }, 
						{ 3, 1, 5 } 
					};

		int rows = a.length;
		int cols = a[0].length;

		System.out.println("Here are the " + (rows * cols) + " integers in a "
				+ rows + "x" + cols + " 2d-array:");
		
		System.out.println(Arrays.deepToString(a));

	}

}
