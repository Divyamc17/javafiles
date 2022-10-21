package com.xworkz.service;

import com.xworkz.dto.ProjectorDTO;
import com.xworkz.dto.PropertyDTO;
import com.xworkz.repository.ProjectorRepository;
import com.xworkz.repository.ProjectorRepositoryImpl;

public class ProjectorServiceImpl implements ProjectorService {

	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		System.out.println("created");
		String name=dto.getName();
	    String brand=dto.getBrand();
;	    String color=dto.getColor();
	    double length=dto.getLength();
	    double width=dto.getWidth();
	    if(name!=null && name.length()>3 && name.length()<15)  {
	    	System.out.println("name is valid");
	    	if(brand!=null && brand.length()>3 && brand.length()<10 ) {
	    		System.out.println("brand is valid");
	    			if(color!=null && color.length()>3 && color.length()<15) {
	    				System.out.println("color is valid");
	    				if(length>3 && length<1500) {
	    					System.out.println("length is valid");
	    					if(width>3 && width<1500) {
	    						System.out.println("width is valid ");
	    						System.out.println("All the properties are valid");
	    						
	    						ProjectorRepository projector=new ProjectorRepositoryImpl(); 
	    						projector.save(dto);
	    				}
	    					else {
	    						System.out.println("width is not valid");
	    					}
	    					}
	    				else {
	    					System.out.println("length is not valid");
	    				}
	    				}
	    				else {
	    					System.out.println("color is not valid");
	    				}
	    					
	    			}	
	    	}
	    	else{
	    		System.out.println("brand is not valid");
	    	}
	    
		return false;
	}

	
	}


