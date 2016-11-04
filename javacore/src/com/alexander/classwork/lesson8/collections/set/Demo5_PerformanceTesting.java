package com.alexander.classwork.lesson8.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Demo5_PerformanceTesting {

	public static void main(String[] args) {
		
		Random r = new Random();

		/*HashSet<Order> hashSet = new HashSet<Order>();
		TreeSet<Order> treeSet = new TreeSet<Order>();
		LinkedHashSet<Order> linkedSet = new LinkedHashSet<Order>();*/
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();

		// start time
		long startTime = System.currentTimeMillis();
		long t3 = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(x);
		}
		// end time
		long endTime = System.currentTimeMillis();
		//long t32 = System.currentTimeMillis();
		long duration = endTime - startTime;
		//long duration2 = t32 - t3;
		
		System.out.println("HashSet: " + duration);
		//System.out.println("HashSet: " + duration2);

		// start time
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(x);
		}
		
		// end time
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);

		// start time
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(x);
		}
		// end time
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);

	}

}
