package com.xworkz.dto;

public class PropertyDTO {

	
	 private String name;
	 private double length;
	 private double width;
	 private String belongs;
	 private String type;
	 
	 public PropertyDTO() {
		System.out.println("created");
	}
	 
	 
	public PropertyDTO(String name, double length, double width, String belongs, String type) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.belongs = belongs;
		this.type = type;
	}


	@Override
	public String toString() {
		return "PropertyDtO [name=" + name + ", length=" + length + ", width=" + width + ", belongs=" + belongs
				+ ", type=" + type + "]";
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


	public String getBelongs() {
		return belongs;
	}


	public void setBelongs(String belongs) {
		this.belongs = belongs;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	 
	 
	 
}
