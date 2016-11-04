package com.alexander.classwork.alexander.lesson14.generics.example;

public class Vehicle {
	
	private String type;	
	private String model;	
	
	public Vehicle(String type, String model) {
		super();
		this.type = type;		
		this.model = model;		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public static void printModel(Vehicle vehicle){
		System.out.println(vehicle.model);
	}
	
	
	public void control(){
		
	}
	

}
