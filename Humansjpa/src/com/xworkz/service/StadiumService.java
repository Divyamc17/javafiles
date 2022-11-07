package com.xworkz.service;

import java.util.Optional;

import com.xworkz.entity.StadiumEntity;

public interface StadiumService {

	boolean validateAndSave(StadiumEntity entity);
	
	Optional<StadiumEntity> findById(int id);
}
 