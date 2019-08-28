package comm.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;



public class EmpDaoImpl implements EmpDao {

	private Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public EmpDaoImpl(){
		super();
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from emps");
			ResultSetMetaData rMetaData = resultSet.getMetaData();
			rMetaData.getColumnCount();
			rMetaData.getColumnLabel(1);
			rMetaData.getColumnName(2);
			rMetaData.getColumnType(2);
			while (resultSet.next()) {
				list.add(new Employee(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("password"), resultSet.getString("email"),
						resultSet.getString("country")));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}


	@Override
	public Employee getEmployeeById(int id) throws SQLException {
//		Employee e = null;
//		statement = connection.createStatement();
//		ResultSet rs = statement.executeQuery("select * from emps where id=11");
//		while(rs.next()) {
//		 e = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
//		}
		return null;
		
	}
	@Override
	public void deleteEmployee(int id) throws SQLException
	{
		pStatement = connection.prepareStatement("delete from emps where id=?");
		pStatement.setInt(1, id);
		pStatement.executeUpdate();
	}

	@Override
	public int createEmployee(Employee employee) {
		int value=0;
		try {
			pStatement = connection.prepareStatement("insert into emps(name,password,email,country) values(?,?,?,?)");
			pStatement.setString(1, employee.getName());
			pStatement.setString(2, employee.getPassword());
			pStatement.setString(3, employee.getEmail());
			pStatement.setString(4, employee.getCountry());
			value = pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("duplicate id");

			e.printStackTrace();
		} finally {

		}
		return value;

	}
	@Override
	public int updateEmployee(Employee employee) {
		int a = 0;
		try {
			pStatement = connection.prepareStatement("update emps set name=?,password=?,email=?,country=? where id=?");
			pStatement.setString(1, employee.getName());
			pStatement.setString(2, employee.getPassword());
			pStatement.setString(3, employee.getEmail());
			pStatement.setString(4, employee.getCountry());
			pStatement.setInt(5, employee.getId());
			a=pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Id not found");

			e.printStackTrace();
		} finally {

		}
			return a;
	}




}

