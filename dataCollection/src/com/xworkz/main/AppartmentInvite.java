package com.xworkz.main;

import com.xworkz.dao.AppartmentDAO;
import com.xworkz.dao.AppartmentDAOImpl;
import com.xworkz.dto.AppartmentDTO;

public class AppartmentInvite  {
	public static void main(String[] args) {
	
	AppartmentDTO appart=new AppartmentDTO();
	appart.setName("Gokul");
	appart.setPlace("Bengaluru");
	appart.setLiftAvailable(true);
	
	AppartmentDAO appartment=new AppartmentDAOImpl();
	appartment.create(appart);
	
	}
}
