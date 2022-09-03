package com.xworkz.dto;

public class SolarSystemDTO {
	
  private Integer earthRadius; 
  private Integer earthPolarRadius;
  private Integer earthFalttening;
  private Integer earthCircumference;
  private Integer earthSurfaceArea;
  private Integer earthVolume;
  private Integer earthMass;
  private Integer earthDensity;
  private Integer earthSurfaceGravity;
  private Integer earthMomentaOfInertia;
  private Integer earthVelocity;
  private Integer earthRotataionPeriod;
  private Integer earthAxialTilt;
  private Integer earthalbedo;
  private Integer earthPressure;
  private Integer jupitarRadius;
  private Integer jupitarPolar;
  private Integer jupitarFlattening;
  private Integer jupitarSurfaceArea;
  private Integer jupitarVolume;
  private Integer jupitarMass;
  private Integer jupitarDensity;
  private Integer jupitarSuefaceGravity;
  private Integer jupitarMOI;
  private Integer jupitarEscapeVelcity;
  private Integer jupitarRotationPeriod;
  private Integer jupitarAxilTilt;
  private Integer jupitarDEclination;
  private Integer jupitarAlebedo;
  private Integer venusDistenceFronSun;
  private Integer venuseccentricityOfOrbit;
  private Integer venusRotationPeriod;
  private Integer venusOrbitalVelocity;
  private Integer venusSourfaceArea;
  private Integer venusMass;
  private Integer venusMeanDensity;
  private Integer venusSuefaceGravity; 
  private Integer saturnRadius;
  private Integer saturnPolarRadius;
  private Integer saturnSurfaceArea;
  private Integer saturnVolume;
  private Integer saturnMass;
  private Integer saturnDensity;
  private Integer saturnAlebedo;
  private Integer saturnPressure;
  private Integer saturnRotationPeriod;
  
  
  @Override
	public int hashCode() {

		return 600;
	}
  

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof SolarSystemDTO) {
	    	 System.out.println("casting done");
	    	 SolarSystemDTO converted=(SolarSystemDTO)obj;
	      if(converted.earthRadius.equals(this.earthRadius)&& converted.saturnRadius.equals(this.saturnRadius)&&
	    	 converted.earthPolarRadius.equals(this.earthPolarRadius)&&converted.earthVolume.equals(this.earthVolume) 
	    	 &&converted.earthAxialTilt.equals(this.earthAxialTilt)&&converted.saturnAlebedo.equals(this.saturnAlebedo)
             &&converted.saturnVolume.equals(this.saturnVolume)&&converted.saturnMass.equals(this.saturnMass)&&	
             converted.venusSourfaceArea.equals(this.venusSourfaceArea)&&converted.jupitarDensity.equals(this.jupitarDensity)) {
	    	  System.out.println("All are equal");
	      }
	      else {
	    	  System.out.println("All are not equal");
	      }
	     }
	      else {
	    	  System.out.println("casting are not done");
	      }
		}
		
		else {
			System.out.println("object is equal to null");
		}
	
		return super.equals(obj);
	}


	public Integer getEarthRadius() {
		return earthRadius;
	}


	public void setEarthRadius(Integer earthRadius) {
		this.earthRadius = earthRadius;
	}


	public Integer getEarthPolarRadius() {
		return earthPolarRadius;
	}


	public void setEarthPolarRadius(Integer earthPolarRadius) {
		this.earthPolarRadius = earthPolarRadius;
	}


	public Integer getEarthFalttening() {
		return earthFalttening;
	}


	public void setEarthFalttening(Integer earthFalttening) {
		this.earthFalttening = earthFalttening;
	}


	public Integer getEarthCircumference() {
		return earthCircumference;
	}


	public void setEarthCircumference(Integer earthCircumference) {
		this.earthCircumference = earthCircumference;
	}


	public Integer getEarthSurfaceArea() {
		return earthSurfaceArea;
	}


	public void setEarthSurfaceArea(Integer earthSurfaceArea) {
		this.earthSurfaceArea = earthSurfaceArea;
	}


	public Integer getEarthVolume() {
		return earthVolume;
	}


	public void setEarthVolume(Integer earthVolume) {
		this.earthVolume = earthVolume;
	}


	public Integer getEarthMass() {
		return earthMass;
	}


	public void setEarthMass(Integer earthMass) {
		this.earthMass = earthMass;
	}


	public Integer getEarthDensity() {
		return earthDensity;
	}


	public void setEarthDensity(Integer earthDensity) {
		this.earthDensity = earthDensity;
	}


	public Integer getEarthSurfaceGravity() {
		return earthSurfaceGravity;
	}


	public void setEarthSurfaceGravity(Integer earthSurfaceGravity) {
		this.earthSurfaceGravity = earthSurfaceGravity;
	}


	public Integer getEarthMomentaOfInertia() {
		return earthMomentaOfInertia;
	}


	public void setEarthMomentaOfInertia(Integer earthMomentaOfInertia) {
		this.earthMomentaOfInertia = earthMomentaOfInertia;
	}


	public Integer getEarthVelocity() {
		return earthVelocity;
	}


	public void setEarthVelocity(Integer earthVelocity) {
		this.earthVelocity = earthVelocity;
	}


	public Integer getEarthRotataionPeriod() {
		return earthRotataionPeriod;
	}


	public void setEarthRotataionPeriod(Integer earthRotataionPeriod) {
		this.earthRotataionPeriod = earthRotataionPeriod;
	}


	public Integer getEarthAxialTilt() {
		return earthAxialTilt;
	}


	public void setEarthAxialTilt(Integer earthAxialTilt) {
		this.earthAxialTilt = earthAxialTilt;
	}


	public Integer getEarthalbedo() {
		return earthalbedo;
	}


	public void setEarthalbedo(Integer earthalbedo) {
		this.earthalbedo = earthalbedo;
	}


	public Integer getEarthPressure() {
		return earthPressure;
	}


	public void setEarthPressure(Integer earthPressure) {
		this.earthPressure = earthPressure;
	}


	public Integer getJupitarRadius() {
		return jupitarRadius;
	}


	public void setJupitarRadius(Integer jupitarRadius) {
		this.jupitarRadius = jupitarRadius;
	}


	public Integer getJupitarPolar() {
		return jupitarPolar;
	}


	public void setJupitarPolar(Integer jupitarPolar) {
		this.jupitarPolar = jupitarPolar;
	}


	public Integer getJupitarFlattening() {
		return jupitarFlattening;
	}


	public void setJupitarFlattening(Integer jupitarFlattening) {
		this.jupitarFlattening = jupitarFlattening;
	}


	public Integer getJupitarSurfaceArea() {
		return jupitarSurfaceArea;
	}


	public void setJupitarSurfaceArea(Integer jupitarSurfaceArea) {
		this.jupitarSurfaceArea = jupitarSurfaceArea;
	}


	public Integer getJupitarVolume() {
		return jupitarVolume;
	}


	public void setJupitarVolume(Integer jupitarVolume) {
		this.jupitarVolume = jupitarVolume;
	}


	public Integer getJupitarMass() {
		return jupitarMass;
	}


	public void setJupitarMass(Integer jupitarMass) {
		this.jupitarMass = jupitarMass;
	}


	public Integer getJupitarDensity() {
		return jupitarDensity;
	}


	public void setJupitarDensity(Integer jupitarDensity) {
		this.jupitarDensity = jupitarDensity;
	}


	public Integer getJupitarSuefaceGravity() {
		return jupitarSuefaceGravity;
	}


	public void setJupitarSuefaceGravity(Integer jupitarSuefaceGravity) {
		this.jupitarSuefaceGravity = jupitarSuefaceGravity;
	}


	public Integer getJupitarMOI() {
		return jupitarMOI;
	}


	public void setJupitarMOI(Integer jupitarMOI) {
		this.jupitarMOI = jupitarMOI;
	}


	public Integer getJupitarEscapeVelcity() {
		return jupitarEscapeVelcity;
	}


	public void setJupitarEscapeVelcity(Integer jupitarEscapeVelcity) {
		this.jupitarEscapeVelcity = jupitarEscapeVelcity;
	}


	public Integer getJupitarRotationPeriod() {
		return jupitarRotationPeriod;
	}


	public void setJupitarRotationPeriod(Integer jupitarRotationPeriod) {
		this.jupitarRotationPeriod = jupitarRotationPeriod;
	}


	public Integer getJupitarAxilTilt() {
		return jupitarAxilTilt;
	}


	public void setJupitarAxilTilt(Integer jupitarAxilTilt) {
		this.jupitarAxilTilt = jupitarAxilTilt;
	}


	public Integer getJupitarDEclination() {
		return jupitarDEclination;
	}


	public void setJupitarDEclination(Integer jupitarDEclination) {
		this.jupitarDEclination = jupitarDEclination;
	}


	public Integer getJupitarAlebedo() {
		return jupitarAlebedo;
	}


	public void setJupitarAlebedo(Integer jupitarAlebedo) {
		this.jupitarAlebedo = jupitarAlebedo;
	}


	public Integer getVenusDistenceFronSun() {
		return venusDistenceFronSun;
	}


	public void setVenusDistenceFronSun(Integer venusDistenceFronSun) {
		this.venusDistenceFronSun = venusDistenceFronSun;
	}


	public Integer getVenuseccentricityOfOrbit() {
		return venuseccentricityOfOrbit;
	}


	public void setVenuseccentricityOfOrbit(Integer venuseccentricityOfOrbit) {
		this.venuseccentricityOfOrbit = venuseccentricityOfOrbit;
	}


	public Integer getVenusRotationPeriod() {
		return venusRotationPeriod;
	}


	public void setVenusRotationPeriod(Integer venusRotationPeriod) {
		this.venusRotationPeriod = venusRotationPeriod;
	}


	public Integer getVenusOrbitalVelocity() {
		return venusOrbitalVelocity;
	}


	public void setVenusOrbitalVelocity(Integer venusOrbitalVelocity) {
		this.venusOrbitalVelocity = venusOrbitalVelocity;
	}


	public Integer getVenusSourfaceArea() {
		return venusSourfaceArea;
	}


	public void setVenusSourfaceArea(Integer venusSourfaceArea) {
		this.venusSourfaceArea = venusSourfaceArea;
	}


	public Integer getVenusMass() {
		return venusMass;
	}


	public void setVenusMass(Integer venusMass) {
		this.venusMass = venusMass;
	}


	public Integer getVenusMeanDensity() {
		return venusMeanDensity;
	}


	public void setVenusMeanDensity(Integer venusMeanDensity) {
		this.venusMeanDensity = venusMeanDensity;
	}


	public Integer getVenusSuefaceGravity() {
		return venusSuefaceGravity;
	}


	public void setVenusSuefaceGravity(Integer venusSuefaceGravity) {
		this.venusSuefaceGravity = venusSuefaceGravity;
	}


	public Integer getSaturnRadius() {
		return saturnRadius;
	}


	public void setSaturnRadius(Integer saturnRadius) {
		this.saturnRadius = saturnRadius;
	}


	public Integer getSaturnPolarRadius() {
		return saturnPolarRadius;
	}


	public void setSaturnPolarRadius(Integer saturnPolarRadius) {
		this.saturnPolarRadius = saturnPolarRadius;
	}


	public Integer getSaturnSurfaceArea() {
		return saturnSurfaceArea;
	}


	public void setSaturnSurfaceArea(Integer saturnSurfaceArea) {
		this.saturnSurfaceArea = saturnSurfaceArea;
	}


	public Integer getSaturnVolume() {
		return saturnVolume;
	}


	public void setSaturnVolume(Integer saturnVolume) {
		this.saturnVolume = saturnVolume;
	}


	public Integer getSaturnMass() {
		return saturnMass;
	}


	public void setSaturnMass(Integer saturnMass) {
		this.saturnMass = saturnMass;
	}


	public Integer getSaturnDensity() {
		return saturnDensity;
	}


	public void setSaturnDensity(Integer saturnDensity) {
		this.saturnDensity = saturnDensity;
	}


	public Integer getSaturnAlebedo() {
		return saturnAlebedo;
	}


	public void setSaturnAlebedo(Integer saturnAlebedo) {
		this.saturnAlebedo = saturnAlebedo;
	}


	public Integer getSaturnPressure() {
		return saturnPressure;
	}


	public void setSaturnPressure(Integer saturnPressure) {
		this.saturnPressure = saturnPressure;
	}


	public Integer getSaturnRotationPeriod() {
		return saturnRotationPeriod;
	}


	public void setSaturnRotationPeriod(Integer saturnRotationPeriod) {
		this.saturnRotationPeriod = saturnRotationPeriod;
	}
  
  
  
  
}
