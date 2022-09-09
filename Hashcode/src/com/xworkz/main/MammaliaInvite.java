package com.xworkz.main;

import com.xworkz.dto.MammaliaDTO;

public class MammaliaInvite {

	public static void main(String[] args) {
		
		MammaliaDTO mammalia1=new MammaliaDTO();
		mammalia1.setNotocryemorphola("marupial moles");
		System.out.println(mammalia1.getNotocryemorphola());
		mammalia1.setDasyuomorphiya("dasyurids");
		System.out.println(mammalia1.getDasyuomorphiya());
		int num1=mammalia1.hashCode();
		System.out.println(num1);
		
		MammaliaDTO mammalia2=new MammaliaDTO();
		mammalia2.setNotocryemorphola("marupial moles");
		System.out.println(mammalia2.getNotocryemorphola());
		mammalia2.setDasyuomorphiya("dasyurids");
		System.out.println(mammalia2.getDasyuomorphiya());
		int num2=mammalia2.hashCode();
		System.out.println(num2);
		
		if(mammalia1.hashCode()==mammalia2.hashCode()) {
		   mammalia1.equals(mammalia2);
		   System.out.println("both are equal");
		}
		else
		{
			 System.out.println("both are not equal");
		}
		
	}
}
