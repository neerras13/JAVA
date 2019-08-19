package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDemo {
	
	private static Properties properties = null;
	private static Scanner sc;
	
	public JdbcDemo() {
		super();}
	static {
		properties = new Properties();    //Properties is a map
		properties.put("JDBC_URL","jdbc:mysql://localhost:3306/firstdb");
		properties.put("USER","root");
		properties.put("PASSWORD","Qwerty789!");
	}

	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		//register driver
		
		//13 line - Class.forName("org.h2.Driver");
		//DriverManager.registerDriver(new org.h2.Driver());

		//Connection connect = DriverManager.getConnection("jdbc:h2:~/first","sa","sa");
		Connection connect = DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"),properties.getProperty("PASSWORD"));
		Statement stmt = connect.createStatement();
		Statement stmt1= connect.createStatement();
		
		int r = stmt.executeUpdate("insert into dept(DepId,DepName,EmpID) values(105,'Neer',234)");
		System.out.println("("+r+") rows have been updated.");
		
		ResultSet rs = stmt1.executeQuery("select * from dept");
		while(rs.next()) {
			System.out.printf("\n %d %s %d",rs.getInt(1),rs.getString("DepName"),rs.getInt("EmpID"));
		}
		
		PreparedStatement stmt3= connect.prepareStatement("delete from dept where EmpId=?");
		System.out.println("enter id");
		int id = sc.nextInt();
		stmt3.setInt(1, id);
		
		
		//Clean up 
		rs.close();
		stmt.close();
		connect.close();
	}
}
