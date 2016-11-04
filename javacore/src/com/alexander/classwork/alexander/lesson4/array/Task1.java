package com.alexander.classwork.alexander.lesson4.array;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int rows = a.length;  
		//int cols = a[0].length;
		
		int[][] a = { 
				{ 1, 2, 3 },
				{ 4, 0, 0 },				
				{ 6, 4, 6 }
		};	
		
		int sum = 0;
		for (int row = 0; row < a.length; row++) {
			sum += a[row][0];
		}
		System.out.println((double) sum / a.length);	
		
		
		
		double sum2;		
		for (int row = 0; row < a.length; row++) {
			
			sum2 =0;
			for (int col = 0; col < a[row].length; col++) {
				sum2 += a[row][col];		
		
			}
			
			System.out.println("Avrg col sum= "+(sum2/a[row].length));
			
		}

	}

}
