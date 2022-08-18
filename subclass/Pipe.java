package com.xworkz.subclass;

import com.xworkz.superclass.Plastic;

public class Pipe extends Plastic {
	 public double youngsModulus;
	 public double tensileStrength;
	 public double meltingPoint;
	
 public Pipe(double diameter,double length,double density,double youngsModulus,double tensileStrength,double meltingPoint){
		super(diameter,length,density);
		this.youngsModulus=youngsModulus;
		this.tensileStrength=tensileStrength;
		this.meltingPoint=meltingPoint;
	 }
  public  Pipe(double diameter,double length,double density){
		super(diameter,length,density); 
	   
   }
   public void torisu() {
	   System.out.println(super.diameter);
	   System.out.println(super.length);
	   System.out.println(super.density);
	   System.out.println(this.youngsModulus);
	   System.out.println(this.tensileStrength);
	   System.out.println(this.meltingPoint);
   }
}

