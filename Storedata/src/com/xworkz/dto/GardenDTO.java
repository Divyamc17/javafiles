package com.xworkz.dto;

public class GardenDTO {
	
	private String name;
	private double length;
	private double width;
	private int noSeats;
	private int noTrees;
	
	public GardenDTO() {
		System.out.println("created");
	}
	
	
	public GardenDTO(String name, double length, double width, int noSeats, int noTrees) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.noSeats = noSeats;
		this.noTrees = noTrees;
	}

	

	@Override
	public String toString() {
		return "GardenDTO [name=" + name + ", length=" + length + ", width=" + width + ", noSeats=" + noSeats
				+ ", noTrees=" + noTrees + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public int getNoSeats() {
		return noSeats;
	}


	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}


	public int getNoTrees() {
		return noTrees;
	}


	public void setNoTrees(int noTrees) {
		this.noTrees = noTrees;
	}
	
	
	

}
