package com.alexander.lesson8.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.alexander.lesson8.collections.list.LinkedList_1;

public class Demo1 {
	
	 public static void main(String[] args) {
	        Set<String> set = new HashSet<String>();
	        
	        System.out.println(set.add("f"));
	        System.out.println(set.add("d"));
	        System.out.println(set.add("d"));
	        System.out.println(set.add("a"));
	        
	        System.out.println(set);
	        
	        System.out.println(set.remove("d"));
	        
	        System.out.println(set);
	        
	        
	    }

}
