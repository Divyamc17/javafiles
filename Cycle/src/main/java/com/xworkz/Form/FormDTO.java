package com.xworkz.Form;

import java.io.Serializable;

public class FormDTO implements Serializable {

	private String name;
	private String email;
	private Long phoneNo;
	private Long alternativeNo;
	private String Gender;
	private String qualification;
	private Integer year;
	private String University;
	private String address;
	private String skill;
	private String skill1;
	private String skill2;
	private Double ExpectedSalary;
	private Integer experiance;
	private String idProof;
	private String idProofNo;
	
	
public FormDTO() {
	System.out.println("dto");
}


public FormDTO(String name, String email, Long phoneNo, Long alternativeNo, String gender, String qualification,
		Integer year, String university, String address, String skill, String skill1, String skill2,
		Double expectedSalary, Integer experiance, String idProof, String idProofNo) {
	super();
	this.name = name;
	this.email = email;
	this.phoneNo = phoneNo;
	this.alternativeNo = alternativeNo;
	Gender = gender;
	this.qualification = qualification;
	this.year = year;
	University = university;
	this.address = address;
	this.skill = skill;
	this.skill1 = skill1;
	this.skill2 = skill2;
	ExpectedSalary = expectedSalary;
	this.experiance = experiance;
	this.idProof = idProof;
	this.idProofNo = idProofNo;
}





}

	