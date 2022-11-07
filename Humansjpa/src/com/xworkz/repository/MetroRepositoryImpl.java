package com.xworkz.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.MetroEntity;
import com.xworkz.num.JavaUtil;

public class MetroRepositoryImpl implements MetroRepository {

	
	EntityManagerFactory factory = JavaUtil.getFactory();
	
	@Override
	public boolean save(MetroEntity entity) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}

	@Override
	public Optional<MetroEntity> findByNameId(int id) {
         EntityManager manager=this.factory.createEntityManager();
         MetroEntity entity=manager.find(MetroEntity.class, id);
         if(entity !=null) {
        	 System.out.println("entity found for id"+entity);
        	 return Optional.of(entity);
         }else {
        	 System.err.println("entity found for id"+id);
         }
         
         return Optional.empty();
	}

}
