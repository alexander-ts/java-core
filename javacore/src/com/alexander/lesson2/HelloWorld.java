package com.alexander.lesson2;

public class HelloWorld {
	
	

	public static String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public static void main(String[] args) {		
		System.out.println("Hello World");
		
		HelloWorld hello = new HelloWorld();
		hello.setName("TEST");
		
		System.out.println(name);
		
		
		
	}
}
