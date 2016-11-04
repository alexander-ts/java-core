package com.alexander.classwork.lesson9.hashtable;

import com.alexander.classwork.lesson8.collections.map.EntryMapImpl;

public class Demo_1<Key, Value> {
	
	    private static final int INIT_CAPACITY = 100;
	    private static int N;                                // number of key-value pairs
	    private static int M=2;     							 // hash table size
	    private  EntryMapImpl<String,String>[] map = (EntryMapImpl<String, String>[]) new EntryMapImpl[INIT_CAPACITY];

	// hash value between 0 and M-1
    private  int hash(String key) {
    	System.out.println(key.hashCode());
        return (key.hashCode() & 0x7fffffff) % M;
    } 
    
    public Value get(Key key) {
        //if (key == null) throw new NullPointerException("argument to get() is null");
       // int i = hash(key);
        return null;
    } 
    
    public void put(String key, String val) {
       int i = hash(key);   
       System.out.println(i);
       EntryMapImpl<String,String> entryMapImpl = new EntryMapImpl<String, String>();
       entryMapImpl.setValue(val);
       map[i] = new EntryMapImpl<String,String>();
    } 

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
