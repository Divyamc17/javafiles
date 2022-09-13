package com.xworkz.dto;

import java.io.Serializable;

public class TabletDTO implements Serializable {
	
     private String name;
     private int mg;
     private String solubility;
     private String composition;
     private String manufacture;
     private String storedTemp;
     private String therapy;
     private double price;
     private String tabletAction;
     private String drugClass;
     private double manudactureDate;
     private double experyDate;
     private String companyName;
   
     public TabletDTO() {
	 System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "TabletIDTO [name=" + name + ", mg=" + mg + ", solubility=" + solubility + ", composition=" + composition
				+ ", manufacture=" + manufacture + ", storedTemp=" + storedTemp + ", therapy=" + therapy + ", price="
				+ price + ", tabletAction=" + tabletAction + ", drugClass=" + drugClass + ", manudactureDate="
				+ manudactureDate + ", experyDate=" + experyDate + ", companyName=" + companyName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}

	public String getSolubility() {
		return solubility;
	}

	public void setSolubility(String solubility) {
		this.solubility = solubility;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getStoredTemp() {
		return storedTemp;
	}

	public void setStoredTemp(String storedTemp) {
		this.storedTemp = storedTemp;
	}

	public String getTherapy() {
		return therapy;
	}

	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTabletAction() {
		return tabletAction;
	}

	public void setTabletAction(String tabletAction) {
		this.tabletAction = tabletAction;
	}

	public String getDrugClass() {
		return drugClass;
	}

	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}

	public double getManudactureDate() {
		return manudactureDate;
	}

	public void setManudactureDate(double manudactureDate) {
		this.manudactureDate = manudactureDate;
	}

	public double getExperyDate() {
		return experyDate;
	}

	public void setExperyDate(double experyDate) {
		this.experyDate = experyDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
     
     
     
     
}
