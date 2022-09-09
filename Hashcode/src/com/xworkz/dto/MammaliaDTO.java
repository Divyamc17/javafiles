package com.xworkz.dto;

public class MammaliaDTO {

	private String notocryemorphola;
	private String diprotontia;
	private String macriophilum;
	private String dasyuomorphiya;
	private String paucituberculata;
	private String permelemorphia;
	private String didephimorrphila;
	private String insectivora;
	private String dermotera;
	private String probiscida;
	private String rodentia;
	private String artiodactyla;
	private String carnivora;
	private String chiroptera;
	private String pholiodata;
	private String lagomarpha;
	private String ceteacea;
	private String sirenia;
	private String perissadactyla;
	private String edentata;
	private String primates;
	private String hyracoidea;
	private String pilosa;
	private String scandentia;
	
	@Override
	public int hashCode() {

		return 56;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof MammaliaDTO) {
	    	 System.out.println("casting done");
	    	 MammaliaDTO converted=(MammaliaDTO)obj;
	      if(converted.notocryemorphola.equals(this.notocryemorphola)&& converted.dasyuomorphiya.equals(this.dasyuomorphiya)) {
	    	  System.out.println("notocryemorphola and dasyuomorphiya are equal");
	      }
	      else {
	    	  System.out.println("notocryemorphola and dasyuomorphiya are not equal");
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


	public String getNotocryemorphola() {
		return notocryemorphola;
	}


	public void setNotocryemorphola(String notocryemorphola) {
		this.notocryemorphola = notocryemorphola;
	}


	public String getDiprotontia() {
		return diprotontia;
	}


	public void setDiprotontia(String diprotontia) {
		this.diprotontia = diprotontia;
	}


	public String getMacriophilum() {
		return macriophilum;
	}


	public void setMacriophilum(String macriophilum) {
		this.macriophilum = macriophilum;
	}


	public String getDasyuomorphiya() {
		return dasyuomorphiya;
	}


	public void setDasyuomorphiya(String dasyuomorphiya) {
		this.dasyuomorphiya = dasyuomorphiya;
	}


	public String getPaucituberculata() {
		return paucituberculata;
	}


	public void setPaucituberculata(String paucituberculata) {
		this.paucituberculata = paucituberculata;
	}


	public String getPermelemorphia() {
		return permelemorphia;
	}


	public void setPermelemorphia(String permelemorphia) {
		this.permelemorphia = permelemorphia;
	}


	public String getDidephimorrphila() {
		return didephimorrphila;
	}


	public void setDidephimorrphila(String didephimorrphila) {
		this.didephimorrphila = didephimorrphila;
	}


	public String getInsectivora() {
		return insectivora;
	}


	public void setInsectivora(String insectivora) {
		this.insectivora = insectivora;
	}


	public String getDermotera() {
		return dermotera;
	}


	public void setDermotera(String dermotera) {
		this.dermotera = dermotera;
	}


	public String getProbiscida() {
		return probiscida;
	}


	public void setProbiscida(String probiscida) {
		this.probiscida = probiscida;
	}


	public String getRodentia() {
		return rodentia;
	}


	public void setRodentia(String rodentia) {
		this.rodentia = rodentia;
	}


	public String getArtiodactyla() {
		return artiodactyla;
	}


	public void setArtiodactyla(String artiodactyla) {
		this.artiodactyla = artiodactyla;
	}


	public String getCarnivora() {
		return carnivora;
	}


	public void setCarnivora(String carnivora) {
		this.carnivora = carnivora;
	}


	public String getChiroptera() {
		return chiroptera;
	}


	public void setChiroptera(String chiroptera) {
		this.chiroptera = chiroptera;
	}


	public String getPholiodata() {
		return pholiodata;
	}


	public void setPholiodata(String pholiodata) {
		this.pholiodata = pholiodata;
	}


	public String getLagomarpha() {
		return lagomarpha;
	}


	public void setLagomarpha(String lagomarpha) {
		this.lagomarpha = lagomarpha;
	}


	public String getCeteacea() {
		return ceteacea;
	}


	public void setCeteacea(String ceteacea) {
		this.ceteacea = ceteacea;
	}


	public String getSirenia() {
		return sirenia;
	}


	public void setSirenia(String sirenia) {
		this.sirenia = sirenia;
	}


	public String getPerissadactyla() {
		return perissadactyla;
	}


	public void setPerissadactyla(String perissadactyla) {
		this.perissadactyla = perissadactyla;
	}


	public String getEdentata() {
		return edentata;
	}


	public void setEdentata(String edentata) {
		this.edentata = edentata;
	}


	public String getPrimates() {
		return primates;
	}


	public void setPrimates(String primates) {
		this.primates = primates;
	}


	public String getHyracoidea() {
		return hyracoidea;
	}


	public void setHyracoidea(String hyracoidea) {
		this.hyracoidea = hyracoidea;
	}


	public String getPilosa() {
		return pilosa;
	}


	public void setPilosa(String pilosa) {
		this.pilosa = pilosa;
	}


	public String getScandentia() {
		return scandentia;
	}


	public void setScandentia(String scandentia) {
		this.scandentia = scandentia;
	}

	
	
}


