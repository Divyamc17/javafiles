package com.xworkz.impl;

public class TouristPlaceValidException extends Exception {
	
	public TouristPlaceValidException(String msg) {
		super(msg);
		System.out.println("checking the exception");
	}

}
