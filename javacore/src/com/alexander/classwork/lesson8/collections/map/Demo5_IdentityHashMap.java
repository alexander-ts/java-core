package com.alexander.classwork.lesson8.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo5_IdentityHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();

		identityMap.put("sony", "bravia");
		identityMap.put(new String("sony"), "mobile");

		// size of identityMap should be 2 here because two strings are
		// different objects
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);

		identityMap.put("sony", "videogame");

		// size of identityMap still should be 2 because "sony" and "sony" is
		// same object
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);
		
		
		
		
		
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("sony", "bravia");
		map.put(new String("sony"), "mobile");
		map.put("sony", "videogame");

		// size of identityMap should be 2 here because two strings are
		// different objects
		System.out.println("Size of HashMap: " + map.size());
		System.out.println("HashMap: " + map);

	}

}
