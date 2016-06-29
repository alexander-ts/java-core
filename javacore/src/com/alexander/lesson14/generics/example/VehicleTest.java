package com.alexander.lesson14.generics.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 copy
		ArrayList<LandVehicle> src = new ArrayList<LandVehicle>();
		ArrayList<LandVehicle> dest = new ArrayList<LandVehicle>();
		Collections.copy(dest, src);
		for(LandVehicle lv: dest)lv.ride();
		
		//2 copy
		ArrayList<Car> producer_cars = new ArrayList<Car>();
		//ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		ArrayList<LandVehicle> consumer_land_vehicle = new ArrayList<LandVehicle>();
		Collections.copy(consumer_land_vehicle, producer_cars);
		
		for(LandVehicle lv: consumer_land_vehicle)lv.ride();//we can do it but we missed info about cars
		
		
		//3 copy
		ArrayList<Car> producer_cars_2 = new ArrayList<Car>();
		ArrayList<Submarine> consumer_submarines = new ArrayList<Submarine>();
		Collections.copy(consumer_submarines, producer_cars_2);//we cannot copy cars to submarine list and dive them
		
		for(Submarine sub: consumer_submarines)sub.dive();
		
		
		//4 
		ArrayList<? super LandVehicle> subLandVehicles = new ArrayList<>();
		Car car= new Car("Mech", "i5");
		LandVehicle landVehicle = new LandVehicle("", "");
		Vehicle vehicle = new Vehicle("", "");
		subLandVehicles.add(car);
		subLandVehicles.add(landVehicle);
		subLandVehicles.add(vehicle);
		
		Van van =  new Van("", "");
		Motorcycle motorcycle = new Motorcycle("", "");
		
		ArrayList<? super Car> superCar = new ArrayList<>();
		superCar.add(vehicle);
		superCar.add(landVehicle);
		superCar.add(car);
		superCar.add(van);
		
		ArrayList<? extends Car> subCar = new ArrayList<>();
		subCar.add(vehicle));
		subCar.add(landVehicle);
		subCar.add(car);
		subCar.add(van);
		subCar.add(null);
		subCar.add(new Object());
	
		
		
		
		
		

	}
	
	
	public <T> void add(T x) {
		System.out.println(x.getClass().getName());
	}

}
