package com.alexander.lesson6.uml.design.amcs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class TestModel {

	public static void main(String[] args) throws ParseException {
		// Employee
		Employee manager = new Employee("John", "Red", "Developer");
		manager.setPosition("Manager");
		
		
		Employee director = new Employee("Eric", "Evans", "Director");
		
		// IdCard
		IdCard card = new IdCard(123);

		card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd")
				.parse("2015-12-31"));

		manager.setIdCard(card);
		
		// Room
		Room room101 = new Room(101);
		Room room321 = new Room(321);
		
		manager.setRoom(room101);
		manager.setRoom(room321);
		
		// Department
		Department programmersDepartment = new Department("DEV");
		programmersDepartment.addEmployee(manager);
		programmersDepartment.addEmployee(director);
		
		// PastPosition
		manager.setPosition("Programmer");
		
		// Output
		System.out.println(manager.getName() + " works at "
				+ manager.getPosition());
		System.out.println("Expired day " + new SimpleDateFormat("yyyy-MM-dd").format(manager
						.getIdCard().getDateExpire()));
		System.out.println("Can access to the Rooms:");
		
		Iterator<Room> iter = manager.getRoom().iterator();
		
		while (iter.hasNext()) {
			System.out.println(((Room) iter.next()).getNumber());
		}
		
		System.out.println("Works at Department "
				+ manager.getDepartment().getName());
		
		System.out.println("In Department " + manager.getDepartment().getName()
				+ " work " + manager.getDepartment().getPersonCount()
				+ " persons");
		
		System.out.println("In last Year works on ");
		Iterator<PastPosition> iterPastPosition = manager.getPastPosition()
				.iterator();
		
		while (iterPastPosition.hasNext()) {
			System.out.println(((PastPosition) iterPastPosition.next())
					.getName());
		}

		// Show all Employees
		
		EmployeeAdministration empAdmin = new EmployeeAdministration();
		Employee employees[] = new Employee[10];
		employees[0] = manager;
		employees[1] = director;
		empAdmin.showEmployees(employees);
	}
}