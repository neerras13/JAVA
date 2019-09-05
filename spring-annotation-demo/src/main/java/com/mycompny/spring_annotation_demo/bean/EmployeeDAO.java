package com.mycompny.spring_annotation_demo.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class EmployeeDAO {
	
	
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
	public void createEmployee(Employee employee)
	{
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(name) values(?)");
			pst.setString(1, employee.getName());
			pst.executeUpdate();
			System.out.println("inseerted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

}
