package com.xworkz.repository;

import com.xworkz.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("created");
		return false;
	}

}
