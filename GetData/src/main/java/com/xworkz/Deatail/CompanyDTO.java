package com.xworkz.Deatail;

import java.io.Serializable;

public class CompanyDTO implements Serializable {
     
	private String companyName;
	private String founder;
	private CharSequence since;
	private CharSequence employees;
	private String address;
	private String business; 
	
	public CompanyDTO() {
		System.out.println("campany details");
	}

	public CompanyDTO(String companyName, String founder, CharSequence since, CharSequence employees, String address, String business) {
		super();
		this.companyName = companyName;
		this.founder = founder;
		this.since = since;
		this.employees = employees;
		this.address = address;
		this.business = business;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public CharSequence getSince() {
		return since;
	}

	public void setSince(CharSequence since) {
		this.since = since;
	}

	public CharSequence getEmployees() {
		return employees;
	}

	public void setEmployees(CharSequence employees) {
		this.employees = employees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	
	
}


