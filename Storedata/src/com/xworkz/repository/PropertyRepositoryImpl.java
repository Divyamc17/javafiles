package com.xworkz.repository;

import com.xworkz.dto.PropertyDTO;
import com.xworkz.service.PropertyService;

public class PropertyRepositoryImpl implements  PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("running method"+dto);
		return true;
	}

	
}
