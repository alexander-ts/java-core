package com.alexander.classwork.lesson16.threads;

public class Demo4_SleepMessages {

	public static void main(String args[]) {
		
		
		String importantInfo[] = { "Mares eat oats", "Does eat oats",
				"Little lambs eat ivy", "A kid will eat ivy too" };

		
		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 0.4 seconds
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println("Exception");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Print a message
			System.out.println(importantInfo[i]);
		}
	}

}
