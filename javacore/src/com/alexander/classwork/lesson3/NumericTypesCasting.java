package com.alexander.classwork.lesson3;

public class NumericTypesCasting {
	

	public static void main(String[] args) {
		
		int bigNumber = 1234567890;		
		
		float ratio = 5.8f;
		
		long salary = 2034;
		
		short x = 4355;
		
		
		//int --> float		
		System.out.println("int --> float "+(float) bigNumber);
		
		//int --> long		
		System.out.println("int --> long "+(long) bigNumber);
		
		//short --> int 
		System.out.println("short --> int " + (int) x);
		
		//long --> double 
		System.out.println("long --> double " + (double) salary);
		
		
		
		//int --> double		
		System.out.println("int --> double "+(double) bigNumber);
		long t = (long) bigNumber;
		System.out.println((double) t);
		
		
			

	}

}
