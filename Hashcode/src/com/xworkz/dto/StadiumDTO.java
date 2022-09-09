package com.xworkz.dto;

public class StadiumDTO {
	
	private String name;
	private String place;
	private Integer noOgPlace;
	private Integer noOfGates;
	private double length;
	private double width;
	private Integer noOfCoarts;
	private Integer noOfSteps;
	private Integer noOfRooms;
	private Integer noOfSeats;
	private double basketBallLength;
	private double basketBallWidth;
	private double vollyBallLength;
	private double vollyBallWidth;
	private double openTime;
	private double closeTime;
	private boolean underGovt;
	private boolean fees;
	
	@Override
	public int hashCode() {

		return 56;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof StadiumDTO) {
	    	 System.out.println("casting done");
	    	 StadiumDTO converted=(StadiumDTO)obj;
	      if(converted.openTime==(this.openTime)&& converted.closeTime==(this.closeTime)) {
	    	  System.out.println("openTime and closeTime are equal");
	      }
	      else {
	    	  System.out.println("openTime and closeTime are not equal");
	      }
	     }
	      else {
	    	  System.out.println("casting are not done");
	      }
		}
		
		else {
			System.out.println("object is equal to null");
		}
	
		return super.equals(obj);
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public Integer getNoOgPlace() {
		return noOgPlace;
	}


	public void setNoOgPlace(Integer noOgPlace) {
		this.noOgPlace = noOgPlace;
	}


	public Integer getNoOfGates() {
		return noOfGates;
	}


	public void setNoOfGates(Integer noOfGates) {
		this.noOfGates = noOfGates;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public Integer getNoOfCoarts() {
		return noOfCoarts;
	}


	public void setNoOfCoarts(Integer noOfCoarts) {
		this.noOfCoarts = noOfCoarts;
	}


	public Integer getNoOfSteps() {
		return noOfSteps;
	}


	public void setNoOfSteps(Integer noOfSteps) {
		this.noOfSteps = noOfSteps;
	}


	public Integer getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public Integer getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public double getBasketBallLength() {
		return basketBallLength;
	}


	public void setBasketBallLength(double basketBallLength) {
		this.basketBallLength = basketBallLength;
	}


	public double getBasketBallWidth() {
		return basketBallWidth;
	}


	public void setBasketBallWidth(double basketBallWidth) {
		this.basketBallWidth = basketBallWidth;
	}


	public double getVollyBallLength() {
		return vollyBallLength;
	}


	public void setVollyBallLength(double vollyBallLength) {
		this.vollyBallLength = vollyBallLength;
	}


	public double getVollyBallWidth() {
		return vollyBallWidth;
	}


	public void setVollyBallWidth(double vollyBallWidth) {
		this.vollyBallWidth = vollyBallWidth;
	}


	public double getOpenTime() {
		return openTime;
	}


	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}


	public double getCloseTime() {
		return closeTime;
	}


	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}


	public boolean isUnderGovt() {
		return underGovt;
	}


	public void setUnderGovt(boolean underGovt) {
		this.underGovt = underGovt;
	}


	public boolean isFees() {
		return fees;
	}


	public void setFees(boolean fees) {
		this.fees = fees;
	}

	

}
