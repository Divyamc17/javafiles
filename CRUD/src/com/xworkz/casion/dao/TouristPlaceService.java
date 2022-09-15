package com.xworkz.casion.dao;

import com.xworkz.impl.TouristPlaceValidException;

public interface TouristPlaceService {
	
	boolean checkAndValidate(String place) throws TouristPlaceValidException;

}
