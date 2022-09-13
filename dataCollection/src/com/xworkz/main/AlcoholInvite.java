package com.xworkz.main;

import com.xworkz.dao.AlcoholDAO;
import com.xworkz.dao.AlcoholDAOImpl;
import com.xworkz.dto.AlcoholDTO;

public class AlcoholInvite {

	public static void main(String[] args) {
      
		AlcoholDTO alco=new AlcoholDTO();
		alco.setPh(7.33);
		System.out.println(alco.getPh());
		alco.setBoilingPoint(78.37);
		System.out.println(alco.getMeltingPoint());
		alco.setDensity(780);
		System.out.println(alco.getDensity());
		
		
		AlcoholDAO alcohol=new AlcoholDAOImpl();
		alcohol.create(alco);

	}

}
