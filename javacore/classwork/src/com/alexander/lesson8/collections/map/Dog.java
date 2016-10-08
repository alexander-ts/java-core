package com.alexander.lesson8.collections.map;

public class Dog implements Comparable<Dog>{
	String color;
	int size;
 
	Dog(String c, int s) {
		color = c;
		size = s;
	}
 
	public String toString(){	
		return color + " dog";
	}
 
	@Override
	public int compareTo(Dog o) {
		return  o.size - this.size;
	}
}
