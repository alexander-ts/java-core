package com.alexander.classwork.alexander.lesson3;

import java.util.Scanner;

public class InputOutputExample1 {

	public static void main(String[] args) {
		while(true){
			Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner	
			
			System.out.println("Input integer number1: ");
			int j = sc.nextInt();
			
			System.out.println("Input integer number2: ");
			int i = sc.nextInt();
			
			
			
			
			System.out.println(i * j);
			
		}
		

	}

}
