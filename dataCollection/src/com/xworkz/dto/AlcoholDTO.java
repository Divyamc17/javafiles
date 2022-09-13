package com.xworkz.dto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable {

	private double ph;
	private double boilingPoint;
	private double meltingPoint;
	private double density;
	private String taste;
	private String nature;
	private String group;
	private double molecularWeight;
	private boolean solubilityInWater;
	private int noOfCarbon;
	private boolean flameAble;
	private String hazardous;
	private double toxicRange;// 21
	private double vapourPressure;
	private String conjugateAcid;
	private String conjugateBase;
	
	
	public AlcoholDTO() {
		
	}


	@Override
	public String toString() {
		return "AlocohalDTO [ph=" + ph + ", boilingPoint=" + boilingPoint + ", meltingPoint=" + meltingPoint
				+ ", density=" + density + ", taste=" + taste + ", nature=" + nature + ", group=" + group
				+ ", molecularWeight=" + molecularWeight + ", solubilityInWater=" + solubilityInWater + ", noOfCarbon="
				+ noOfCarbon + ", flameAble=" + flameAble + ", hazardous=" + hazardous + ", toxicRange=" + toxicRange
				+ ", vapourPressure=" + vapourPressure + ", conjugateAcid=" + conjugateAcid + ", conjugateBase="
				+ conjugateBase + "]";
	}


	public double getPh() {
		return ph;
	}


	public void setPh(double ph) {
		this.ph = ph;
	}


	public double getBoilingPoint() {
		return boilingPoint;
	}


	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}


	public double getMeltingPoint() {
		return meltingPoint;
	}


	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}


	public double getDensity() {
		return density;
	}


	public void setDensity(double density) {
		this.density = density;
	}


	public String getTaste() {
		return taste;
	}


	public void setTaste(String taste) {
		this.taste = taste;
	}


	public String getNature() {
		return nature;
	}


	public void setNature(String nature) {
		this.nature = nature;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public double getMolecularWeight() {
		return molecularWeight;
	}


	public void setMolecularWeight(double molecularWeight) {
		this.molecularWeight = molecularWeight;
	}


	public boolean isSolubilityInWater() {
		return solubilityInWater;
	}


	public void setSolubilityInWater(boolean solubilityInWater) {
		this.solubilityInWater = solubilityInWater;
	}


	public int getNoOfCarbon() {
		return noOfCarbon;
	}


	public void setNoOfCarbon(int noOfCarbon) {
		this.noOfCarbon = noOfCarbon;
	}


	public boolean isFlameAble() {
		return flameAble;
	}


	public void setFlameAble(boolean flameAble) {
		this.flameAble = flameAble;
	}


	public String getHazardous() {
		return hazardous;
	}


	public void setHazardous(String hazardous) {
		this.hazardous = hazardous;
	}


	public double getToxicRange() {
		return toxicRange;
	}


	public void setToxicRange(double toxicRange) {
		this.toxicRange = toxicRange;
	}


	public double getVapourPressure() {
		return vapourPressure;
	}


	public void setVapourPressure(double vapourPressure) {
		this.vapourPressure = vapourPressure;
	}


	public String getConjugateAcid() {
		return conjugateAcid;
	}


	public void setConjugateAcid(String conjugateAcid) {
		this.conjugateAcid = conjugateAcid;
	}


	public String getConjugateBase() {
		return conjugateBase;
	}


	public void setConjugateBase(String conjugateBase) {
		this.conjugateBase = conjugateBase;
	}
	
  
	
	
	
	
	
}
