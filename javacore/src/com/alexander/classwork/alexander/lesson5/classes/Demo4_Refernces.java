package com.alexander.classwork.alexander.lesson5.classes;

public class Demo4_Refernces {

	public static void main(String[] args) {
		
		String st1 = "Hello";
		String st2 = "Hello";
		String st3 = new String("Hello");
		
		System.out.println("st1 == st2:  "+ (st1 == st2));
		System.out.println("st1 == st3:  "+ (st1 == st3));
		
		System.out.println("st1 equals st2:  "+ (st1.equals(st2)));
		System.out.println("st1 equals st3:  "+ (st1.equals(st3)));

	}

}
