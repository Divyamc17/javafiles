package com.xworkz.impl;

import com.xworkz.casion.dao.TouristPlaceDAO;
import com.xworkz.casion.dao.TouristPlaceService;

public class PlaceServiceImpl implements TouristPlaceService {

	 private TouristPlaceDAO touristplace;
	 
	 public PlaceServiceImpl(TouristPlaceDAO touristplace) {
	  this.touristplace=touristplace;
	}
	 
	@Override
	public boolean checkAndValidate(String place) throws TouristPlaceValidException {
		if(place !=null && place.length()>2 && place.length()<10) {
			if(this.touristplace.checkDetails(place)) {
				System.out.println("place name is present");
				throw new TouristPlaceValidException(" valid");
			}
			else {
				System.out.println("place name is not present");
			}
		}
		else {
			System.out.println("place is not present");
			throw new TouristPlaceValidException("not valid");
		}
		
      return false;
	}

}
