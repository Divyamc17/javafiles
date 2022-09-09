package com.xworkz.main;

import com.xworkz.dto.ClothDTO;

public class ClothInvite {

	public static void main(String[] args) {
		
		ClothDTO cloth1=new ClothDTO();
		cloth1.setType("cotton");
		System.out.println(cloth1.getType());
		cloth1.setColour("black");
	    System.out.println(cloth1.getColour());
	    int num1=cloth1.hashCode();
	    System.out.println(num1);
		
	    ClothDTO cloth2=new ClothDTO();
		cloth2.setType("cotton");
		System.out.println(cloth2.getType());
		cloth2.setColour("black");
	    System.out.println(cloth2.getColour());
	    int num2=cloth2.hashCode();
	    System.out.println(num2);
	    
	    if(cloth1.hashCode()==cloth2.hashCode()) {
	    	cloth1.equals(cloth2);
	    	System.out.println("both are equal");
	    }
		 System.out.println("both are not equal");
   
	}

}
