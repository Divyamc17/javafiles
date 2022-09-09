package com.xworkz.main;

import com.xworkz.dto.StadiumDTO;

public class StadiumInvite {

	public static void main(String[] args) {
		
		StadiumDTO stadium1=new StadiumDTO();
        stadium1.setOpenTime(9.00);
        System.out.println(stadium1.getOpenTime());
        stadium1.setCloseTime(7.00);
        System.out.println(stadium1.getCloseTime());
        int num1=stadium1.hashCode();
        System.out.println(num1);
        
        StadiumDTO stadium2=new StadiumDTO();
        stadium2.setOpenTime(9.00);
        System.out.println(stadium2.getOpenTime());
        stadium2.setCloseTime(7.00);
        System.out.println(stadium2.getCloseTime());
        int num2=stadium1.hashCode();
        System.out.println(num2);
        
        if(stadium1.hashCode()==stadium2.hashCode()) {
        	stadium1.equals(stadium2);
        	System.out.println("both are equal");
        }
        	System.out.println("both are not equal");
	}

}
