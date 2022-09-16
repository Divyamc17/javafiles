package com.workz.Implement;

import com.xworkz.dao.PrimeMinisterDAO;
import com.xworkz.dao.PrimeMinisterServiceDAO;
import com.xworkz.exception.NameValidException;

public class PrimeMinisterServiceDAOImpl implements PrimeMinisterServiceDAO {

	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceDAOImpl(PrimeMinisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validationAndCheck(String name) throws NameValidException {
		if (name != null && name.length() > 5 && name.length() < 50) {
			if (this.dao.chekDetails(name)) {
				System.out.println("Name is saved");
				return dao.save(name);

			} else {
				System.out.println("Name is not exist you can save");
				throw new NameValidException("==");
			}
		}else {
			throw new NameValidException("invalid name");
		}
	}
}
