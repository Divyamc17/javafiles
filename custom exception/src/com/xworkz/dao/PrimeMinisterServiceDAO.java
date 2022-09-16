package com.xworkz.dao;

import com.xworkz.exception.NameValidException;

public interface PrimeMinisterServiceDAO {
	
	boolean validationAndCheck(String name) throws NameValidException;

}
