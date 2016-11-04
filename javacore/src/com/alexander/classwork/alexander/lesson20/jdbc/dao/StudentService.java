package com.alexander.classwork.alexander.lesson20.jdbc.dao;

import java.util.List;

public interface StudentService {
	
	List<Student> selectAllStudents();	
	
	Student updateStdent(Student student);
	
	void deleteStudent(int id);
	
	Student createStudent(Student student);
	
	Student selectStudentByID(int id);

	

}
