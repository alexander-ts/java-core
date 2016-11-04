package com.alexander.classwork.lesson5.instanceof_;


public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = new Vehicle("Flight", "B747");

		Vehicle vehicle2 = new Vehicle("Car", "M7");
		
		Vehicle car4 = new Car("test", 0, 0, "test");

		Car car = new Car("M5", 220, 100, "BMW");

		Ship ship = new Ship("SH45", 45, 313);
		//A a = new A("test", 4, 5, "test");

		System.out.println(car instanceof Vehicle);
		System.out.println(ship instanceof Vehicle);
		System.out.println(vehicle1 instanceof Car);
		//System.out.println(a instanceof Vehicle);

		// Car --> Superclass; Up casting
		Vehicle vehicle3 = (Vehicle) car;

		System.out.println(vehicle3.getModel());
		

		// Superclass --> Car; Down casting
		//Car car2 = (Car) vehicle2;  // Compile Error

		Vehicle vehicle4 = new Car("M7", 220, 100, "BMW");

		// Superclass --> Car; Down casting
		Car car3 = (Car) vehicle4;

		Vehicle.printModel(ship);
		Vehicle.printModel(car);

	}

}
