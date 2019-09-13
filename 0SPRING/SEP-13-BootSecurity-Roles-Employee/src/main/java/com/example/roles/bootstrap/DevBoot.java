package com.example.roles.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.roles.model.Employee;
import com.example.roles.model.EmployeeContract;
import com.example.roles.model.EmployeePermanent;
import com.example.roles.repository.EmployeeContractRepository;
import com.example.roles.repository.EmployeePermanentRepository;
import com.example.roles.repository.EmployeeRepository;

@Component
public class DevBoot implements ApplicationListener<ContextRefreshedEvent>{
	
	private EmployeeRepository employeeRepository;
	private EmployeeContractRepository employeeContractRepository;
	private EmployeePermanentRepository employeePermanentRepository;
	
	
	@Autowired
	public DevBoot(EmployeeRepository employeeRepository, EmployeeContractRepository employeeContractRepository,
			EmployeePermanentRepository employeePermanentRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.employeeContractRepository = employeeContractRepository;
		this.employeePermanentRepository = employeePermanentRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	private void init() {
		Employee emp =new Employee("John", "Smith");
		EmployeeContract empc = new EmployeeContract("Jane", "Smith", 700, "3 months");
		EmployeePermanent empp = new EmployeePermanent("Ted","Bundy",20000);
		
		employeeRepository.save(emp);
		employeeContractRepository.save(empc);
		employeePermanentRepository.save(empp);
		
				
	}
}
