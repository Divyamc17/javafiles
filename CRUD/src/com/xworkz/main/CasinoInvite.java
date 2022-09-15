package com.xworkz.main;

import com.xworkz.casion.dao.CasinoDAO;
import com.xworkz.casion.dao.CasinoService;
import com.xworkz.impl.CasinoDAOImpl;
import com.xworkz.impl.CasinoServiceImpl;

public class CasinoInvite {
	
public static void main(String[] args) {
	
	CasinoDAO casinoDAO= new CasinoDAOImpl();
	
	CasinoService casinoService=new CasinoServiceImpl(casinoDAO);
	casinoService.validation("pride");
	
	
}
}
