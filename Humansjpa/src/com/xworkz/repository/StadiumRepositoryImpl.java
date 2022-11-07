package com.xworkz.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.StadiumEntity;
import com.xworkz.num.JavaUtil;

public class StadiumRepositoryImpl implements StadiumRepository {

	
	EntityManagerFactory factory = JavaUtil.getFactory();
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
	@Override
	public Optional<StadiumEntity> findfById(int id) {
		EntityManager manager=factory.createEntityManager();
		StadiumEntity entity=manager.find(StadiumEntity.class, id);
		if(entity!=null) {
			System.out.println("id is found"+entity);
			return Optional.of(entity);
		}else {
			System.out.println("id is not found"+entity);
		}
		return Optional.empty();
	}
				
		
	}


