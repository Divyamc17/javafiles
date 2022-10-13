package com.xworkz.data;

import com.xworkz.dto.GardenDTO;
import com.xworkz.service.GardenService;
import com.xworkz.service.GardenSreviceImpl;

public class GardenInvite {

	public static void main(String[] args) {
		
		GardenDTO garden= new GardenDTO("Brundhvan", 1000.00, 900.00, 30, 70);
        System.out.println(garden);
        
        GardenService gardenService=new GardenSreviceImpl();
        gardenService.validateAndSave(garden);
	}

}
