package com.xworkz.dto;

import java.io.Serializable;

public class SpeakerDTO implements Serializable { 
	
	private String brand;
	private String modelName;
	private String speakerType;
	private String connectivityTecnology;
	private String specialFeature;
	private String recommended;
	private String mountingType;
	private String netQuantity;
	private double soundChannel;
 
	
   public SpeakerDTO() {
	System.out.println("default constructor");
}


@Override
public String toString() {
	return "SpeakerDTO [brand=" + brand + ", modelName=" + modelName + ", speakerType=" + speakerType
			+ ", connectivityTecnology=" + connectivityTecnology + ", specialFeature=" + specialFeature
			+ ", recommended=" + recommended + ", mountingType=" + mountingType + ", netQuantity=" + netQuantity
			+ ", soundChannel=" + soundChannel + "]";
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getModelName() {
	return modelName;
}


public void setModelName(String modelName) {
	this.modelName = modelName;
}


public String getSpeakerType() {
	return speakerType;
}


public void setSpeakerType(String speakerType) {
	this.speakerType = speakerType;
}


public String getConnectivityTecnology() {
	return connectivityTecnology;
}


public void setConnectivityTecnology(String connectivityTecnology) {
	this.connectivityTecnology = connectivityTecnology;
}


public String getSpecialFeature() {
	return specialFeature;
}


public void setSpecialFeature(String specialFeature) {
	this.specialFeature = specialFeature;
}


public String getRecommended() {
	return recommended;
}


public void setRecommended(String recommended) {
	this.recommended = recommended;
}


public String getMountingType() {
	return mountingType;
}


public void setMountingType(String mountingType) {
	this.mountingType = mountingType;
}


public String getNetQuantity() {
	return netQuantity;
}


public void setNetQuantity(String netQuantity) {
	this.netQuantity = netQuantity;
}


public double getSoundChannel() {
	return soundChannel;
}


public void setSoundChannel(double soundChannel) {
	this.soundChannel = soundChannel;
}	
   
   

}
