package com.alexander.classwork.alexander.lesson4.sort;

import java.util.Arrays;

public class Demo3_BubbleSort {

	public static void main(String[] args) {

		int[] a = { 0, 1, 10, 7, 30, 40, 100, 8, 50, 20 };
		System.out.print(Arrays.toString(a) + "\n");

		for (int baier = a.length - 1; baier >= 0; baier--) {

			for (int index = 0; index < baier; index++) {

				if (a[index] > a[index + 1]) {

					int tmp = a[index];

					a[index] = a[index + 1];

					a[index + 1] = tmp;
				}
			}			
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));

	}

}
