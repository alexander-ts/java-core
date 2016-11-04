package com.alexander.classwork.alexander.lesson20.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentService {
	
	List<Student> students;
	
	public StudentDAOImpl(){
	      students = new ArrayList<Student>();
	      Student student1 = new Student("Joseph","Dave", 0);
	      Student student2 = new Student("Jary","Kuper", 1);
	      students.add(student1);
	      students.add(student2);		
	   }

	@Override
	public List<Student> selectAllStudents() {		
		return students;
	}

	@Override
	public Student updateStdent(Student student) {
		Student updatedStudent = students.get(student.getId());
		
		updatedStudent.setEmail(student.getEmail());
		updatedStudent.setFirstName(student.getFirstName());
		updatedStudent.setLastName(student.getLastName());		
		students.set(student.getId(), updatedStudent);
		
		return students.get(student.getId());
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudentByID(int id) {		
		return students.get(id);
	}

}
