package employee.dao;

import java.sql.SQLException;
import java.util.List;

import employee.EModel;

public interface Dao {

	public void createEmployee(EModel EModel);
	public List<EModel> getAllEmployees();
	public EModel getEmployeeById(int id);
	public void getConnectionInfo();
	void deleteEmployee(int id) throws SQLException;
	void updateEmployee(EModel EModel);

}
