package com.alexander.classwork.lesson5.classes;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1_Car bmw = new Demo1_Car();
		bmw.showDescription();	
		
		
		
		Wheel w = new Wheel();
		Demo2_Car bmw2 = new Demo2_Car(340, "BMW", "M5", w);
		bmw2.showDescription();

	}

}
