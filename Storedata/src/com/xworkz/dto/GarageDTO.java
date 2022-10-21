package com.xworkz.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class GarageDTO implements Serializable {

	private String name;
	private String owner;
	private double openTime;
	private double closeTime;
	private int noOfStaff;
	
	public GarageDTO() {
		System.out.println("default");
	}

	public GarageDTO(String name, String owner, double openTime, double closeTime, int noOfStaff) {
		super();
		this.name = name;
		this.owner = owner;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.noOfStaff = noOfStaff;
	}

	@Override
	public String toString() {
		return "GarageDTO [name=" + name + ", owner=" + owner + ", openTime=" + openTime + ", closeTime=" + closeTime
				+ ", noOfStaff=" + noOfStaff + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	
	
}
