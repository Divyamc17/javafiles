package com.xworkz.sortdto;

public class HouseDto {
	
	private int id;
	private String name;
	private String owner;
	private Type Type;
	private int noOfFloors;
	private boolean loan;
	private OwningType OwningType;
	private double sqfeet;
	
	public HouseDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	



	public HouseDto(int id, String name, String owner, com.xworkz.sortdto.Type type, int noOfFloors, boolean loan,
			com.xworkz.sortdto.OwningType owningType, double sqfeet) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		Type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		OwningType = owningType;
		this.sqfeet = sqfeet;
	}







	@Override
	public String toString() {
		return "HouseDto [id=" + id + ", name=" + name + ", owner=" + owner + ", Type=" + Type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", OwningType=" + OwningType + ", sqfeet=" + sqfeet + "]";
	}







	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
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







	public Type getType() {
		return Type;
	}







	public void setType(Type type) {
		Type = type;
	}







	public int getNoOfFloors() {
		return noOfFloors;
	}







	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}







	public boolean getLoan() {
		return loan;
	}







	public void setLoan(boolean loan) {
		this.loan = loan;
	}







	public OwningType getOwningType() {
		return OwningType;
	}







	public void setOwningType(OwningType owningType) {
		OwningType = owningType;
	}







	public double getSqfeet() {
		return sqfeet;
	}







	public void setSqfeet(double sqfeet) {
		this.sqfeet = sqfeet;
	}



    

}
