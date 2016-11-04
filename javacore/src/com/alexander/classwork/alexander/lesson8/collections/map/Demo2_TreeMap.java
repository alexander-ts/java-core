package com.alexander.classwork.alexander.lesson8.collections.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo2_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
		Dog d4 = new Dog("white", 10);
 
 
		TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
 
		for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue()); // ???
		}

	}

}
