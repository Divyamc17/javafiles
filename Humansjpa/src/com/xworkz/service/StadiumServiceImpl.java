package com.xworkz.service;


import java.util.Optional;

import com.xworkz.entity.StadiumEntity;
import com.xworkz.repository.StadiumRepository;

public class StadiumServiceImpl implements  StadiumService{

private StadiumRepository repo;
	
	public StadiumServiceImpl() {
		this.repo=repo;
		System.out.println("create"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(StadiumEntity entity) {
		System.out.println("create and save");
		
		int id=entity.getId();
		String name=entity.getName();
		int foundedYear=entity.getFounderYear();
		double capacity=entity.getCapacity();
		double entryFees=entity.getEntryFees();
	//	StadiumCredentials type=entity.getType();
		
		if(id>0) {
			System.out.println("Id is valid");
		}
		else {
			return false;
		}
		if(name != null && name.length()>3) {
			System.out.println("name is valid");
		}
		else {
			return false;
		}
		if(foundedYear>0) {
			System.out.println("foundedYear is valid");
		}
		else {
			return false;
		}
		if(capacity>0) {
			System.out.println("capacity is valid");
		}
		else {
			return false;
		}
		if(entryFees>0) {
			System.out.println("entryFees is valid");
		}
		else {
			return false;
		}
		
		
		return repo.save(entity);
	}

	@Override
	public Optional<StadiumEntity> findById(int id) {
       if(id>0) {
    	   return this.repo.findfById(id);
       }
       
		return Optional.empty();
	}

	
}
