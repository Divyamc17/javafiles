package com.xworkz.main;

import com.xworkz.dto.KingsDTO;

public class KingsInvite {

	public static void main(String[] args) {
	
		KingsDTO king1=new KingsDTO();
		king1.setAshokaBornPlace("Pataliputra");
		System.out.println(king1.getAshokaBornPlace());
		king1.setSamudraguptaBornPlace("Indraprastha");
		System.out.println(king1.getSamudraguptaBornPlace());
		int num1=king1.hashCode();
		System.out.println(num1);

		KingsDTO king2=new KingsDTO();
		king2.setAshokaBornPlace("Pataliputra");
		System.out.println(king2.getAshokaBornPlace());
		king2.setSamudraguptaBornPlace("Indraprastha");
		System.out.println(king2.getSamudraguptaBornPlace());
		int num2=king2.hashCode();
		System.out.println(num2);
		
		if(king1.hashCode()==king2.hashCode()) {
			king1.equals(king2);
			System.out.println("king1 and king2 are equal");
		}
		else {
			System.out.println("king1 and king2 are not equal");
		}

	
	}
	

}
