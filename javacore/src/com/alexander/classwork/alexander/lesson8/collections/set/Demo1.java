package com.alexander.classwork.alexander.lesson8.collections.set;

import java.util.HashSet;
import java.util.Set;

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
