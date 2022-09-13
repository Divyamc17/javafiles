package com.xworkz.main;

import com.xworkz.dao.TabletDAO;
import com.xworkz.dao.TabletDAOImpl;
import com.xworkz.dto.TabletDTO;

public class TabletInvite {

	public static void main(String[] args) {
		
		TabletDTO tab=new TabletDTO();
		tab.setName("Dolo 650");
		tab.setMg(650);
		tab.setPrice(2);
		tab.setManudactureDate(2022.04);
		tab.setComposition("Paracetamol");
		
		TabletDAO tablet=new TabletDAOImpl();
		tablet.create(tab);

	}

}
