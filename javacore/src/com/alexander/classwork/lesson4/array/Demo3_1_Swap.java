package com.alexander.classwork.lesson4.array;

import java.util.Arrays;

public class Demo3_1_Swap {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.print(Arrays.toString(a) + " -> ");

		int tmp = a[0];

		a[0] = a[1];

		a[1] = tmp;
		

		System.out.println(Arrays.toString(a));

	}

}
