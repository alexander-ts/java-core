package com.alexander.classwork.alexander.lesson8.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(12);
		tree.add(13);
		tree.add(60);
		tree.add(34);
		tree.add(45);
		
		System.out.println(tree);
		//show example celling fllor
		System.out.println(tree.ceiling(13));
		System.out.println(tree.floor(45));
		System.out.println(tree.higher(13));
		System.out.println(tree.lower(45));
		
		
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
		
		Set<String> stringset = new TreeSet<String>();	    
		
	    stringset.add("�������");
	    stringset.add("��������");
	    stringset.add("���-�'�����"); 
	    
	    System.out.println(stringset);
	}

}
