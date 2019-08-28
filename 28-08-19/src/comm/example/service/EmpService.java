package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.model.Employee;

public interface EmpService {

	public int createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id) throws SQLException;
	void deleteEmployee(int id) throws SQLException;
	int updateEmployee(Employee employee);
}
