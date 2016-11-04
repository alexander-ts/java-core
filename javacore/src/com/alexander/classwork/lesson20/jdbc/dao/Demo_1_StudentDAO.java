package com.alexander.classwork.lesson20.jdbc.dao;

public class Demo_1_StudentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StudentService studentDAO = new StudentDAOImpl();

	      //print all students
	      for (Student student : studentDAO.selectAllStudents()) {
	         System.out.println("Student: [ID : " + student.getId() + ", Name : " + student.getFirstName() + " ]");
	      }


	      //update student
	      Student student = new  Student("FirstName", "Max", 1);
	      
	      System.out.println(studentDAO.updateStdent(student).toString());

	      //get the student by ID
	     System.out.println(studentDAO.selectStudentByID(1).toString());
	     
	     
	   //print all students
	      for (Student student2 : studentDAO.selectAllStudents()) {
	         System.out.println("Student: [ID : " + student2.getId() + ", Name : " + student2.getFirstName() + " ]");
	      }

	      

	}

}
