package com.alexander.classwork.alexander.lesson8.collections.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	
	public static void setListElement(Collection list){
		
	}
	
	public static void main(String args[]) {
		
		Collection obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");
		
		setListElement(obj);
		
		System.out.println(obj);

	}

}
