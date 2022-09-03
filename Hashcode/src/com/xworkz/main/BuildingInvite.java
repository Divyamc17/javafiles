package com.xworkz.main;

import com.xworkz.dto.BuilidingDTO;

public class BuildingInvite {

	public static void main(String[] args) {

		BuilidingDTO building1 = new BuilidingDTO();
		building1.setNoOfFooting(8);
		System.out.println(building1.getNoOflength());
		building1.setNoOfBeam(10);
		System.out.println(building1.getNoOfBeam());
		int num = building1.hashCode();
		System.out.println(num);

		BuilidingDTO building2 = new BuilidingDTO();
		building2.setNoOfFooting(8);
		System.out.println(building2.getNoOflength());
		building2.setNoOfBeam(10);
		System.out.println(building2.getNoOfBeam());
		int num1 = building1.hashCode();
		System.out.println(num1);
		
		

	     if (building1.hashCode()==building2.hashCode()) {
	    	 System.out.println("hashcode are same");
	     
	     if (building1.equals(building2)){
	    	 System.out.println("building1 and building2 both are equal");
	     }
	     else
	     {
	    	 System.out.println("building1 and building2 both are not equal");
	    	   
	     }
		}
	     else
	     {
	    	 System.out.println("hashcode sre not equal");
	     }
	}



	}


