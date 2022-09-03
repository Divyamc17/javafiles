package com.xworkz.main;

import com.xworkz.dto.CountriesDTO;

public class CountriesInvite {

	public static void main(String[] args) {

		CountriesDTO country1=new CountriesDTO(); 
		country1.setIndiaDensity("123");
		System.out.println(country1.getIndiaDensity());
		country1.setArmeniaDensity("148");
		System.out.println(country1.getArmeniaDensity());
		int num1=country1.hashCode();
		System.out.println(num1);
		
        

		CountriesDTO country2=new CountriesDTO(); 
		country2.setIndiaDensity("123");
		System.out.println(country2.getIndiaDensity());
		country2.setArmeniaDensity("148");
		System.out.println(country2.getArmeniaDensity());
		int num2=country1.hashCode();
		System.out.println(num2);
		
		if (country1.hashCode()==country2.hashCode()) {
			country1.equals(country2);
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		}
	
	

}
