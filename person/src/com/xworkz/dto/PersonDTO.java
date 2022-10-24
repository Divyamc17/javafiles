package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter

public class PersonDTO {


	int id;
	String name;
	String email;
	Long mobileNumber;
	String gender;
	String qualification;
	String married;
	String working;
	String companyName;
	double salary;
	int age;
	int experience;
	String location;
	String city;
	String state;
	String country;
	long aadharNo;
	String panNo;
	String alive;
	long bankAccountNo;
}
