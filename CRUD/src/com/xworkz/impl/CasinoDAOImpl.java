package com.xworkz.impl;

import com.xworkz.casion.dao.CasinoDAO;

public class CasinoDAOImpl implements CasinoDAO {

	private CasinoDAO[] casino=new CasinoDAO[5];
	private int index=0;
	
	
	@Override
	public boolean save(CasinoDAO name) {
		System.out.println("casio save"+name+"is into"+this.index);
		this.casino[index]=name;
		this.index++;
		return true;
	}
	
	
	

}
