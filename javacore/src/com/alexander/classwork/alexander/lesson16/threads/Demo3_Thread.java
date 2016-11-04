package com.alexander.classwork.alexander.lesson16.threads;

public class Demo3_Thread {

	public String test() {
		return "test";

	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {

			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");

				}
			}.start();
		}

		System.out.println(Thread.currentThread().getName());

		System.out.println(new Demo3_Thread() {
			String name = "tout le monde";

			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		}.test());
	}
	
	
}
