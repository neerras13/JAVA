//SINGLETON IMPLEMENTATION
//Prepared statement

package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {
	private static Connection connect;
	private static MySqlConnectionFactory connF;
	
	private MySqlConnectionFactory() throws SQLException {
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","Qwerty789!");
	}
	public static MySqlConnectionFactory createConnection() throws SQLException
	{
		if(connF==null)
		{
			connF=new MySqlConnectionFactory();
		}
		return connF;
	}
	public Connection getConnection()throws SQLException
	{
		return connect;
	}


}
