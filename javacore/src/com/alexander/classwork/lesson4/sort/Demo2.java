package com.alexander.classwork.lesson4.sort;

import java.util.Arrays;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int[] a = { 100, 1, 10, 7, 30, 40, 4, 8, 50, 0 };
		
		System.out.print(Arrays.toString(a) + "\n");
		
		for (int k = 0; k < a.length - 1; k++) {
			
			if (a[k] > a[k + 1]) {
				int tmp = a[k];
				a[k] = a[k + 1];
				a[k + 1] = tmp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
