package com.alexander.lesson16.threads;

public class Demo1_Runnable implements Runnable {

	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String args[]) {
		(new Thread(new Demo1_Runnable())).start();
	}

}