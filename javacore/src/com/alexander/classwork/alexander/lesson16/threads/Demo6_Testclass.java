package com.alexander.classwork.alexander.lesson16.threads;

public class Demo6_Testclass {

	public static void main(String args[]) {

		Demo6_ThreadDemo T1 = new Demo6_ThreadDemo("Thread-1");
		T1.start();

		Demo6_ThreadDemo T2 = new Demo6_ThreadDemo("Thread-2");
		T2.start();
	}

}
