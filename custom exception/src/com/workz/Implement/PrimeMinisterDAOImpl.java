package com.workz.Implement;

import com.xworkz.dao.PrimeMinisterDAO;
import com.xworkz.exception.LimitSurpassException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {

	private String[] dataStore = new String[5];
	private int position;

	@Override
	public boolean save(String name) {
		if (this.position < dataStore.length) {
			this.dataStore[position] = name;
			System.out.println("Prime Minister name is saved" + name + "in position" + this.position);
			this.position++;
		}else {
			throw new LimitSurpassException("Position surpassed.");
		}
		return true;
	}

	@Override
	public boolean chekDetails(String name) {
		for (String ref : this.dataStore) {
			if (ref != null && ref.equals(name)) {
				System.out.println("name is saved");
			} else {
				System.out.println("name is not saved");
			}
		}

		return true;
	}

}
