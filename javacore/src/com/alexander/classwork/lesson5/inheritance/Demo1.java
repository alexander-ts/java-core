package com.alexander.classwork.lesson5.inheritance;

class A {
	A() {		
		this(0);
		System.out.print("A()");
	};

	A(int k) {
		System.out.print("A(int)");
	};
}

public class Demo1 {
	public static void main(String[] args) {
		new A();
	}

}
