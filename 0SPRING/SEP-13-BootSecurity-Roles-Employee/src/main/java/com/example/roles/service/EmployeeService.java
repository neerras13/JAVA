package com.example.roles.service;

import java.util.List;

import com.example.roles.model.Employee;
import com.example.roles.model.EmployeeContract;
import com.example.roles.model.EmployeePermanent;
import com.example.roles.repository.EmployeeContractRepository;
import com.example.roles.repository.EmployeePermanentRepository;
import com.example.roles.repository.EmployeeRepository;

public interface EmployeeService {
	
	public List<Employee> findAllEmployee();
	public List<EmployeeContract> findAllContract();
	public List<EmployeePermanent> findAllPermanent();
	public void createEmployee(Employee e,EmployeeContract ec,EmployeePermanent ep);
	
	
}
