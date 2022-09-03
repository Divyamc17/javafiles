package com.xworkz.dto;

public class KingsDTO {
	//ashoka
	private  Integer ashokaBornYear;
	private  String ashokaBornPlace;
	private  String ashokaDynasty;
	private  String ashokaFather;
	private  String ashokaMother;
	private  String ashokaReligion;
	private  Integer harshaVardanaBornYear;
	private  String harshaVardanaBornPlace;
	private  String harshaVardanaDynasty;
	private  String harshaVardanaFather;
	private  String harshaVardanaMother;
	private  String harshaVardanaReligion;
	private  Integer akbarBornYear;
	private  String akbarBornPlace;
	private  String akbarDynasty;
	private  String akbarFather;
	private  String akbarMother;
	private  String akbarReligion;
	private  Integer kanishkaBornYear;
	private  String kanishkaBornPlace;
	private  String kanishkaDynasty;
	private  String kanishkaFather;
	private  String kanishkaMother;
	private  String kanishkaReligion;
	private  Integer baburBornYear;
	private  String baburBornPlace;
	private  String baburkaDynasty;
	private  String baburhkaFather;
	private  String baburMother;
	private  String baburReligion;
	private  Integer samudraguptaBornYear;
	private  String samudraguptaBornPlace;
	private  String samudraguptaDynasty;
	private  String samudraguptaFather;
	private  String samudraguptaMother;
	private  String samudraguptaReligion;
	private  Integer jahangirBornYear;
	private  String jahangirBornPlace;
	private  String jahangirDynasty;
	private  String jahangirFather;
	private  String jahangirMother;
	private  String jahangirReligion;
	private  Integer devarayaBornYear;
	private  String devarayaBornPlace;
	private  String devarayaDynasty;
	private  String devarayaFather;
	private  String devarayaMother;
	private  String devarayaReligion;

	
	
	@Override
	public int hashCode() {
		
		return 365;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof KingsDTO) {
	    	 System.out.println("casting done");
	    	 KingsDTO converted=(KingsDTO)obj;
	      if(converted.ashokaBornPlace.equals(this.ashokaBornPlace)&& converted.samudraguptaBornPlace.equals(this.samudraguptaBornPlace)) {
	    	  System.out.println("ashokaBornPlace and samudraguptaBornPlace are equal");
	      }
	      else {
	    	  System.out.println("ashokaBornPlace and samudraguptaBornPlace are not equal");
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
	public Integer getAshokaBornYear() {
		return ashokaBornYear;
	}
	public void setAshokaBornYear(Integer ashokaBornYear) {
		this.ashokaBornYear = ashokaBornYear;
	}
	public String getAshokaBornPlace() {
		return ashokaBornPlace;
	}
	public void setAshokaBornPlace(String ashokaBornPlace) {
		this.ashokaBornPlace = ashokaBornPlace;
	}
	public String getAshokaDynasty() {
		return ashokaDynasty;
	}
	public void setAshokaDynasty(String ashokaDynasty) {
		this.ashokaDynasty = ashokaDynasty;
	}
	public String getAshokaFather() {
		return ashokaFather;
	}
	public void setAshokaFather(String ashokaFather) {
		this.ashokaFather = ashokaFather;
	}
	public String getAshokaMother() {
		return ashokaMother;
	}
	public void setAshokaMother(String ashokaMother) {
		this.ashokaMother = ashokaMother;
	}
	public String getAshokaReligion() {
		return ashokaReligion;
	}
	public void setAshokaReligion(String ashokaReligion) {
		this.ashokaReligion = ashokaReligion;
	}
	public Integer getHarshaVardanaBornYear() {
		return harshaVardanaBornYear;
	}
	public void setHarshaVardanaBornYear(Integer harshaVardanaBornYear) {
		this.harshaVardanaBornYear = harshaVardanaBornYear;
	}
	public String getHarshaVardanaBornPlace() {
		return harshaVardanaBornPlace;
	}
	public void setHarshaVardanaBornPlace(String harshaVardanaBornPlace) {
		this.harshaVardanaBornPlace = harshaVardanaBornPlace;
	}
	public String getHarshaVardanaDynasty() {
		return harshaVardanaDynasty;
	}
	public void setHarshaVardanaDynasty(String harshaVardanaDynasty) {
		this.harshaVardanaDynasty = harshaVardanaDynasty;
	}
	public String getHarshaVardanaFather() {
		return harshaVardanaFather;
	}
	public void setHarshaVardanaFather(String harshaVardanaFather) {
		this.harshaVardanaFather = harshaVardanaFather;
	}
	public String getHarshaVardanaMother() {
		return harshaVardanaMother;
	}
	public void setHarshaVardanaMother(String harshaVardanaMother) {
		this.harshaVardanaMother = harshaVardanaMother;
	}
	public String getHarshaVardanaReligion() {
		return harshaVardanaReligion;
	}
	public void setHarshaVardanaReligion(String harshaVardanaReligion) {
		this.harshaVardanaReligion = harshaVardanaReligion;
	}
	public Integer getAkbarBornYear() {
		return akbarBornYear;
	}
	public void setAkbarBornYear(Integer akbarBornYear) {
		this.akbarBornYear = akbarBornYear;
	}
	public String getAkbarBornPlace() {
		return akbarBornPlace;
	}
	public void setAkbarBornPlace(String akbarBornPlace) {
		this.akbarBornPlace = akbarBornPlace;
	}
	public String getAkbarDynasty() {
		return akbarDynasty;
	}
	public void setAkbarDynasty(String akbarDynasty) {
		this.akbarDynasty = akbarDynasty;
	}
	public String getAkbarFather() {
		return akbarFather;
	}
	public void setAkbarFather(String akbarFather) {
		this.akbarFather = akbarFather;
	}
	public String getAkbarMother() {
		return akbarMother;
	}
	public void setAkbarMother(String akbarMother) {
		this.akbarMother = akbarMother;
	}
	public String getAkbarReligion() {
		return akbarReligion;
	}
	public void setAkbarReligion(String akbarReligion) {
		this.akbarReligion = akbarReligion;
	}
	public Integer getKanishkaBornYear() {
		return kanishkaBornYear;
	}
	public void setKanishkaBornYear(Integer kanishkaBornYear) {
		this.kanishkaBornYear = kanishkaBornYear;
	}
	public String getKanishkaBornPlace() {
		return kanishkaBornPlace;
	}
	public void setKanishkaBornPlace(String kanishkaBornPlace) {
		this.kanishkaBornPlace = kanishkaBornPlace;
	}
	public String getKanishkaDynasty() {
		return kanishkaDynasty;
	}
	public void setKanishkaDynasty(String kanishkaDynasty) {
		this.kanishkaDynasty = kanishkaDynasty;
	}
	public String getKanishkaFather() {
		return kanishkaFather;
	}
	public void setKanishkaFather(String kanishkaFather) {
		this.kanishkaFather = kanishkaFather;
	}
	public String getKanishkaMother() {
		return kanishkaMother;
	}
	public void setKanishkaMother(String kanishkaMother) {
		this.kanishkaMother = kanishkaMother;
	}
	public String getKanishkaReligion() {
		return kanishkaReligion;
	}
	public void setKanishkaReligion(String kanishkaReligion) {
		this.kanishkaReligion = kanishkaReligion;
	}
	public Integer getBaburBornYear() {
		return baburBornYear;
	}
	public void setBaburBornYear(Integer baburBornYear) {
		this.baburBornYear = baburBornYear;
	}
	public String getBaburBornPlace() {
		return baburBornPlace;
	}
	public void setBaburBornPlace(String baburBornPlace) {
		this.baburBornPlace = baburBornPlace;
	}
	public String getBaburkaDynasty() {
		return baburkaDynasty;
	}
	public void setBaburkaDynasty(String baburkaDynasty) {
		this.baburkaDynasty = baburkaDynasty;
	}
	public String getBaburhkaFather() {
		return baburhkaFather;
	}
	public void setBaburhkaFather(String baburhkaFather) {
		this.baburhkaFather = baburhkaFather;
	}
	public String getBaburMother() {
		return baburMother;
	}
	public void setBaburMother(String baburMother) {
		this.baburMother = baburMother;
	}
	public String getBaburReligion() {
		return baburReligion;
	}
	public void setBaburReligion(String baburReligion) {
		this.baburReligion = baburReligion;
	}
	public Integer getSamudraguptaBornYear() {
		return samudraguptaBornYear;
	}
	public void setSamudraguptaBornYear(Integer samudraguptaBornYear) {
		this.samudraguptaBornYear = samudraguptaBornYear;
	}
	public String getSamudraguptaBornPlace() {
		return samudraguptaBornPlace;
	}
	public void setSamudraguptaBornPlace(String samudraguptaBornPlace) {
		this.samudraguptaBornPlace = samudraguptaBornPlace;
	}
	public String getSamudraguptaDynasty() {
		return samudraguptaDynasty;
	}
	public void setSamudraguptaDynasty(String samudraguptaDynasty) {
		this.samudraguptaDynasty = samudraguptaDynasty;
	}
	public String getSamudraguptaFather() {
		return samudraguptaFather;
	}
	public void setSamudraguptaFather(String samudraguptaFather) {
		this.samudraguptaFather = samudraguptaFather;
	}
	public String getSamudraguptaMother() {
		return samudraguptaMother;
	}
	public void setSamudraguptaMother(String samudraguptaMother) {
		this.samudraguptaMother = samudraguptaMother;
	}
	public String getSamudraguptaReligion() {
		return samudraguptaReligion;
	}
	public void setSamudraguptaReligion(String samudraguptaReligion) {
		this.samudraguptaReligion = samudraguptaReligion;
	}
	public Integer getJahangirBornYear() {
		return jahangirBornYear;
	}
	public void setJahangirBornYear(Integer jahangirBornYear) {
		this.jahangirBornYear = jahangirBornYear;
	}
	public String getJahangirBornPlace() {
		return jahangirBornPlace;
	}
	public void setJahangirBornPlace(String jahangirBornPlace) {
		this.jahangirBornPlace = jahangirBornPlace;
	}
	public String getJahangirDynasty() {
		return jahangirDynasty;
	}
	public void setJahangirDynasty(String jahangirDynasty) {
		this.jahangirDynasty = jahangirDynasty;
	}
	public String getJahangirFather() {
		return jahangirFather;
	}
	public void setJahangirFather(String jahangirFather) {
		this.jahangirFather = jahangirFather;
	}
	public String getJahangirMother() {
		return jahangirMother;
	}
	public void setJahangirMother(String jahangirMother) {
		this.jahangirMother = jahangirMother;
	}
	public String getJahangirReligion() {
		return jahangirReligion;
	}
	public void setJahangirReligion(String jahangirReligion) {
		this.jahangirReligion = jahangirReligion;
	}
	public Integer getDevarayaBornYear() {
		return devarayaBornYear;
	}
	public void setDevarayaBornYear(Integer devarayaBornYear) {
		this.devarayaBornYear = devarayaBornYear;
	}
	public String getDevarayaBornPlace() {
		return devarayaBornPlace;
	}
	public void setDevarayaBornPlace(String devarayaBornPlace) {
		this.devarayaBornPlace = devarayaBornPlace;
	}
	public String getDevarayaDynasty() {
		return devarayaDynasty;
	}
	public void setDevarayaDynasty(String devarayaDynasty) {
		this.devarayaDynasty = devarayaDynasty;
	}
	public String getDevarayaFather() {
		return devarayaFather;
	}
	public void setDevarayaFather(String devarayaFather) {
		this.devarayaFather = devarayaFather;
	}
	public String getDevarayaMother() {
		return devarayaMother;
	}
	public void setDevarayaMother(String devarayaMother) {
		this.devarayaMother = devarayaMother;
	}
	public String getDevarayaReligion() {
		return devarayaReligion;
	}
	public void setDevarayaReligion(String devarayaReligion) {
		this.devarayaReligion = devarayaReligion;
	}
	
	
	
}