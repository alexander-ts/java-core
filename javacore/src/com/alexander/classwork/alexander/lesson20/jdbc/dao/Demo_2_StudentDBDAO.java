package com.alexander.classwork.alexander.lesson20.jdbc.dao;

import java.sql.Connection;
import java.util.List;

public class Demo_2_StudentDBDAO {

	private static Connection connection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new  Student("FirstName", "Max", 1);
		
        StudentDBDAOImpl studentDBDAOImpl= new StudentDBDAOImpl();
        connection = studentDBDAOImpl.getConnection();
        List<Student> students = studentDBDAOImpl.selectAllStudents();
         System.out.println(students);
        
         studentDBDAOImpl.closeConnection();
 

	}

}
