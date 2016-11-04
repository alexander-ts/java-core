package com.alexander.classwork.lesson5.interfaces.demo2;

//interface I1 {
//
//	void methodI1();
//}
//
//interface I2  {
//
//	void methodI1();
//	void methodI2();
//}
//
//
//class A1 implements I1, I2 {
//
//	@Override
//	public void methodI2() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void methodI1() {
//		// TODO Auto-generated method stub
//
//	}
//
//
//
//}
//
//class B1 extends A1 implements I2 {
//
//	public void methodI1() {
//		System.out.println("I am in methodI1 of class B1");
//	}
//
//	public void methodI2() {
//		System.out.println("I am in methodI2 of class B1");
//	}
//}
//
//public class Demo2_Conflict {
//	public static void main(String[] args) {
//		I1 i1 = new B1();
//		i1.methodI1(); // OK as methodI1 is present in B1
//
//		//i1.methodI2();// Compilation error as methodI2 not present in I1
//
//		((com.alexander.classwork.lesson5.interfaces.demo2.I2) i1).methodI2();
//
//		I2 i2 = new B1();
//		i2.methodI1(); // OK
//		i2.methodI2(); // OK
//
//	}
//}
