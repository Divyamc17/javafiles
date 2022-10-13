package com.xworkz.data;

import com.xworkz.dto.PropertyDTO;
import com.xworkz.service.PropertyService;
import com.xworkz.service.PropertyServiceImpl;

public class PropertyInvite {

	public static void main(String[] args) {
	
		PropertyDTO propertyDTO=new PropertyDTO("vardhan",800,500,"Parents","land");
        System.out.println(propertyDTO);
        
        PropertyService propertyService=new PropertyServiceImpl();
        propertyService.validateAndSave(propertyDTO);
	}

}
