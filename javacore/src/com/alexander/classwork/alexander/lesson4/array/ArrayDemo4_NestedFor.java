package com.alexander.classwork.alexander.lesson4.array;

public class ArrayDemo4_NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {   //i - rows
		
			for (int j = 0; j < 5; j++) {  //j - columns
				
				if(j == 3)
					break;
				System.out.print("(" + i + "," + j + ") ");
			}			
			System.out.println("");
		}
		//System.out.println("");

	}

}
