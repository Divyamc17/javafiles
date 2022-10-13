package com.xworkz.dto;

public class HospitalDTO {
	
	private int id;
	private String name;
	private String specialist;
	private String founder;
	private int since;
	  
	public HospitalDTO() {
	 
	}

	public HospitalDTO(int id, String name, String specialist, String founder, int since) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.founder = founder;
		this.since = since;
	}

	@Override
	public String toString() {
		return "HospitalDTO [id=" + id + ", name=" + name + ", specialist=" + specialist + ", founder=" + founder
				+ ", since=" + since + "]";
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

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}
	

}
