package com.example.roles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.roles.model.Employee;
import com.example.roles.repository.EmployeeContractRepository;
import com.example.roles.repository.EmployeePermanentRepository;
import com.example.roles.repository.EmployeeRepository;
import com.example.roles.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	private EmployeeServiceImpl e;
//	private EmployeeContractRepository employeeContractRepository;
//	private EmployeePermanentRepository employeePermanentRepository;

	@Autowired
	public EmployeeController(EmployeeServiceImpl e) {
	super();
	this.e = e;
}

	@GetMapping("/view")
	public String goView(Model theModel) {
		System.out.println("HGKDGFVKHYUIHBL;LJ!!!!!!");
		for(Employee em:e.findAllEmployee())
			System.out.println(em.getFname());
		theModel.addAttribute("emp", e.findAllEmployee());
		return "view";
		
	}


}
