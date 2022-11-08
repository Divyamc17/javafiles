package com.xworkz.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.entity.HumanEntity;
import com.xworkz.num.JavaUtil;

public class HumanRepositoryImpl implements HumanRepository {

	EntityManagerFactory factoryAbstraction = JavaUtil.getFactory();

	@Override
	public boolean save(HumanEntity entity) {

		EntityManager manager = factoryAbstraction.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();

		return false;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {
		EntityManager manager = this.factoryAbstraction.createEntityManager();
		HumanEntity entity = manager.find(HumanEntity.class, id);
		if (entity != null) {
			System.out.println("entity id is found" + entity);
			return Optional.of(entity);
		} else {
			System.out.println("entity is not found" + id);
		}
		return Optional.empty();
	}

	@Override
	public void updateByName(int id, String name) {

		EntityManager manager = this.factoryAbstraction.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			HumanEntity entity = manager.find(HumanEntity.class, id);
			if (entity != null) {
				System.out.println("id is found" + entity);
				entity.setName(name);
				manager.persist(entity);
				System.out.println("it is updated");

			} else {
				System.out.println("id is not found");
			}
			transaction.commit();

		} finally {
			manager.close();
		}
		HumanRepository.super.updateByName(id, name);

	}
}
