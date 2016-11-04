package com.alexander.classwork.lesson3;

public class BitwiseOperators {
	

	public static void main(String[] args) {
	/*	- ������� ���������
		& ����������� �
		| ����������� ���
		^ ����������� ����������� ���
		<< ����� ����� �����
		>> ����� ����� ������
		>>> ����� ����� ������ � ����������� �������� ���� �����
		&=, | =, ^=, <<=, >>=, >>>= ���������� � ����������� ���������*/
		
		
		int a = 6; // 110
		int b = 4; // 100
		
		// Bitwise AND
		int c = a & b;

		//   110
		// & 100
		// -----
		//   100

		// Bitwise OR
		int d = a | b;
		//   110
		// | 100
		// -----
		//   110	
		
		
		//   110
		// ^ 100
		// -----
		//   010
		int e = a ^ b;

		System.out.println("a & b =" + c); // 4
		System.out.println("a | b = " +d); // 6		
		System.out.println("a ^ b = " +e); // 2

	}

}
