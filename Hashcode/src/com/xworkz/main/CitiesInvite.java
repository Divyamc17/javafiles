package com.xworkz.main;

import com.xworkz.dto.CitiesDTO;

public class CitiesInvite {

	public static void main(String[] args) {
	
		CitiesDTO city1=new CitiesDTO();
		city1.setBidarArea(150000);
		System.out.println(city1.getBidarArea());
		city1.setUdupiArea(230000);
		System.out.println(city1.getUdupiArea());
		int num1=city1.hashCode();
		System.out.println(num1);

		
		CitiesDTO city2=new CitiesDTO();
		city2.setBidarArea(150000);
		System.out.println(city2.getBidarArea());
		city2.setUdupiArea(230000);
		System.out.println(city2.getUdupiArea());
		int num2=city2.hashCode();
		System.out.println(num2);
		
		if(city1.hashCode()==city2.hashCode()) {
			city1.equals(city2);
		System.out.println("both cities are equal");
		}
		else {
			System.out.println("both cities are not equal");
		}

	}
	

}
