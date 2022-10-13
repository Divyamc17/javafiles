package com.xworkz.service;

import com.xworkz.dto.ProjectorDTO;
import com.xworkz.dto.PropertyDTO;

public class ProjectorServiceImpl implements ProjectorService {

	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		System.out.println("created");
		String name=dto.getName();
	    String brand=dto.getBrand();
;	    String color=dto.getColor();
	    double length=dto.getLength();
	    double width=dto.getWidth();
	    if(name!=null name.length()>3 && name.length()<15);
		return false;
	}

	
	}

}
