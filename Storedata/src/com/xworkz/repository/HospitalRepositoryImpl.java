package com.xworkz.repository;

import com.xworkz.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save method "+dto);
		return true;
	}

}
