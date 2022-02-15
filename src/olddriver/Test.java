package olddriver;

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
		
		ResultSet rSet = statement.executeQuery("select * from customer where customerId=103");
		
		while(rSet.next()) {
			System.out.println(rSet.getInt(1));
			System.out.println(rSet.getString(2));
			System.out.println(rSet.getString(3));
			System.out.println(rSet.getDouble(4));
		}
		
	}
}
