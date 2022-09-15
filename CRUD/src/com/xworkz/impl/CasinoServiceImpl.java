package com.xworkz.impl;

import com.xworkz.casion.dao.CasinoDAO;
import com.xworkz.casion.dao.CasinoService;

public class CasinoServiceImpl implements CasinoService {

	CasinoDAO casinoDAO;
	private CasinoDAO[] dataStore=new CasinoDAOImpl[6];
	public CasinoServiceImpl(CasinoDAO casinoDAO) {
		this.casinoDAO=casinoDAO;
	}
	
	@Override
	public boolean validation(String name) {
		if(name!=null && name.length()>2 && name.length()<50){
			System.out.println("name is not null");
			for (int i = 0; i < dataStore.length; i++) {
				
			}
		
		}
	
		return false;
		}	
	

}
