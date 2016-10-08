package com.alexander.lesson14.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo_Wildcards {

	static void printList(List<?> list) {
		for (Object l : list)
			System.out.println("{" + l + "}");
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		
		printList(list);
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		
		printList(strList);
		
		List<?> intList = new ArrayList<Integer>(); 
		intList.add(new Integer(10)); 
		intList.add(new Float(10.0f)); 
	}

}
