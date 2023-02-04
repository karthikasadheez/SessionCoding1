package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedSample {
	public static Connection con=null;
	public static PreparedStatement prepstmt=null;
	public static String query="insert into login values('?','?','?') ";
	
	public static void main(String[] args) {
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Enjoy@123");
			System.out.println("Database is connected");
			prepstmt=con.prepareStatement(query);
			for(int i=0;i>3;i++) {
				prepstmt.setInt(1, i + 3);
				prepstmt.setString(2, "mega");
				prepstmt.setString(3, "star");
				prepstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	}

}
