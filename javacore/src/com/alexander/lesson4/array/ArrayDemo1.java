package com.alexander.lesson4.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] a;
		double[] ar1;
		double ar2[];

		a = new int[10]; // ������ �� 10 ��������� ���� int
		System.out.println(a[0]);
		int n = 5;
		ar1 = new double[n]; // ������ �� 5 ��������� double

		for (int i = 0; i < ar1.length; i++) {

			ar1[i] = Math.floor(Math.random() * 100);
			System.out.print(ar1[i] + "  ");
		}

	}

}
