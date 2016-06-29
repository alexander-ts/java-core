package com.alexander.lesson5.inheritance;

class D{
	D(int i){
		System.out.println("D");
	}
	
	
		
}

class E extends D{
	E(){
		super(9);
		System.out.println("E");
	}
	
	
}

public class Demo3_Super {
	public static void main(String[] args) {
		new E();
				
	}

}
