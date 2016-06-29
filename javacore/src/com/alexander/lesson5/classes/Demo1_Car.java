package com.alexander.lesson5.classes;

public class Demo1_Car {
	
	public int maxSpeed; 
	public int currentSpeed; 
	public String vendor; 
	public String model; 
	
	private final static int speedOnSteep = 5;
	
	
	
	public void stepOn() {
		int a = 0;
		if (currentSpeed + speedOnSteep <= maxSpeed) {
			currentSpeed += speedOnSteep;
		}
						
	}
	
	public void showDescription() {
		System.out.println("Vendor: " + vendor + 
		"\nModel:"  + model + "\nCurrentSpeed: " + 		currentSpeed); 
	}


}
