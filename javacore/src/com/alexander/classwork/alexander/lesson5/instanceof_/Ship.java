package com.alexander.classwork.alexander.lesson5.instanceof_;

public class Ship extends Vehicle {
	
	private double tonnage;
	private double containerCapacity;
	
	public Ship(String model, double tonnage,
			double containerCapacity) {
		super("Ship", model);
		this.tonnage = tonnage;
		this.containerCapacity = containerCapacity;
	}
	public double getTonnage() {
		return tonnage;
	}
	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}
	public double getContainerCapacity() {
		return containerCapacity;
	}
	public void setContainerCapacity(double containerCapacity) {
		this.containerCapacity = containerCapacity;
	}
	
	
	

}
