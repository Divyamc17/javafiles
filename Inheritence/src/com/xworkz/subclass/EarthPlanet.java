package com.xworkz.subclass;

import com.xworkz.superclass.Planet;

public class EarthPlanet extends Planet {

	public String name;
	public double radius;
	public boolean habitant;
	
	 public EarthPlanet(String shape,String color,String density,String name,double radius,boolean habitant){
		super(shape,color,density);
		 this.name=name;
		 this.radius= radius;
		 this.habitant = habitant;
	}
	 public EarthPlanet(String shape,String color,String density) {
		super(shape,color,density);
		
		
	}
	public void torisu() {
		System.out.println(super.shape);
		System.out.println(super.color);
		System.out.println(super.density);
		System.out.println(this.name);
		System.out.println(this.radius);
		System.out.println(this.habitant);

		
	}
	
}
