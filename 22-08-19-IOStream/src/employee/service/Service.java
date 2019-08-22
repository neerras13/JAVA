package employee.service;

import java.sql.SQLException;
import java.util.List;

import employee.EModel;

public interface Service {
	public void createEmployee(EModel e);
	public List<EModel> getAllEmployees();
	public EModel getEmployeeById(int id);
	public void getMetadata();
}
