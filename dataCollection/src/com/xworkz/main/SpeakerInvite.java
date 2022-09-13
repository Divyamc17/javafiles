package com.xworkz.main;

import com.xworkz.dao.SpeakerDAO;
import com.xworkz.dao.SpeakerDAOImpl;
import com.xworkz.dto.SpeakerDTO;

public class SpeakerInvite {

	public static void main(String[] args) {
		
		SpeakerDTO speker= new SpeakerDTO();
		speker.setBrand("JBL");
		speker.setModelName("Flip 4");
		speker.setMountingType("Tabletop");
		speker.setRecommended("For smartphones or tablet");
		
		SpeakerDAO speak=new SpeakerDAOImpl();
		speak.create(speker);
		

	}

}
