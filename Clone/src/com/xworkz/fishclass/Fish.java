package com.xworkz.fishclass;

public class Fish {
  private String breed;
  private String type;
  
  public Fish() {
	System.out.println("default constructor fish");
}
   
  public Fish(String breed, String type) {
	super();
	this.breed = breed;
	this.type = type;
  }
	public String getBreed() {

		return breed;
	}
	public String getType() {
		
		return type;
	}
	   

@Override
	public String toString() {
	System.out.println("convert string to tostring");
		return super.toString();
	}
  @Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is null");
		}
		if(obj instanceof Fish)
		{
			System.out.println("chek the instanceof of fish");
			
			Fish converted=(Fish)obj;
			String convertedBreed=converted.breed;
		    String convertedType=converted.type;
		    if(this.breed.equals(convertedBreed)&& this.type.equals(convertedType)) {
		    	System.out.println("Breed and Type");
		    }
		    else
		    {
		    	System.out.println("false");
		    }
		}
		
		else
		{
			System.out.println("not equal to the fish");
		}
		return super.equals(obj);
	}
	
	
	
}
