package com.alexander.lesson20.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class StudentDBDAOImpl implements StudentService {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/javacourses?user=root&password=password";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "password";

	static Connection connection = null;

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			if (connection == null){
				//connection = DriverManager.getConnection(JDBC_DRIVER);
			DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
			connection = DriverManager.getConnection(DB_URL);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return connection;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		String sql = "SELECT student_id, firstname, lastname, email FROM students";
		List<Student> students = new LinkedList<Student>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT student_id, firstname, lastname, email FROM students");

			Student student = null;
			while (resultSet.next()) {
				// Retrieve by column name
				int id = resultSet.getInt("student_id");
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String email = resultSet.getString("email");
				// Display values
				System.out.print("ID: " + id);
				System.out.print(", FirstName: " + firstname);
				System.out.print(", LastNAme: " + lastname);
				System.out.println(", Email: " + email);
				student = new Student(firstname, lastname, id);
				student.setEmail(email);

				students.add(student);
			}
			resultSet.close();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return students;
		
	}

	@Override
	public Student updateStdent(Student student) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	public  void closeConnection(){
        try {
              if (connection != null) {
                  connection.close();
              }
            } catch (Exception e) { 
                //do nothing
            }
    }

}
