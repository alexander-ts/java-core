package com.alexander.lesson11.junit;

public class Calculator {

	public int add(int i, int j) {	
		if(i < 0 && j < 0)
			throw new IllegalArgumentException();
		return i + j;
	}

	public int substract(int i, int j) {		
		return i - j;
	}

	public int multiply(int i, int j) {		
		return i * j;
	}
	
	public int square(int i){
		return i*i;
	}
	
	

}
