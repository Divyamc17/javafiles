package com.xworkz.dto;

public class ProjectorDTO {
	
	private String name;
	private String brand;
	private String color;
	private double length;
	private double width;
	
	
	public ProjectorDTO() {
		System.out.println("crated");
	}
	public ProjectorDTO(String name, String brand, String color, double length, double width) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "ProjectorDTO [name=" + name + ", brand=" + brand + ", color=" + color + ", length=" + length
				+ ", width=" + width + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	
    
}
