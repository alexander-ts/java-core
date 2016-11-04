package com.alexander.classwork.lesson4.array;

public class ArrayDemo3 {
	
	
	public static void main(String[] args) {
		
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		
		for (int k = arr.length - 1; k >= 0; k -= 2) {
			System.out.print(arr[k] + " ");
		}
	}

}
