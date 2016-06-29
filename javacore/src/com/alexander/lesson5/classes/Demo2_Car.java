package com.alexander.lesson5.classes;

public class Demo2_Car {
	
	public int maxSpeed; 
	public int currentSpeed; 
	public String vendor; 
	public String model; 
	public Wheel[] wheel;

	
	private final int speedOnSteep = 5;

	
	public Demo2_Car(int maxSp, String vend, String model, Wheel w) {		
		maxSpeed = maxSp;
		vendor = vend;
		this.model = model; //���������� ������ this �� ������� ������
		this.wheel = new Wheel[4];	
		wheel[0] = w;
		wheel[1] = w;
	}
	
	public void showDescription() {
		System.out.println("Vendor: " + vendor + 
		"\nModel:"  + model + "\nCurrentSpeed: " + 		maxSpeed); 
	}
	
	

}
