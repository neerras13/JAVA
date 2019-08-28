package comm.example.service;

import java.sql.SQLException;
import java.util.List;
import comm.example.dao.*;

import comm.example.model.Employee;

public class EmpServiceImpl implements EmpService{
	EmpDaoImpl dao=new EmpDaoImpl();
	
	@Override
	public int createEmployee(Employee employee) {
		return dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();

	}

	@Override
	public Employee getEmployeeById(int id) throws SQLException {
		return dao.getEmployeeById(id);
	}


	@Override
	public void deleteEmployee(int id) throws SQLException {
         dao.deleteEmployee(id);		
	}

	@Override
	public int updateEmployee(Employee employee) {
			return dao.updateEmployee(employee);
	}

	

}
