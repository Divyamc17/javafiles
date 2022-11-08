package com.xworkz.service;

import java.util.Optional;

import com.xworkz.entity.UniversityEntity;

public interface UniversityService {

	
boolean validateAndSave(UniversityEntity entity);
	
	Optional<UniversityEntity> findById(int id);
	
	void  updateByName(int id,String name);
}
