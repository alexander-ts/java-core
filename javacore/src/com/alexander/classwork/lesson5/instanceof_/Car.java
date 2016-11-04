package com.alexander.classwork.lesson5.instanceof_;

public class Car extends Vehicle {

	private int maxSpeed;
	private int currentSpeed;
	private String vendor;

	public Car(String model, int maxSpeed, int currentSpeed, String vendor) {

		super("Car", model);

		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.vendor = vendor;
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	

}
