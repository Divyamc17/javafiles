package com.xworkz.repository;

import java.util.Optional;

import com.xworkz.entity.HumanEntity;

public interface HumanRepository {
	
	boolean save(HumanEntity entity);
	
	Optional<HumanEntity> findById(int id);
	
	default void updateByName(int id ,String name) {
		 
		
	}

	
}

