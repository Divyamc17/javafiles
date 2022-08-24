package com.xworkz.check;

public class ReverseMethod {

	public static void main(String[] args) {

		String[] names = { "Earth", "Mars", "Jupiter", "Pluto" };
       
		int Universe = names.length;
		System.out.println(Universe);

		for (int planet = names.length - 1; planet >= 0; planet--) {
			System.out.println(planet);
		}
		for (int can = names.length - 1; can >= 0; can--) {
			System.out.println(can);
			String planets = names[can];
			System.out.println(planets);
		}

	}
}
