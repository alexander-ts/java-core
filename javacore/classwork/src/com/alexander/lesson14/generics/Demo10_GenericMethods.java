package com.alexander.lesson14.generics;



public class Demo10_GenericMethods {

	
	public Demo10_GenericMethods() {
		
	}
	
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		Demo10_GenericMethods gm = new Demo10_GenericMethods();
		Class testClass = gm.getClass();
		
		System.out.println(testClass.getDeclaredMethods().length);
		
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}
}