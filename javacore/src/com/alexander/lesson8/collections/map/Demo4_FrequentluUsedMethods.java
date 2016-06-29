package com.alexander.lesson8.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.alexander.lesson8.collections.set.Order;

public class Demo4_FrequentluUsedMethods {
	
	public static void main(String[] args) {
		

		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
		Dog d4 = new Dog("white", 10);
 
 
		TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		System.out.println(treeMap.entrySet());
		
		System.out.println("Frequent Methods");
		
		System.out.println(treeMap);
		System.out.println("put");
		//.... a lot of a's like the following
		if(treeMap.keySet().contains(d1)){
			treeMap.put(d1, treeMap.get(d1)+1);
		}else{
			treeMap.put(d1, 1);
		}
		
		System.out.println(treeMap);
		
		
		Iterator<Entry<Dog, Integer>> it = treeMap.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry pairs = (Map.Entry)it.next();
		    System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
	}

}
