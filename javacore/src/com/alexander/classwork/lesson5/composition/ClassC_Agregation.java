package com.alexander.classwork.lesson5.composition;

public class ClassC_Agregation {

	SuperClass obj = null;
	ClassB b = null;
	ClassA a = null;//composition
	

	public ClassC_Agregation(SuperClass o, SuperClass o2) {
		this.a = (ClassA) o;
		this.b = (ClassB) o2;//agregation
	}

	public void test() {
		//obj.doSomething();
		a.doSomething();
		b.doSomething();
		//obj2.methodB();
	}
	
	
	

	public void setB(ClassB b) {
		this.b = b;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

	public static void main(String args[]) {
		
		ClassC_Agregation obj1 = new ClassC_Agregation(new ClassA(), new ClassB());
		//ClassC_Composition obj2 = new ClassC_Composition(new ClassB());

		obj1.test();
		
	//	obj2.test();
	}

}
