package com.xworkz.service;

import java.util.Optional;

import com.xworkz.entity.HumanEntity;

public interface HumanService {
	
	boolean  validateAndSave(HumanEntity entity);

	Optional<HumanEntity> findById(int id);
	
	default void updateByName(int id ,String name) {
		
	}
 }
