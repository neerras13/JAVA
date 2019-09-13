package com.example.roles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.roles.model.Employee;
import com.example.roles.repository.EmployeeContractRepository;
import com.example.roles.repository.EmployeePermanentRepository;
import com.example.roles.repository.EmployeeRepository;
import com.example.roles.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	private EmployeeServiceImpl e;
	private EmployeeRepository employeeRepository;
//	private EmployeePermanentRepository employeePermanentRepository;


	public EmployeeController(EmployeeServiceImpl e,EmployeeRepository employeeRepository) {
	super();
	this.e = e;
	this.employeeRepository=employeeRepository;
}

	@GetMapping("/view")
	public String goView(Model theModel) {
//		System.out.println("HGKDGFVKHYUIHBL;LJ!!!!!!");
//		for(Employee em:e.findAllEmployee())
//			System.out.println(em.getFname());
		List<Employee> list =  employeeRepository.findAll();
		theModel.addAttribute("emp",list);
		return "/employee/view";
		
	}


}
