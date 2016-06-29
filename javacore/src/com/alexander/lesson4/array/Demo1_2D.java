package com.alexander.lesson4.array;

import java.util.Arrays;

public class Demo1_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a2D = new int[2][3]; // Two rows and three columns. i =2 j =3;		
		
		int[][] a = { 
						{ 1, 2, 3 },
						{ 4, 0, 0 },
						{ 5, 7, 8 },
						{ 6, 4, 4 },
						{ 5, 6, 5, 9}
				};		
		
		//i- row; j- column		
		for (int i = 0; i < a.length; i++) {
		
			int sum =0;	
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
				sum += a[i][j];
				
			}
			System.out.println("");
			System.out.println(sum);
			
		}		
		
		System.out.println(a.length);
		
		System.out.println(Arrays.deepToString(a));

	}

}
