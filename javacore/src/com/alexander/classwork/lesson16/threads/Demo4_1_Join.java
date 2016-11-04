package com.alexander.classwork.lesson16.threads;

public class Demo4_1_Join {
	public static int N;
	public static volatile int K;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i =0; i< 100; i++){
					K++;
					System.out.println(N);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread 1 Finished");
			}
		});
		t1.start();	
			
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i =0; i< 100000; i++){
					K++;
				}
				System.out.println("Thread 2 Finished");
			}
		});
		t2.start();		
		t1.join();
		t2.join();
		
		Thread.sleep(100);
		System.out.println("Test"+N);

	}
}
