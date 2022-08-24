package com.xworkz.main;

import com.xworkz.classes.Automobile;
import com.xworkz.classes.HondaAutomobile;
import com.xworkz.sub.TataAutomobile;

public class AutomobileInvite {

	public static void main(String[] args) {
		
		Automobile automobile=new Automobile();
		double price=automobile.sellAccessories("Seat");
		System.out.println(price);
		automobile.setBrand("Honda");
		automobile.setType("Four wheel");
		//automobile.torisu();
		
		
		HondaAutomobile hondaAutomobile=new HondaAutomobile();
		hondaAutomobile.setopenTime(8.00);
		hondaAutomobile.setcloseTime(7.00);
		//hondaAutomobile.torisu();
		
		
		TataAutomobile tataAutomobile=new TataAutomobile();
		tataAutomobile.torisu();
	}

}

