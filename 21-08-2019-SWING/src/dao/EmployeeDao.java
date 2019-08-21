package dao;

import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void getConnectionInfo();
	void deleteEmployee(int id) throws SQLException;
	void updateEmployee(Employee employee);

}
