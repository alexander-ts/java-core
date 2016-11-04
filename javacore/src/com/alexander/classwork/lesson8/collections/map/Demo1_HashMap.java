package com.alexander.classwork.lesson8.collections.map;

import java.util.HashMap;

import com.alexander.classwork.lesson8.collections.set.Order;

public class Demo1_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Order, Integer> map = new HashMap<Order, Integer>();

		System.out.println(map.put(new Order("Laptop", 13, 45),  10));
		System.out.println(map.put(new Order("TV", 3, 45),       25));
		System.out.println(map.put(new Order("Car", 23, 45),     30));
		System.out.println(map.put(new Order("Mobile", 33, 45),  40));
		System.out.println(map.put(new Order("Mobile", 33, 45),  41));
 
		System.out.println(map);

		System.out.println(map.remove(new Order("Laptop", 13, 45)));

		System.out.println(map);
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println("test");
		System.out.println(map.entrySet());

	}

}
