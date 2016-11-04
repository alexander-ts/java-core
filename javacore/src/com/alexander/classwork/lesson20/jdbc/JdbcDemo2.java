package com.alexander.classwork.lesson20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class JdbcDemo2 {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/javacourses";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "password";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			String sql = "SELECT * FROM students WHERE students.student_id=?";
			String sql2 = "SELECT * FROM students WHERE students.email=? and student_id=?";

			stmt = conn.prepareStatement(sql2);
			//set the parameter
            //stmt.setInt(1, 1);
            //stmt.setString(1, "email@com");
            stmt.setString(1, "email@com' or '1'='1");
            stmt.setString(2, "1");
            
           
			ResultSet rs = stmt.executeQuery();
			

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				//int id = rs.getInt("student_id");
				String firstname = rs.getString("firstname");
				//String lastname = rs.getString("lastname");
				//String email = rs.getString("email");

				// Display values
				//System.out.print("ID: " + id);
				System.out.print(", FirstName: " + firstname);
				//System.out.print(", LastNAme: " + lastname);
				//System.out.println(", Email: " + email);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Connection Closed!");
	}// end main
}// end FirstExample

