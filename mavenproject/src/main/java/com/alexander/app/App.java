package com.alexander.app;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
    
    public static String getHelloWorld() {
    	 
		return "Hello World";
 
	}
 
	public static String getHelloWorld2() {
 
		return "Hello World 2";
 
	}
}
