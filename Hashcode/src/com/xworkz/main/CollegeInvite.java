package com.xworkz.main;

import com.xworkz.dto.CollegeDTO;

public class CollegeInvite {

	public static void main(String[] args) {
		
		
		CollegeDTO college1 = new CollegeDTO();      
		college1.setName("NITK");
		System.out.println(college1.getName());
		college1.setCityName("Surathkal");
		System.out.println(college1.getCityName());
		int num=college1.hashCode();
		System.out.println(num);

		
		CollegeDTO college2 = new CollegeDTO();
		college2.setName("NITK");
		System.out.println(college2.getName());
		college2.setCityName("Surathkal");
		System.out.println(college2.getCityName());
		int num1=college1.hashCode();
		System.out.println(num1);
		

     if (college1.hashCode()==college2.hashCode()) {
    	 System.out.println("hashcode are same");
     
     if (college1.equals(college2)){
    	 System.out.println("college1 and college2 both are equal");
     }
     else
     {
    	 System.out.println("college1 and college2 both are not equal");
    	   
     }
	}
     else
     {
    	 System.out.println("hashcode sre not equal");
     }
}

} 


