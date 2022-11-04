package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.StadiumEntity;

public class StadiumRepositoryImpl implements StadiumRepository {

	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
	@Override
	public boolean save(StadiumEntity entity) {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			manager.close();
			
			return true;
		}
				
		
	}


