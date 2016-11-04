package com.alexander.classwork.alexander.lesson5.instanceof_;

class A {
	int i, j;

	public void draw() {
		System.out.println("1");
	}

	public void draw1() {
		System.out.println("2");
	}
}

class B {
	int i, j;

	public void draw() {
		System.out.println("3");
	}

	public void draw2() {
		System.out.println("4");
	}
}


class C extends A {
	int k;
}

class D extends A {
	int k;
}

public class Demo1 {
	
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		if (a instanceof A)
			System.out.println("a is instance of A");
		if (b instanceof B)
			System.out.println("b is instance of B");
		if (c instanceof C)
			System.out.println("c is instance of C");
		if (c instanceof A)
			System.out.println("c can be cast to A");
		if (a instanceof C)
			System.out.println("a can be cast to C");
		System.out.println();
		// compare types of derived types
		
		A a1 = new C();
		
		C c1 = (C)a1;
		
		
		//C cc = (C) new A(); 

	}
}