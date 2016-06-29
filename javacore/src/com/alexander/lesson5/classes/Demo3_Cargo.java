package com.alexander.lesson5.classes;

public class Demo3_Cargo {
	
	private int cargoId;
	private String origin;
	private String destination;
	private double weight;
	
	public Demo3_Cargo() {
		this(10);
	}
	
	public Demo3_Cargo(int cargoId){
		this(10,"KH");
	}
	
	public Demo3_Cargo(int cargoId, String origin){
		this(10,"KH","KH");
	}
	
	public Demo3_Cargo(int cargoId, String origin, String distination){
		this.cargoId = cargoId;
		
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public static Demo6_Order setDemo6(Demo6_Order demo6_Order){
		return demo6_Order;
	}
	
	
	

}
