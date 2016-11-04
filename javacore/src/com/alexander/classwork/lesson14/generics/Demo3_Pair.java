package com.alexander.classwork.lesson14.generics;

public class Demo3_Pair<K, V> {
	
	public K key;
	public V value;
	
	
	
	public Demo3_Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		
	}
	
	

	public Demo3_Pair() {
		super();
	}



	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Demo3_Pair<String, Integer> pair = new Demo3_Pair<String, Integer>("Name", 32);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		
		Demo3_Pair<String, Integer> pair2 = new Demo3_Pair<String, Integer>();
		pair2.setKey("setKey");
		pair2.setValue(12);
		
		System.out.println(pair2.getKey());
		System.out.println(pair2.getValue());
		
		
		
		Demo3_Pair<String, Demo3_Pair<String, Integer>> pair23;
	    Demo3_Pair<String, Demo3_Pair<String, Demo3_Pair<String, Integer>>> pair3;
	    
	}	
	
	
	
	

}
