package com.xworkz.service;

import java.util.Optional;

import com.xworkz.entity.UniversityEntity;
import com.xworkz.repository.UniversityRepository;

public class UniversityServiceImpl implements UniversityService {

	UniversityRepository repo;
	
	public UniversityServiceImpl(UniversityRepository repo) {
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(UniversityEntity entity) {
	
     		return repo.create(entity);
	}
	@Override
	public Optional<UniversityEntity> findById(int id) {
     if(id>0) {
    	 System.out.println("id is found");
    	 return this.repo.findById(id);
     }
		return Optional.empty() ;
	}

	@Override
	public void updateByName(int id, String name) {
		if(id>0) {
	    	 System.out.println("id is found");
	    	  this.repo.updateByName(id, name);
	     }
	}

}
