package com.xworkz.dto;

public class CountriesDTO {

	private String AfganistanDensity;
	private String AlbaniaDensity;
	private String AngolaDensity;
	private String ArmeniaDensity;
	private String BhamasDensity;
	private String BenninDensity;
	private String BelizeDensity;
	private String canadaDensity;
	private String chinaDensity;
	private String chileDensity;
	private String cubaDensity;
	private String eudorDensity;
	private String fijiDensity;
	private String gambiaDensity;
	private String ghanaDensity;
	private String guyanaDensity;
	private String holySeeDensity;
	private String indiaDensity;
	private String iceLanadDensity;
	private String iraqDensity;
	private String iranDensity;
	private String jordanDensity;
	private String kenyaDensity;
	private String laosDensity;
	private String latviaDensity;
	private String maldivesDensity;
	private String maltaDensity;
	private String nauruDensity;
	private String nigerDensity;
	private String norwayDensity;
	private String peruDensity;
	private String polandDensity;
	private String rwandaDensity;
	private String serbiaDensity;
	private String singaporeDensity;
	private String slovakiaDensity;
	private String somaliaDensity;
	private String spainDensity;
	private String swedenDensity;
	private String syriaDensity;
	private String togoDensity;
	private String turkeyDensity;
	private String tuvaluDensity;
	private String ugandaDensity;
	private String uruguayDensity;
	private String zambiaDensity;
	
	@Override
	public int hashCode() {
		
		return 69;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
		System.out.println("object is not null");
		if(obj instanceof CountriesDTO) {
			System.out.println("instance of country");
			CountriesDTO converted=(CountriesDTO)obj;
			if(converted.indiaDensity.equals(this.indiaDensity)&&converted.ArmeniaDensity.equals(this.ArmeniaDensity)) {
			System.out.println("indiaDensity and ArmeniaDensity are equal");	
			}
			else {
				System.out.println("indiaDensity and ArmeniaDensity are not equal");
			}
		}
		else {
			System.out.println("instance is not country");
		}
		}
		else {
			System.out.println("object is null");
		}
			
		return super.equals(obj);
	}
	public String getAfganistanDensity() {
		return AfganistanDensity;
	}
	public void setAfganistanDensity(String afganistanDensity) {
		AfganistanDensity = afganistanDensity;
	}
	public String getAlbaniaDensity() {
		return AlbaniaDensity;
	}
	public void setAlbaniaDensity(String albaniaDensity) {
		AlbaniaDensity = albaniaDensity;
	}
	public String getAngolaDensity() {
		return AngolaDensity;
	}
	public void setAngolaDensity(String angolaDensity) {
		AngolaDensity = angolaDensity;
	}
	public String getArmeniaDensity() {
		return ArmeniaDensity;
	}
	public void setArmeniaDensity(String armeniaDensity) {
		ArmeniaDensity = armeniaDensity;
	}
	public String getBhamasDensity() {
		return BhamasDensity;
	}
	public void setBhamasDensity(String bhamasDensity) {
		BhamasDensity = bhamasDensity;
	}
	public String getBenninDensity() {
		return BenninDensity;
	}
	public void setBenninDensity(String benninDensity) {
		BenninDensity = benninDensity;
	}
	public String getBelizeDensity() {
		return BelizeDensity;
	}
	public void setBelizeDensity(String belizeDensity) {
		BelizeDensity = belizeDensity;
	}
	public String getCanadaDensity() {
		return canadaDensity;
	}
	public void setCanadaDensity(String canadaDensity) {
		this.canadaDensity = canadaDensity;
	}
	public String getChinaDensity() {
		return chinaDensity;
	}
	public void setChinaDensity(String chinaDensity) {
		this.chinaDensity = chinaDensity;
	}
	public String getChileDensity() {
		return chileDensity;
	}
	public void setChileDensity(String chileDensity) {
		this.chileDensity = chileDensity;
	}
	public String getCubaDensity() {
		return cubaDensity;
	}
	public void setCubaDensity(String cubaDensity) {
		this.cubaDensity = cubaDensity;
	}
	public String getEudorDensity() {
		return eudorDensity;
	}
	public void setEudorDensity(String eudorDensity) {
		this.eudorDensity = eudorDensity;
	}
	public String getFijiDensity() {
		return fijiDensity;
	}
	public void setFijiDensity(String fijiDensity) {
		this.fijiDensity = fijiDensity;
	}
	public String getGambiaDensity() {
		return gambiaDensity;
	}
	public void setGambiaDensity(String gambiaDensity) {
		this.gambiaDensity = gambiaDensity;
	}
	public String getGhanaDensity() {
		return ghanaDensity;
	}
	public void setGhanaDensity(String ghanaDensity) {
		this.ghanaDensity = ghanaDensity;
	}
	public String getGuyanaDensity() {
		return guyanaDensity;
	}
	public void setGuyanaDensity(String guyanaDensity) {
		this.guyanaDensity = guyanaDensity;
	}
	public String getHolySeeDensity() {
		return holySeeDensity;
	}
	public void setHolySeeDensity(String holySeeDensity) {
		this.holySeeDensity = holySeeDensity;
	}
	public String getIndiaDensity() {
		return indiaDensity;
	}
	public void setIndiaDensity(String indiaDensity) {
		this.indiaDensity = indiaDensity;
	}
	public String getIceLanadDensity() {
		return iceLanadDensity;
	}
	public void setIceLanadDensity(String iceLanadDensity) {
		this.iceLanadDensity = iceLanadDensity;
	}
	public String getIraqDensity() {
		return iraqDensity;
	}
	public void setIraqDensity(String iraqDensity) {
		this.iraqDensity = iraqDensity;
	}
	public String getIranDensity() {
		return iranDensity;
	}
	public void setIranDensity(String iranDensity) {
		this.iranDensity = iranDensity;
	}
	public String getJordanDensity() {
		return jordanDensity;
	}
	public void setJordanDensity(String jordanDensity) {
		this.jordanDensity = jordanDensity;
	}
	public String getKenyaDensity() {
		return kenyaDensity;
	}
	public void setKenyaDensity(String kenyaDensity) {
		this.kenyaDensity = kenyaDensity;
	}
	public String getLaosDensity() {
		return laosDensity;
	}
	public void setLaosDensity(String laosDensity) {
		this.laosDensity = laosDensity;
	}
	public String getLatviaDensity() {
		return latviaDensity;
	}
	public void setLatviaDensity(String latviaDensity) {
		this.latviaDensity = latviaDensity;
	}
	public String getMaldivesDensity() {
		return maldivesDensity;
	}
	public void setMaldivesDensity(String maldivesDensity) {
		this.maldivesDensity = maldivesDensity;
	}
	public String getMaltaDensity() {
		return maltaDensity;
	}
	public void setMaltaDensity(String maltaDensity) {
		this.maltaDensity = maltaDensity;
	}
	public String getNauruDensity() {
		return nauruDensity;
	}
	public void setNauruDensity(String nauruDensity) {
		this.nauruDensity = nauruDensity;
	}
	public String getNigerDensity() {
		return nigerDensity;
	}
	public void setNigerDensity(String nigerDensity) {
		this.nigerDensity = nigerDensity;
	}
	public String getNorwayDensity() {
		return norwayDensity;
	}
	public void setNorwayDensity(String norwayDensity) {
		this.norwayDensity = norwayDensity;
	}
	public String getPeruDensity() {
		return peruDensity;
	}
	public void setPeruDensity(String peruDensity) {
		this.peruDensity = peruDensity;
	}
	public String getPolandDensity() {
		return polandDensity;
	}
	public void setPolandDensity(String polandDensity) {
		this.polandDensity = polandDensity;
	}
	public String getRwandaDensity() {
		return rwandaDensity;
	}
	public void setRwandaDensity(String rwandaDensity) {
		this.rwandaDensity = rwandaDensity;
	}
	public String getSerbiaDensity() {
		return serbiaDensity;
	}
	public void setSerbiaDensity(String serbiaDensity) {
		this.serbiaDensity = serbiaDensity;
	}
	public String getSingaporeDensity() {
		return singaporeDensity;
	}
	public void setSingaporeDensity(String singaporeDensity) {
		this.singaporeDensity = singaporeDensity;
	}
	public String getSlovakiaDensity() {
		return slovakiaDensity;
	}
	public void setSlovakiaDensity(String slovakiaDensity) {
		this.slovakiaDensity = slovakiaDensity;
	}
	public String getSomaliaDensity() {
		return somaliaDensity;
	}
	public void setSomaliaDensity(String somaliaDensity) {
		this.somaliaDensity = somaliaDensity;
	}
	public String getSpainDensity() {
		return spainDensity;
	}
	public void setSpainDensity(String spainDensity) {
		this.spainDensity = spainDensity;
	}
	public String getSwedenDensity() {
		return swedenDensity;
	}
	public void setSwedenDensity(String swedenDensity) {
		this.swedenDensity = swedenDensity;
	}
	public String getSyriaDensity() {
		return syriaDensity;
	}
	public void setSyriaDensity(String syriaDensity) {
		this.syriaDensity = syriaDensity;
	}
	public String getTogoDensity() {
		return togoDensity;
	}
	public void setTogoDensity(String togoDensity) {
		this.togoDensity = togoDensity;
	}
	public String getTurkeyDensity() {
		return turkeyDensity;
	}
	public void setTurkeyDensity(String turkeyDensity) {
		this.turkeyDensity = turkeyDensity;
	}
	public String getTuvaluDensity() {
		return tuvaluDensity;
	}
	public void setTuvaluDensity(String tuvaluDensity) {
		this.tuvaluDensity = tuvaluDensity;
	}
	public String getUgandaDensity() {
		return ugandaDensity;
	}
	public void setUgandaDensity(String ugandaDensity) {
		this.ugandaDensity = ugandaDensity;
	}
	public String getUruguayDensity() {
		return uruguayDensity;
	}
	public void setUruguayDensity(String uruguayDensity) {
		this.uruguayDensity = uruguayDensity;
	}
	public String getZambiaDensity() {
		return zambiaDensity;
	}
	public void setZambiaDensity(String zambiaDensity) {
		this.zambiaDensity = zambiaDensity;
	}
	
}
