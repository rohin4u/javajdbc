package spider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.
//				getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false&serverTimezone=UTC","root","password");
//		
//		Statement statement = con.createStatement();
//		
//		String sql = "delete from customer where customerId=102";
//		
//		
//		
//		ResultSet rSet = statement.executeQuery(sql);
//		
//		while(rSet.next()) {
//			
//			System.out.println(rSet.getInt(1));
//			System.out.println(rSet.getString(2));
//			System.out.println(rSet.getString(3));
//			System.out.println(rSet.getDouble(4));
//		}

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
		
		Statement statement = con.createStatement();

		String sql = "delete from customer where customerId=103";
	
		ResultSet rSet = statement.executeQuery(sql);
		
		while(rSet.next()) {
			
			System.out.println(rSet.getInt(1));
			System.out.println(rSet.getString(2));
			System.out.println(rSet.getString(3));
		}
		

//		ResultSet rSet = statement.getResultSet();
//		
//		while(rSet.next()) {
//		System.out.println(rSet.getInt(1));
//		System.out.println(rSet.getString(2));
//		System.out.println(rSet.getString(3));
//		System.out.println(rSet.getDouble(4));
//		}
	
	}

}
