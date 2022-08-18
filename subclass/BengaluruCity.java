package com.xworkz.subclass;

import com.xworkz.superclass.City;

public class BengaluruCity extends City {

	public String title;
	public String founder;
	public int area;
	
   public BengaluruCity(String name,String state,String country,String title,String founder,int area){
		
		super(name,state,country);
		this.title=title;
		this.founder=founder;
		this.area=area;
   }
		
		
		public BengaluruCity(String name,String state,String country){
			
			super(name,state,country);
	}
	 public void torisu() {
		 System.out.println(super.name);
		 System.out.println(super.state);
		 System.out.println(super.country);
		 System.out.println(this.title);
		 System.out.println(this.founder);
		 System.out.println(this.area);
	  
	 }
	 
		 
		 

	 
	 
	
}
