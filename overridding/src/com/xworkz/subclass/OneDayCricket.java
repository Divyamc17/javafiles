package com.xworkz.subclass;

import com.xworkz.superclass.Cricket;

public class OneDayCricket extends Cricket {

	private static final String Kohli = null;
	public String bestBowler;
	public String bestBatsman;

	public OneDayCricket() {
		System.out.println("default OneDayCricket");
	}

	public String manOfSeries(String name) {
		if (name == Kohli)
			
		{
			return Kohli;
		}
		return "noOne";
	}

	public double setpresentation(double presentation) {
		if (presentation == 40000) {
			return 4;
		}
		return 0;
	}
	public boolean setentertainment(boolean entertainment) {
		  System.out.println("setentertainment is true");
		  if(entertainment==true) {
			  return true;
		  }
		  return false;

}
	public void setBest(String bestBowler,String bestBatsman) {
		
		this.bestBowler=bestBowler;
		this.bestBatsman=bestBatsman;
	}
}
