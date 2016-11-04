package com.alexander.classwork.alexander.lesson8.collections.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.alexander.classwork.alexander.lesson8.collections.set.Order;

public class Demo3_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order d1 = new Order("Laptop1", 13, 45);
		Order d2 = new Order("Laptop2", 143, 45);
		Order d3 = new Order("Laptop3", 1, 45);
		Order d4 = new Order("Laptop4", 1, 45);
 
		LinkedHashMap<Order, Integer> linkedHashMap = new LinkedHashMap<Order, Integer>();
		linkedHashMap.put(d1, 10);
		linkedHashMap.put(d2, 15);
		linkedHashMap.put(d3, 5);
		linkedHashMap.put(d4, 20);		
 
		for (Entry<Order, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}		

	}

}
