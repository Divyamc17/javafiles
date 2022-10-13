package com.xworkz.repository;

import com.xworkz.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("running method is created"+dto);
		return false;
	}

}
