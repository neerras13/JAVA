package service;

import java.sql.SQLException;
import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return null;
	}
	
	public void getMetadata()
	{
		dao.getConnectionInfo();
	}
	
	public void deleteEmployee(int id) throws SQLException
	{
		dao.deleteEmployee(id);
	}

	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		dao.updateEmployee(e);
	}

}
