package com.xworkz.service;

import com.xworkz.dto.GarageDTO;

public class GarageServiceImpl implements GarageService {

	@Override
	public boolean validateAndSave(GarageDTO dto) {
		System.out.println("craeted");
		String name=dto.getName();
		String owner=dto.getOwner();
		double open=dto.getOpenTime();
		double close=dto.getCloseTime();
		int noStaff=dto.getNoOfStaff();
        if(name!=null && name.length()>3 && name.length()<20) {
        	System.out.println("name is valid ");
        	if(owner!=null && owner.length()>2 && owner.length()<15) {
        		System.out.println("owner is valid");
        		if(open>6.00 && open<8) {
        			System.out.println("open is valid");
        			if(close>7 && close<9) {
        				System.out.println("close is valid");
        				if(noStaff>1 && noStaff<8) {
        					System.out.println("noStaff is valid");
        				}
        				else {
        					System.err.println("noStaff is not valid");
        				}
        			}
        			else {
        				System.err.println("close is not valid");
        			}
        		}
        		else {
        			System.err.println("open is not valid");
        		}
        	}
        	else {
        		System.err.println("owner is not valid");
        	}
        }
        else {
        	System.err.println("name is not valid");
        }
		return false;
	}

	
	
}
