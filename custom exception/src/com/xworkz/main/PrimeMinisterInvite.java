package com.xworkz.main;

import com.workz.Implement.PrimeMinisterDAOImpl;

import com.workz.Implement.PrimeMinisterServiceDAOImpl;
import com.xworkz.dao.PrimeMinisterDAO;
import com.xworkz.dao.PrimeMinisterServiceDAO;
import com.xworkz.exception.LimitSurpassException;
import com.xworkz.exception.NameValidException;

public class PrimeMinisterInvite {

	public static void main(String[] args)    {
		
		PrimeMinisterDAO pm=new PrimeMinisterDAOImpl();
		
		PrimeMinisterServiceDAO pmdao=new PrimeMinisterServiceDAOImpl(pm);
		try {
		pmdao.validationAndCheck("Narendra Modi");
		}
		catch (NameValidException nve)
		{
			nve.getMessage();
		}
		catch (LimitSurpassException lse)
		{
			lse.getMessage();
		}
	}

}
