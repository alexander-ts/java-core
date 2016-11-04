package com.alexander.classwork.alexander.lesson5.object_;

public class TestStatic {
	
	public int i1;
	public static int i2;
	
	TestStatic(){
		i1++;
		i2++;
	}
	
	public static void main(String[] args){
		
		TestStatic o1 = new TestStatic();
		TestStatic o2 = new TestStatic();
		TestStatic o3 = new TestStatic();
		TestStatic o4 = new TestStatic();
		TestStatic o5 = new TestStatic();
				
		
		System.out.println(o1.i1);
		System.out.println(o1.i2);
	
		
		
		
		
		System.out.println(o2.i1);
		System.out.println(o2.i2);
		
		
	}

}
