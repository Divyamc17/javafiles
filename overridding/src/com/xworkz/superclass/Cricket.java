package com.xworkz.superclass;

public class Cricket {

	public String country;
	public String captain;
	public char gender;
	
	 public Cricket(){
		System.out.println("default constructor");
	}
	public boolean setentertainment(boolean entertainment) {
	  System.out.println("setentertainment is true");
	  if(entertainment==true) {
		  return true;
	  }
	  return false;
	}
	public double setpresentation(double presentation) {
		System.out.println("setpresentation is money");
		if(presentation==15000.00) {
			return 15.00;
		}
		return 0.0;
	}
	 public void setproperties(String country,String captain,char gender) {
		 this.country=country;
		 this.captain=captain;
		 this.gender=gender;
		 
		 
		 
	 }
}



