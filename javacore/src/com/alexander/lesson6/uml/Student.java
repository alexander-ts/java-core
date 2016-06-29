package com.alexander.lesson6.uml;

public class Student {

	private int studentId;
	private String name;

	public Student() {
		// TODO - implement Student.Student
		throw new UnsupportedOperationException();
	}

	public int getStudentId() {
		return this.studentId;
	}

	/**
	 * 
	 * @param studentId
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}