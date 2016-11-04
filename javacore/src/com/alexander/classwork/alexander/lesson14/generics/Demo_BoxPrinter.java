package com.alexander.classwork.alexander.lesson14.generics;

public class Demo_BoxPrinter {
	private Object val;

	public Demo_BoxPrinter(Object arg) {
		val = arg;
	}

	public String toString() {
		return "{" + val + "}";
	}

	public Object getValue() {
		return val;
	}
	
	public static void main(String[] args) {
		Demo_BoxPrinter value1 = new Demo_BoxPrinter(new Integer(10));
		System.out.println(value1);
		
		Integer intValue1 = (Integer) value1.getValue();
		System.out.println(intValue1);
		
		Demo_BoxPrinter value2 = new Demo_BoxPrinter("Hello world");
		System.out.println(value2);		
		
		// Error !!!! 
		Integer intValue2 = (Integer) value2.getValue();
	}
}