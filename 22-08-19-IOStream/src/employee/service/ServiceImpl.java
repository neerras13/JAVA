package employee.service;

import java.sql.SQLException;
import java.util.List;

import employee.EModel;
import employee.dao.Dao;
import employee.dao.DaoImpl;
import employee.service.Service;

public class ServiceImpl implements Service{
	private Dao dao = null;

	public ServiceImpl() throws SQLException {
		super();
		dao = new DaoImpl();
	}
@Override
	public void createEmployee(EModel employee) {

		dao.createEmployee(employee);
	}
@Override
	public List<EModel> getAllEmployees() {

		return dao.getAllEmployees();
	}
@Override
	public EModel getEmployeeById(int id) {

		return null;
	}
@Override
	public void getMetadata()
	{
		dao.getConnectionInfo();
	}
public void deleteEmployee(int id) throws SQLException
	{
		dao.deleteEmployee(id);
	}
public void updateEmployee(EModel e) {
		// TODO Auto-generated method stub
		dao.updateEmployee(e);
	}

}
