package com.alexander.classwork.alexander.lesson8.collections.set;

import java.util.TreeSet;




public class Demo3_Set_Enity {
	
	public static void main(String[] args) {
		
		TreeSet<Order> treeSet = new TreeSet<Order>();
		
		treeSet.add(new Order("Laptop", 13, 45));
		treeSet.add(new Order("Phone", 33, 100));
		treeSet.add(new Order("Car", 1, 1000));
 
		System.out.println(treeSet);// ???
	}

}
