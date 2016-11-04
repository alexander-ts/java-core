package com.alexander.classwork.lesson4.sort;

public class Demo7_Recursion {
	
	public static int fibonacci(int i){
		if(i == 0) return 0;
		if(i == 1) return 1;
		return fibonacci(i-1) + fibonacci(i-2);
	}
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(6));

	}

}
