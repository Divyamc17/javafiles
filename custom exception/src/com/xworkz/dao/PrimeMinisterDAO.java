package com.xworkz.dao;

import com.xworkz.exception.LimitSurpassException;

public interface PrimeMinisterDAO {
  
	boolean save(String name) throws LimitSurpassException;
	
	boolean chekDetails(String name);
}
