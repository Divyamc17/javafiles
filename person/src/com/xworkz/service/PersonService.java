package com.xworkz.service;

import com.xworkz.dto.PersonDTO;

public interface PersonService {
	
 boolean validateAndSave(PersonDTO dto);
 
   void displayAll();
 
  void displayAllAgeGreaterThanOrderByName(int age);
	
	void displayAllByGenderDescOrderByName(String gender );
	
	void displayAllBySalaryGreaterThanOrderByDesc(double salary);
	
	void displayCount();
	
	void displaySumOfSalary();
}
