package com.alexander.classwork.alexander.lesson14.generics.example;

public class Example_1 {
	
		
	public static <T extends Comparable> T min(T[] a){
		if(a == null || a.length == 0)
			return null;
		T min = a[0];
		for(int i = 0; i< a.length; i++){
			if(min.compareTo(a[i])>0)
				min = a[i];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
