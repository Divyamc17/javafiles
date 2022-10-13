package com.xworkz.service;

import com.xworkz.dto.PropertyDTO;

public class PropertyServiceImpl implements PropertyService {
    
	
	public PropertyServiceImpl() {
	System.out.println("created");
}
	
	@Override
	public boolean validateAndSave(PropertyDTO dto) {
		System.out.println("method is saved"+dto);
		String name=dto.getName();
		double length=dto.getLength();
		double width=dto.getWidth();
		String belongs=dto.getBelongs();
		String type=dto.getType();
		if(name!=null && name.length()>3 && name.length()<40) {
			System.out.println("name is valid");
			if(length>100 && length<1000) {
				System.out.println("length is valid");
				if(width>100 && width<1000) {
					System.out.println("width is valid");
					if(belongs.length()>3 && belongs.length()<20) {
						System.out.println("belongs is valid");
						if(type.length()>2 && type.length()<10) {
							System.out.println("type is valid");
						}
						else {
							System.err.println("type is not valid");
						}
					}
					else {
						System.err.println("belongs is not valid");
					}
				}
				else {
					System.err.println("width is not valid");
				}
			}
			else {
				System.err.println("length is not valid");
			}
		}
		else {
			System.err.println("name is not valid");
		}

	
		return false;
	
	}
}
