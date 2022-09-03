package com.xworkz.main;

import com.xworkz.dto.WaterDTO;

public class WaterInvite {

	public static void main(String[] args) {
		WaterDTO water1=new WaterDTO();
		water1.getAcidity();
		water1.getBasicity();
		water1.setBoilingPoint(100);
		System.out.println(water1.getBoilingPoint());
		water1.getCations();
		water1.setColor("colourless");
		System.out.println(water1.getColor());
		water1.getConjugateAcid();
		water1.getConjugatrBase();
		water1.getCrystalStructure();
		water1.getDataSheet();
		water1.getDeepWater();
		water1.getDensity();
		water1.getDipoleMoment();
		water1.getDrinkingWater();
		water1.getFirstLetter();
		water1.getFivthLetter();
		water1.getFlashPoint();
		int num=water1.hashCode();
		System.out.println(num);

		
		WaterDTO water2=new WaterDTO();
		water2.getAcidity();
		water2.getBasicity();
		water2.setBoilingPoint(100);
		System.out.println(water2.getBoilingPoint());
		water2.getCations();
		water2.setColor("colourless");
		System.out.println(water2.getColor());
		water2.getConjugateAcid();
		water2.getConjugatrBase();
		water2.getCrystalStructure();
		water2.getDataSheet();
		water2.getDeepWater();
		water2.getDensity();
		water2.getDipoleMoment();
		water2.getDrinkingWater();
		water2.getFirstLetter();
		water2.getFivthLetter();
		water2.getFlashPoint();
		int num1=water2.hashCode();
		System.out.println(num1);

		if (water1.hashCode() == water2.hashCode()) {
		 water1.equals(water2);
		}
		else {
			System.out.println("it is not equal");
		}
	}

}
