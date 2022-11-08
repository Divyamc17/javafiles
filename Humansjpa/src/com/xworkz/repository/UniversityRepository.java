package com.xworkz.repository;

import java.util.Optional;

import com.xworkz.entity.UniversityEntity;

public interface UniversityRepository {

	boolean create(UniversityEntity entity);
	
	Optional<UniversityEntity> findById(int id);
	
	void  updateByName(int id,String name);
}
