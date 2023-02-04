package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
public class CallableSample {
	public static Connection con=null;
	public static CallableStatement calstmt=null;
	public static void main(String[] args) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Enjoy@123");
			System.out.println("callable statement  Database is connected");
			calstmt=con.prepareCall("{call insertrecord2(?,?,?)}");
			calstmt.setInt(1,6);
			calstmt.setString(2,"tara");
			calstmt.setString(3,"welcome");
			calstmt.executeUpdate();
		}catch(SQLException e) {
		e.printStackTrace();
	
		}
	}
}
