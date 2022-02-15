package executedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false&serverTimezone=UTC","root","password");
		
		Statement statement = con.createStatement();
		
		String sql = "delete from customer where customerId=101";
		
		
		
		boolean execute = statement.execute(sql);
		
		System.out.println(execute);
		if(execute==false) {
			System.out.println("data is deleted");
		}
		
		int count = statement.getUpdateCount();
		System.out.println("data is deleted :"+count);
		
		
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
