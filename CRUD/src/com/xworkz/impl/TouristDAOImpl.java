package com.xworkz.impl;

import com.xworkz.casion.dao.TouristPlaceDAO;

public class TouristDAOImpl implements TouristPlaceDAO {

	private String[] dataStore=new String[10];
	private int position;
	
	@Override
	public boolean save(String place) {
		this.dataStore[position]=place;
		System.out.println("datastored"+place+"index"+this.position);
		this.position++;
		
		return false;
	}

	@Override
	public boolean checkDetails(String place) {
		for(String ref :this.dataStore) {
			if(ref !=null && ref.equals(place)) {
				System.out.println("place is checked");
				boolean refs=this.save(place);
						return refs;
			}
		
		}
		return false;
	}

}
