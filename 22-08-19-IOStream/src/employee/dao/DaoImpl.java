package employee.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import employee.factory.MyConnectionFactory;
import employee.EModel;

public class DaoImpl implements Dao {

	private MyConnectionFactory factory = null;
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public DaoImpl() throws SQLException {
		super();
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
	}

	@Override
	public List<EModel> getAllEmployees() {
		List<EModel> list = new ArrayList<EModel>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			ResultSetMetaData rMetaData = resultSet.getMetaData();
			rMetaData.getColumnCount();
			rMetaData.getColumnLabel(1);
			rMetaData.getColumnName(2);
			rMetaData.getColumnType(2);
			while (resultSet.next()) {
				list.add(new EModel(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getString(4)));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public void getConnectionInfo() {
		try {
			DatabaseMetaData dMetaData = connection.getMetaData();

			System.out.println(dMetaData.getDatabaseProductName());
			System.out.println(dMetaData.getDriverName() + " " + dMetaData.getDatabaseMajorVersion() + " "
					+ dMetaData.getDatabaseMinorVersion());
			dMetaData.getURL();
			dMetaData.getUserName();
		} catch (SQLException e) {

		}
	}

	@Override
	public EModel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(int id) throws SQLException
	{
		pStatement = connection.prepareStatement("delete from employee where id=?");
		pStatement.setInt(1, id);
		pStatement.executeUpdate();
	}

	@Override
	public void createEmployee(EModel employee) {
		try {
			pStatement = connection.prepareStatement("insert into emps values(?,?,?,?)");
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getName());
			pStatement.setInt(3, employee.getMobile());
			pStatement.setString(4, employee.getEmail());
			pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("duplicate id");

			e.printStackTrace();
		} finally {

		}

	}
	@Override
	public void updateEmployee(EModel employee) {
		try {
			pStatement = connection.prepareStatement("update employee set name=?,email=? where id=?");
			pStatement.setInt(4, employee.getId());
			pStatement.setString(1, employee.getName());
			pStatement.setString(2, employee.getEmail());
			pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Id not found");

			e.printStackTrace();
		} finally {

		}

	}


}

