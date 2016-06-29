package com.alexander.lesson5.inheritance;

class A_ extends Object {
	public int a =10;
	A_() {		
		System.out.print("A"+"\n");
	}	
	
	
	void method(){
		System.out.println("A method");
	}
	
	
}

class B extends A_ {
	public int a = 20;
	B(){
		System.out.println("B");
	}
	
	void method(){
		System.out.println("B method");
	}
	
	
}

class D extends Object{
	
}

class C {
	C(){
		System.out.println("C");
	}
	
	void method(){
		System.out.println("c method");
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		//new C();
		A_ c = new B();
		c.method();
		
		
		System.out.println(c.a);
		
				
	}

}
