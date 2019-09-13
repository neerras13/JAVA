package com.example.roles.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.roles.model.Employee;
import com.example.roles.model.EmployeeContract;
import com.example.roles.model.EmployeePermanent;
import com.example.roles.repository.EmployeeContractRepository;
import com.example.roles.repository.EmployeePermanentRepository;
import com.example.roles.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository emp;
	private EmployeeContractRepository empc;
	private EmployeePermanentRepository empp;

	@Override
	public void createEmployee(Employee e, EmployeeContract ec, EmployeePermanent ep) {
		emp.save(e);
		empc.save(ec);
		empp.save(ep);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return emp.findAll();
	}

	@Override
	public List<EmployeeContract> findAllContract() {
		return empc.findAll();
	}

	@Override
	public List<EmployeePermanent> findAllPermanent() {
		return empp.findAll();
	}
	
}
