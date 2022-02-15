package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
	getConnection("jdbc:mysql://localhost:3306/jpacustom?useSSL=false&serverTimezone=UTC","root","password");
		
		Statement statement = con.createStatement();
	boolean execute = statement.execute("update user set user_name='rohin dungal' where id=5");
	
		ResultSet resultSet = statement.executeQuery("select * from user");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
	
		}
		
		
//		while(rSet.next()) {
//
//			System.out.println(rSet.getInt(1));
//			System.out.println(rSet.getString(2));
//			System.out.println(rSet.getString(3));;
//			
//			
//		}
		con.close();
		
		
	}

}
