package executeupdatedemo;

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
		
		String sql = "insert into customer(customerId, customerName, customerAddress, customerIncome) "
				+ "values(104, 'Rajeev Nigam', 'Canada- Vencover', 60000.50)";
		
		System.out.println("data is inserted");
		
		int count = statement.executeUpdate(sql);
		
		System.out.println(count);
		
		ResultSet rSet = statement.executeQuery("select * from customer where customerId=104");
		
		while(rSet.next()) {
		System.out.println(rSet.getInt(1));
		System.out.println(rSet.getString(2));
		System.out.println(rSet.getString(3));
		System.out.println(rSet.getDouble(4));
		}
	
	}

}
