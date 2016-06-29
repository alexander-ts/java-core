package com.alexander.lesson5.classes;

public class Demo5 {
	public int a;
	public int b;
	
	public Demo5(int a, int b) {
		this.a = a;
		this.b = b;		
		System.out.println("a = "+ a+ " b="+b);	
		
	}
	

	public static void main(String[] args) {
		
		Demo5 d5 = new Demo5(2, 4);
		
		System.out.println("a= "+d5.a+" b="+d5.b);
		

	}

}
