package com.xworkz.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.TransactionManager;

import com.xworkz.entity.UniversityEntity;
import com.xworkz.num.JavaUtil;

public class UniversityRepositoryImpl implements UniversityRepository {

	EntityManagerFactory factory = JavaUtil.getFactory();

	@Override
	public boolean create(UniversityEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}

	@Override
	public Optional<UniversityEntity> findById(int id) {
		EntityManager manager = factory.createEntityManager();
		UniversityEntity entity = manager.find(UniversityEntity.class, id);
		if (entity != null) {
			System.out.println("entity is found" + entity);
			return Optional.of(entity);
		} else {
			System.out.println("entity is not found" + entity);
		}

		return Optional.empty();
	}

	@Override
	public void updateByName(int id, String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		UniversityEntity entity = manager.find(UniversityEntity.class, id);
		transaction.begin();
		if (entity != null) {
			System.out.println("entity is found " + entity);
			entity.setName(name);
			manager.persist(entity);
			System.out.println("name is updated");
			transaction.commit();

		} else {
			System.out.println("entity is not found" + entity);
		}

		manager.close();

	}

}
