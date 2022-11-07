package com.xworkz.service;

import java.util.Optional;

import com.xworkz.entity.MetroEntity;

public interface MetroService {
	
	boolean validateAndSave(MetroEntity entity);
	
	Optional<MetroEntity> findByNameId(int id);

}
