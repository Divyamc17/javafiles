package com.xworkz.classes;

public class Automobile {

	public String type;
	public String brand;
	
    public Automobile() {
    	System.out.println("default constructor");
    }
	public double sellAccessories(String name) {
		if (name == "seat") {
			System.out.println("seat cost is 5000");
			return 5000;
		}

		if (name == "Wheel") {
			System.out.println("seat cost is 6000");
			return 6000;
		}
		System.out.println("seat cost is 0");
		return 0;

	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	protected void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);
	}
	
}
