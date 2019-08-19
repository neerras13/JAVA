package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemo {
	
	private static Properties properties = null;
	
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

		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","Qwerty789!");
		//Connection connect = DriverManager.getConnection("jdbc:h2:~/first","sa","sa");
		
		Connection connect = DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"),properties.getProperty("PASSWORD"));
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept");
		System.out.println("ID Name DepID");

		while(rs.next()) {
			System.out.printf("\n %d %s %d",rs.getInt("DepID"),rs.getString("DepName"),rs.getInt("EmpID"));
			

		}
		rs.close();
		stmt.close();
		connect.close();
	}
}
