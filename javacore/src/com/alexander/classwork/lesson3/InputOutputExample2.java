package com.alexander.classwork.lesson3;

import java.util.Scanner;

public class InputOutputExample2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
	        int i;
	        int j;
	        System.out.print("������� ����� ����� n1: ");
	        
	        if(sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
	          i = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
	          
	          System.out.println("������� ����� ����� n2: ");	          
	          j = sc.nextInt();
	          
	          System.out.println("������ ��������: ");	          
	          
	          
	          
	          
	          System.out.println(i*j);
	          
	        } else {
	          System.out.println("�� ����� �� ����� �����");
	        }

	}

}
