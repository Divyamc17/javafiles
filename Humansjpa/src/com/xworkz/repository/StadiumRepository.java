package com.xworkz.repository;

import java.util.Optional;

import com.xworkz.entity.StadiumEntity;

public interface StadiumRepository {
	
 boolean save(StadiumEntity entity);
 
 Optional<StadiumEntity> findfById(int id);
 

}
