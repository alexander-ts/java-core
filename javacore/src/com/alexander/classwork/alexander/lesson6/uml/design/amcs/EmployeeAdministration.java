package com.alexander.classwork.alexander.lesson6.uml.design.amcs;

public class EmployeeAdministration {
	
	private int i = 0;

	public void showEmployees(Employee[] employees) {
		System.out.println("Employees List:");
		
		for (i = 0; i < employees.length; i++) {
			
			if (employees[i] instanceof Employee) {
				System.out.println(employees[i].getName() + " - " + employees[i].getPosition());
			}
		}
	}
}
