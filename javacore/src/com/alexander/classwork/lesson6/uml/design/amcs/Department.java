package com.alexander.classwork.lesson6.uml.design.amcs;

import java.util.HashSet;
import java.util.Set;

public class Department implements DepartmentUnit {
	
	private String name;
	//aggreagation
	private Set<Employee> employees = new HashSet<Employee>();

	public Department(String n) {
		name = n;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void addEmployee(Employee newEmployee) {
		employees.add(newEmployee);

		newEmployee.setDepartment(this);
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void removeEmployee(Employee e) {
		employees.remove(e);
	}

	public int getPersonCount() {
		return getEmployees().size();
	}
}