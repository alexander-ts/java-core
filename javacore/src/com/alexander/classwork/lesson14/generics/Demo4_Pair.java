package com.alexander.classwork.lesson14.generics;

public class Demo4_Pair<T1, T2, T3> {
	T1 object1;
	T2 object2;
	T3 object3;

	Demo4_Pair(T1 one, T2 two, T3 three) {
		
		object1 = one;
		object2 = two;
		object3 = three;
	}

	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}

	public static void main(String[] args) {
		//Demo4_Pair<Integer, String> pair = new Demo4_Pair<Integer, String>(6, " Apr");
		
		//System.out.println(pair.getFirst() + pair.getSecond());
		
		Demo4_Pair<Integer, String, String> pair = new Demo4_Pair<>(6, " Apr", null); //error 
		
		//Demo4_Pair<Integer, String> pair2 = new Demo4_Pair<>(6, " Apr"); 
	}
}