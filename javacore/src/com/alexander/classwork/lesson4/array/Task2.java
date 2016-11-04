package com.alexander.classwork.lesson4.array;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		// Create an array with room for 100 integers
		int[] nums = new int[100];

		// Fill it with numbers using a for-loop
		for (int i = 0; i < nums.length; i++)
		    nums[i] = i + 1;  // +1 since we want 1-100 and not 0-99

		// Compute sum
		int sum = 0;
		for (int n : nums)
		    sum += n;

		
		System.out.println(sum);
		
		
		
		
		
		//-----------------------------------------
		
		int[] a1 = new int[50];
		int[] a2 = new int[50];
		int[] temp = new int[50];
		
		a1 = Arrays.copyOfRange(nums, 0, 50);
		a2 = Arrays.copyOfRange(nums, 50, 100);
		
		System.out.println(Arrays.toString(a1));
		
		for (int i = a2.length-1, j=0; i >= 0; i--, j++) {
			temp[j] = a2[i];			
		}		
		System.out.println(Arrays.toString(temp));
		
		for (int i = 0; i < temp.length; i++) {
			sum = a1[i]+temp[i];
		}
		System.out.println(sum*50);
	}

}
