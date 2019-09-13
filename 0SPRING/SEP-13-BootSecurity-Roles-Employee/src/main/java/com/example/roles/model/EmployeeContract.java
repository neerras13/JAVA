package com.example.roles.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("contract")
public class EmployeeContract extends Employee{

	private int hourly_pay;
	private String contract_period;
	

	public EmployeeContract(String fname, String lname, int hourly_pay, String contract_period) {
		super(fname, lname);
		this.hourly_pay = hourly_pay;
		this.contract_period = contract_period;
		}


	public int getHourly_pay() {
		return hourly_pay;
	}

	public void setHourly_pay(int hourly_pay) {
		this.hourly_pay = hourly_pay;
	}

	public String getContract_period() {
		return contract_period;
	}

	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}
	
}
