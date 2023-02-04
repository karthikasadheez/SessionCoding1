package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSample {
	
   public static Connection con=null;
   public static Statement stm=null;
   public static ResultSet resultset=null;
	public static void main(String[] args) {
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Enjoy@123");
		System.out.println("Database is connected");
		stm=con.createStatement();
		//uncomment and run check this that time need to comment it line 27 to 32
		//String sql="insert into login values('2','hem','welcome') ";
		//int result=stm.executeUpdate(sql);
		//System.out.println(result);
		
		//to retrive all the details
		String sql="select * from login";
		resultset=stm.executeQuery(sql);
		while(resultset.next()) {
		      //to retrive based on coloum name 
			//System.out.println(resultset.getString("id")+""+resultset.getString("username")+""+resultset.getString("pwd"));
			
			//to retrive based on the coloumn index
			System.out.println(resultset.getString(1)+""+resultset.getString(2)+""+resultset.getString(3));

		//prepared will hav compliled query while compiling only once without data
		//use that query again and again
		
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	}

}
