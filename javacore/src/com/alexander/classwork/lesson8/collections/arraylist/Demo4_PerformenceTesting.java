package com.alexander.classwork.lesson8.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Demo4_PerformenceTesting {
public static void main(String[] args) {
		
		Random r = new Random();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		
		

		// start time
		long startTime = System.currentTimeMillis();
		
		

		for (int i = 0; i < 1_000_000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			arrayList.add(x);
		}
		// end time
		long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		
		System.out.println("ArrayList: " + duration);
		
		// start time
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedList.add(x);
		}
		
		// end time
		long endTime2 = System.currentTimeMillis();
		long duration2 = endTime2 - startTime2;
		System.out.println("LinkedList: " + duration2);		

	}

}
