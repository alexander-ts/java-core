package com.alexander.classwork.alexander.lesson5.composition;

public class ClassD_Comp {

	ClassA objA = new ClassA();
	ClassB objB = new ClassB();

	public void test() {
		objA.doSomething();
	}

	public void methodA() {
		objA.methodA();
	}

	public void methodB() {
		objB.methodB();
	}

}
