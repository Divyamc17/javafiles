package com.xworkz.main;

import com.xworkz.dto.SolarSystemDTO;

public class SolarSystemInvite {

	public static void main(String[] args) {
		
		SolarSystemDTO solar1=new SolarSystemDTO();
		solar1.setEarthRadius(12);
		solar1.setSaturnRadius(15);
		solar1.setEarthPolarRadius(17);
		solar1.setEarthVolume(45);
		solar1.setEarthAxialTilt(41);
		solar1.setSaturnAlebedo(18);
		solar1.setSaturnVolume(16);
		solar1.setSaturnMass(18);
		solar1.setVenusSourfaceArea(20);
		solar1.setJupitarDensity(47);
		int num1=solar1.hashCode();
		System.out.println(num1);
		
        
		SolarSystemDTO solar2=new SolarSystemDTO();
		solar2.setEarthRadius(12);
		solar2.setSaturnRadius(15);
		solar2.setEarthPolarRadius(17);
		solar2.setEarthVolume(45);
		solar2.setEarthAxialTilt(41);
		solar2.setSaturnAlebedo(18);
		solar2.setSaturnVolume(16);
		solar2.setSaturnMass(18);
		solar2.setVenusSourfaceArea(20);
		solar2.setJupitarDensity(47);
		int num2=solar1.hashCode();
		System.out.println(num2);
		
		if(solar1.hashCode()==solar2.hashCode()) {
			solar1.equals(solar2);
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}

}
