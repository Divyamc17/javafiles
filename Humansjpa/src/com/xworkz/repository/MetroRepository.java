package com.xworkz.repository;

import java.util.Optional;

import com.xworkz.entity.MetroEntity;

public interface MetroRepository {

	boolean save(MetroEntity entity);
	
	Optional<MetroEntity> findByNameId(int id);

}
