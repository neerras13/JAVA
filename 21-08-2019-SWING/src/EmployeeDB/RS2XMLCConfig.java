package EmployeeDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.MyConnectionFactory;

public class RS2XMLCConfig {
	private MyConnectionFactory factory;
	private Connection conn;
	
	public RS2XMLCConfig() throws SQLException{
		super();
		factory = MyConnectionFactory.createObject();
		conn = factory.getConnection();
	}
	
	public ResultSet getAllEmployee() throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id,concat(fname,lname) as FullName,DepName from employee,dept where id=EmpID");
		return rs;
	}

}
