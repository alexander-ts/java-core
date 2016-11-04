package com.alexander.classwork.alexander.lesson16.threads;

public class Demo5_TestClass {

	public static void main(String args[]) {

		Demo5_RunnableDemo R1 = new Demo5_RunnableDemo("Thread-1");
		R1.start();

		Demo5_RunnableDemo R2 = new Demo5_RunnableDemo("Thread-2");
		R2.start();
	}

}
