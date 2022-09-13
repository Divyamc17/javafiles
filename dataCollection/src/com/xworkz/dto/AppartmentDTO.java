package com.xworkz.dto;

import java.io.Serializable;
import java.util.Arrays;

public class AppartmentDTO implements Serializable {

	private String name;
	private String place;
	private String ownerName;
	private Integer noOFFloors;
	private double length;
	private double width;
	private double rent;
	private boolean liftAvailable;
	private boolean swimmingPool;
	private Integer[] noOfBlocks;
	private String paymentType;
	private long pinCode;
	private boolean parkingAvailable;
	private boolean ventilation;
	private boolean nearToCity; 
	
	public AppartmentDTO() {
		
	}

	@Override
	public String toString() {
		return "AppartmentDTO [name=" + name + ", place=" + place + ", ownerName=" + ownerName + ", noOFFloors="
				+ noOFFloors + ", length=" + length + ", width=" + width + ", rent=" + rent + ", lifeAvailable="
				+ liftAvailable + ", swimmingPool=" + swimmingPool + ", noOfBlocks=" + Arrays.toString(noOfBlocks)
				+ ", paymentType=" + paymentType + ", pinCode=" + pinCode + ", parkingAvailable=" + parkingAvailable
				+ ", ventilation=" + ventilation + ", nearToCity=" + nearToCity + "]";
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getNoOFFloors() {
		return noOFFloors;
	}

	public void setNoOFFloors(Integer noOFFloors) {
		this.noOFFloors = noOFFloors;
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

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public boolean isLiftAvailable() {
		return liftAvailable;
	}

	public void setLiftAvailable(boolean liftAvailable) {
		this.liftAvailable = liftAvailable;
	}

	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public Integer[] getNoOfBlocks() {
		return noOfBlocks;
	}

	public void setNoOfBlocks(Integer[] noOfBlocks) {
		this.noOfBlocks = noOfBlocks;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	public boolean isVentilation() {
		return ventilation;
	}

	public void setVentilation(boolean ventilation) {
		this.ventilation = ventilation;
	}

	public boolean isNearToCity() {
		return nearToCity;
	}

	public void setNearToCity(boolean nearToCity) {
		this.nearToCity = nearToCity;
	}
	
	
	
}
