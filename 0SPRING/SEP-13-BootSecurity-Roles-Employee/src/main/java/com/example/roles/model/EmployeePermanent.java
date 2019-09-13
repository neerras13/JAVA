package com.example.roles.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("permanent")
public class EmployeePermanent extends Employee{

	private double salary;
	private double commission;
	public EmployeePermanent(String fname, String lname, double salary) {
		super(fname,lname);
		this.salary = salary;
		this.commission = salary*0.1;
	}

	public EmployeePermanent() {
		super();
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
}
