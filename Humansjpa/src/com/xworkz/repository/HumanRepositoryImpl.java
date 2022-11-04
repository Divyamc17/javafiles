package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.entity.HumanEntity;

public class HumanRepositoryImpl implements HumanRepository {

	EntityManagerFactory managerfactory= Persistence.createEntityManagerFactory("com.xworkz");
	@Override
	public boolean save(HumanEntity entity) {
		
				EntityManager manager= managerfactory.createEntityManager();
				EntityTransaction transaction=manager.getTransaction();
				transaction.begin();
				manager.persist(entity);
				transaction.commit();
				managerfactory.close();
		        return false;
	}

}
