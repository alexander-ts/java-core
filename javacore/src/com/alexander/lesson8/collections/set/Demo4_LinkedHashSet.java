package com.alexander.lesson8.collections.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo4_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Order> treeSet = new LinkedHashSet<Order>();
		
		treeSet.add(new Order("Laptop", 3, 45));
		treeSet.add(new Order("Phone", 3, 100));
		treeSet.add(new Order("Car", 1, 1000));

		System.out.println(treeSet);// ???

	}

}
