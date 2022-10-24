package com.xworkz.service;

import com.xworkz.dto.PersonDTO;
import com.xworkz.repository.PersonRepository;
import com.xworkz.repository.PersonRepositoryImpl;
import static com.xworkz.mysql.MysqlDBCredential.*;
import com.xworkz.repository.*;
public class PersonServiceImpl implements PersonService {
      
	
	public PersonServiceImpl() {
System.out.println("created"+getClass().getSimpleName());	
}
	  PersonRepository person=new PersonRepositoryImpl();
     
	@Override
	public boolean validateAndSave(PersonDTO dto) {
		System.out.println("created running method");
		int id=dto.getId();
		String name=dto.getName();
		String email=dto.getEmail();
		Long number=dto.getMobileNumber();
		String charater=dto.getGender();
		String qualification=dto.getQualification();
		String married=dto.getMarried();
		String working=dto.getWorking();
		String company=dto.getCompanyName();
		double salary=dto.getSalary();
		int age=dto.getAge();
		int experience=dto.getExperience();
		String location=dto.getLocation();
		String city=dto.getCity();
		String state=dto.getState();
		String country=dto.getCountry();
		long aadhar=dto.getAadharNo();
		String panNo=dto.getPanNo();
		String alive=dto.getAlive();
		long accountNo=dto.getBankAccountNo();
		
		if(id>0 && id<5000) {
			System.out.println("id is valid");
			if(name!=null && name.length()>1 && name.length()<80) {
				System.out.println("name is valid");
				if(email!=null && email.length()>1 && email.length()<50) {
					System.out.println("email is valid");
					if(number>=0 ) {
						System.out.println("mobile number is valid");
						if(charater!=null ) {
							System.out.println("gender is valid");
							if(qualification!=null && qualification.length()>1 && qualification.length()<50 ) {
								System.out.println("qualification is valid");
								if(married!=null && married.length()>1 && married.length()<50) {
									System.out.println("married is valid");
									if(working!=null && working.length()>1 && working.length()<50 ) {
										System.out.println("working is valid");
										if(company!=null && company.length()>1 && company.length()<50) {
											System.out.println("company is valid");
											if(salary>10000 && salary<500000 ) {
												System.out.println("salary is valid");
												if(age>18 && age<100) {
													System.out.println("age is valid");
													if(experience>0 && experience<30) {
														System.out.println("experience is valid");
														if(location!=null && location.length()>1 && location.length()<50) {
															System.out.println("location is valid");
															if(city!=null && city.length()>1 && city.length()<50) {
																System.out.println("city is valid");
																if(state!=null && state.length()>1 && state.length()<50) {
																	System.out.println("state is valid");
																	if(country!=null && country.length()>1 && country.length()<50) {
																		System.out.println("country is valid");
																		if(aadhar>=0 ) {
																			System.out.println("aadhar is valid");
																			if(panNo!=null && panNo.length()>1 && panNo.length()<50) {
																				System.out.println("pan no is valid");
																				if(alive!=null && alive.length()>1 && alive.length()<50) {
																					System.out.println("alive is valid");
																					if(accountNo>=0) {
																				     System.out.println("accountNo is valid");
																				     System.out.println("All data is valid,, can save...");
																				     
																				     this.person.save(dto);
																					}
																					else {
																 					    System.out
																								.println("accountNo is not valid");
								
															
																					}
																				}
																				else {
																					System.out.println("alive is not valid");
																				}
																			}
																			else {
																				System.out.println("pan no is not valid");
																			}
																		}
																		else {
																			System.out.println("aadhar is not valid");
																		}
																	}
																	else {
																		System.out.println("country is not valid");
																	}
																}
																else {
																	System.out.println("state is not valid");
																}
															}
															else {
																System.out.println("city is not valid");
															}
														}
														else {
															System.out.println("location is not valid");
														}
													}
													else {
														System.out.println("experience is not valid");
													}
												}
												else {
													System.out.println("age is not valid");
												}
											}
											else {
												System.out.println("salary is not valid");
											}
										}
										else {
											System.out.println("company is not valid");
										}
									}
									else {
										System.out.println("working is not valid");
									}
								}
								else {
									System.out.println("married id not valid");
								}
							}
							else {
								System.out.println("qualification is not valid");
							}
						}
						else {
							System.out.println("gender is not valid");
						}
					}
					else {
						System.out.println("mobile number is not valid");
					}
				}
				else {
					System.out.println("email is not valid");
				}
			}
			else {
				System.out.println("name is not valid");
			}
		}
		else {
			System.out.println("id is not valid");
		}
		return false;
	}
	@Override
	public void displayAll() {
     System.out.println("running displayAll in service");
     this.person.displayAll();
	}
	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
    System.out.println("greater than age order by name");
    this.person.displayAllAgeGreaterThanOrderByName(age);
	}
	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
      System.out.println("gender desc order by name");
      this.person.displayAllByGenderDescOrderByName(gender);
	}
	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
     System.out.println("salary is greater than order by desc");
     this.person.displayAllBySalaryGreaterThanOrderByDesc(salary);
	}
	@Override
	public void displayCount() {
	System.out.println("total count");
	this.person.displayCount();
	}
	@Override
	public void displaySumOfSalary() {
		System.out.println("sum of salary");
		System.out.println("sum of salary");
		this.person.displaySumOfSalary();
		
	}
	
  
}
