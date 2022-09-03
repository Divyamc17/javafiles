package com.xworkz.dto;

public class CitiesDTO {

	private Integer bhadravathiArea;
	private Integer bhadravathiElevation;
	private Integer bhadravathiDensity;
	private Integer bidarArea;
	private Integer bidarElevation;
	private Integer biarDensity;
	private Integer BallariArea;
	private Integer BallariElevation;
	private Integer BallariDensity;
	private Integer chitradurgaArea;
	private Integer chitradurgaElevation;
	private Integer chitradurgaDensity;
	private Integer kolarArea;
	private Integer koalrElevation;
	private Integer kolarDensity;
	private Integer hassanArea;
	private Integer hassanElevation;
	private Integer hassanDensity;
	private Integer mandyaArea;
	private Integer mandyaElevation;
	private Integer mandyaDensity;
	private Integer mangaluruArea;
	private Integer mangaluruElevation;
	private Integer mangaluruDensity;
	private Integer gadagArea;
	private Integer gadagElevation;
	private Integer gadagDensity;
	private Integer belagaviArea;
	private Integer belagaviElevation;
	private Integer belagaviDensity;
	private Integer shivamoggaArea;
	private Integer shivamoggaElevation;
	private Integer shivamoggaDensity;
	private Integer bagalkoteArea;
	private Integer bagalkoteElevation;
	private Integer bagakoteDensity;
	private Integer raichurArea;
	private Integer raichurElevation;
	private Integer raichurDensity;
	private Integer vijayapuraArea;
	private Integer vijayaouraElevation;
	private Integer vijayapuraDensity;
	private Integer udupiArea;
	private Integer udupiElevation;
	private Integer udupiDensity;
	
	
	@Override
	public int hashCode() {
		
		return 30;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof CitiesDTO) {
	    	 System.out.println("casting done");
	    	 CitiesDTO converted=(CitiesDTO)obj;
	      if(converted.bidarArea.equals(this.bidarArea)&& converted.udupiArea.equals(this.udupiArea)) {
	    	  System.out.println("bidarArea and udupiArea are equal");
	      }
	      else {
	    	  System.out.println("bidarArea and udupiArea are not equal");
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


	public Integer getBhadravathiArea() {
		return bhadravathiArea;
	}


	public void setBhadravathiArea(Integer bhadravathiArea) {
		this.bhadravathiArea = bhadravathiArea;
	}


	public Integer getBhadravathiElevation() {
		return bhadravathiElevation;
	}


	public void setBhadravathiElevation(Integer bhadravathiElevation) {
		this.bhadravathiElevation = bhadravathiElevation;
	}


	public Integer getBhadravathiDensity() {
		return bhadravathiDensity;
	}


	public void setBhadravathiDensity(Integer bhadravathiDensity) {
		this.bhadravathiDensity = bhadravathiDensity;
	}


	public Integer getBidarArea() {
		return bidarArea;
	}


	public void setBidarArea(Integer bidarArea) {
		this.bidarArea = bidarArea;
	}


	public Integer getBidarElevation() {
		return bidarElevation;
	}


	public void setBidarElevation(Integer bidarElevation) {
		this.bidarElevation = bidarElevation;
	}


	public Integer getBiarDensity() {
		return biarDensity;
	}


	public void setBiarDensity(Integer biarDensity) {
		this.biarDensity = biarDensity;
	}


	public Integer getBallariArea() {
		return BallariArea;
	}


	public void setBallariArea(Integer ballariArea) {
		BallariArea = ballariArea;
	}


	public Integer getBallariElevation() {
		return BallariElevation;
	}


	public void setBallariElevation(Integer ballariElevation) {
		BallariElevation = ballariElevation;
	}


	public Integer getBallariDensity() {
		return BallariDensity;
	}


	public void setBallariDensity(Integer ballariDensity) {
		BallariDensity = ballariDensity;
	}


	public Integer getChitradurgaArea() {
		return chitradurgaArea;
	}


	public void setChitradurgaArea(Integer chitradurgaArea) {
		this.chitradurgaArea = chitradurgaArea;
	}


	public Integer getChitradurgaElevation() {
		return chitradurgaElevation;
	}


	public void setChitradurgaElevation(Integer chitradurgaElevation) {
		this.chitradurgaElevation = chitradurgaElevation;
	}


	public Integer getChitradurgaDensity() {
		return chitradurgaDensity;
	}


	public void setChitradurgaDensity(Integer chitradurgaDensity) {
		this.chitradurgaDensity = chitradurgaDensity;
	}


	public Integer getKolarArea() {
		return kolarArea;
	}


	public void setKolarArea(Integer kolarArea) {
		this.kolarArea = kolarArea;
	}


	public Integer getKoalrElevation() {
		return koalrElevation;
	}


	public void setKoalrElevation(Integer koalrElevation) {
		this.koalrElevation = koalrElevation;
	}


	public Integer getKolarDensity() {
		return kolarDensity;
	}


	public void setKolarDensity(Integer kolarDensity) {
		this.kolarDensity = kolarDensity;
	}


	public Integer getHassanArea() {
		return hassanArea;
	}


	public void setHassanArea(Integer hassanArea) {
		this.hassanArea = hassanArea;
	}


	public Integer getHassanElevation() {
		return hassanElevation;
	}


	public void setHassanElevation(Integer hassanElevation) {
		this.hassanElevation = hassanElevation;
	}


	public Integer getHassanDensity() {
		return hassanDensity;
	}


	public void setHassanDensity(Integer hassanDensity) {
		this.hassanDensity = hassanDensity;
	}


	public Integer getMandyaArea() {
		return mandyaArea;
	}


	public void setMandyaArea(Integer mandyaArea) {
		this.mandyaArea = mandyaArea;
	}


	public Integer getMandyaElevation() {
		return mandyaElevation;
	}


	public void setMandyaElevation(Integer mandyaElevation) {
		this.mandyaElevation = mandyaElevation;
	}


	public Integer getMandyaDensity() {
		return mandyaDensity;
	}


	public void setMandyaDensity(Integer mandyaDensity) {
		this.mandyaDensity = mandyaDensity;
	}


	public Integer getMangaluruArea() {
		return mangaluruArea;
	}


	public void setMangaluruArea(Integer mangaluruArea) {
		this.mangaluruArea = mangaluruArea;
	}


	public Integer getMangaluruElevation() {
		return mangaluruElevation;
	}


	public void setMangaluruElevation(Integer mangaluruElevation) {
		this.mangaluruElevation = mangaluruElevation;
	}


	public Integer getMangaluruDensity() {
		return mangaluruDensity;
	}


	public void setMangaluruDensity(Integer mangaluruDensity) {
		this.mangaluruDensity = mangaluruDensity;
	}


	public Integer getGadagArea() {
		return gadagArea;
	}


	public void setGadagArea(Integer gadagArea) {
		this.gadagArea = gadagArea;
	}


	public Integer getGadagElevation() {
		return gadagElevation;
	}


	public void setGadagElevation(Integer gadagElevation) {
		this.gadagElevation = gadagElevation;
	}


	public Integer getGadagDensity() {
		return gadagDensity;
	}


	public void setGadagDensity(Integer gadagDensity) {
		this.gadagDensity = gadagDensity;
	}


	public Integer getBelagaviArea() {
		return belagaviArea;
	}


	public void setBelagaviArea(Integer belagaviArea) {
		this.belagaviArea = belagaviArea;
	}


	public Integer getBelagaviElevation() {
		return belagaviElevation;
	}


	public void setBelagaviElevation(Integer belagaviElevation) {
		this.belagaviElevation = belagaviElevation;
	}


	public Integer getBelagaviDensity() {
		return belagaviDensity;
	}


	public void setBelagaviDensity(Integer belagaviDensity) {
		this.belagaviDensity = belagaviDensity;
	}


	public Integer getShivamoggaArea() {
		return shivamoggaArea;
	}


	public void setShivamoggaArea(Integer shivamoggaArea) {
		this.shivamoggaArea = shivamoggaArea;
	}


	public Integer getShivamoggaElevation() {
		return shivamoggaElevation;
	}


	public void setShivamoggaElevation(Integer shivamoggaElevation) {
		this.shivamoggaElevation = shivamoggaElevation;
	}


	public Integer getShivamoggaDensity() {
		return shivamoggaDensity;
	}


	public void setShivamoggaDensity(Integer shivamoggaDensity) {
		this.shivamoggaDensity = shivamoggaDensity;
	}


	public Integer getBagalkoteArea() {
		return bagalkoteArea;
	}


	public void setBagalkoteArea(Integer bagalkoteArea) {
		this.bagalkoteArea = bagalkoteArea;
	}


	public Integer getBagalkoteElevation() {
		return bagalkoteElevation;
	}


	public void setBagalkoteElevation(Integer bagalkoteElevation) {
		this.bagalkoteElevation = bagalkoteElevation;
	}


	public Integer getBagakoteDensity() {
		return bagakoteDensity;
	}


	public void setBagakoteDensity(Integer bagakoteDensity) {
		this.bagakoteDensity = bagakoteDensity;
	}


	public Integer getRaichurArea() {
		return raichurArea;
	}


	public void setRaichurArea(Integer raichurArea) {
		this.raichurArea = raichurArea;
	}


	public Integer getRaichurElevation() {
		return raichurElevation;
	}


	public void setRaichurElevation(Integer raichurElevation) {
		this.raichurElevation = raichurElevation;
	}


	public Integer getRaichurDensity() {
		return raichurDensity;
	}


	public void setRaichurDensity(Integer raichurDensity) {
		this.raichurDensity = raichurDensity;
	}


	public Integer getVijayapuraArea() {
		return vijayapuraArea;
	}


	public void setVijayapuraArea(Integer vijayapuraArea) {
		this.vijayapuraArea = vijayapuraArea;
	}


	public Integer getVijayaouraElevation() {
		return vijayaouraElevation;
	}


	public void setVijayaouraElevation(Integer vijayaouraElevation) {
		this.vijayaouraElevation = vijayaouraElevation;
	}


	public Integer getVijayapuraDensity() {
		return vijayapuraDensity;
	}


	public void setVijayapuraDensity(Integer vijayapuraDensity) {
		this.vijayapuraDensity = vijayapuraDensity;
	}


	public Integer getUdupiArea() {
		return udupiArea;
	}


	public void setUdupiArea(Integer udupiArea) {
		this.udupiArea = udupiArea;
	}


	public Integer getUdupiElevation() {
		return udupiElevation;
	}


	public void setUdupiElevation(Integer udupiElevation) {
		this.udupiElevation = udupiElevation;
	}


	public Integer getUdupiDensity() {
		return udupiDensity;
	}


	public void setUdupiDensity(Integer udupiDensity) {
		this.udupiDensity = udupiDensity;
	}
	
	
	
	
	
	
	
	
}
