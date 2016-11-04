package com.alexander.classwork.alexander.lesson3;

import java.math.BigDecimal;

public class DataTypes {
	
	
	public static void main(String[] args) {	
		
		int numberCars = (int) 5.8;		
		int vacationDays = 24;
		
		float ratio = 5.8f;
		
		double salary = 15000;	
		
		double fiveFourths = 5.0 / 4.0;
		
		boolean flag = false;
		
		System.out.println("Number of Cars: "+numberCars);
		System.out.println("Vacation Days: " +vacationDays);
		System.out.println("Salary: "+salary);
		System.out.println(ratio);
		
		BigDecimal d1 = new BigDecimal("1.03");
		BigDecimal d2 = new BigDecimal("0.42");
		System.out.println(d1.subtract(d2)); // ����������� 0.61
		System.out.println(d2.ROUND_DOWN);
		
		
		

	}

}
