package com.xworkz.dto;

public class PaintDTO {

	
	private String name;
	private String color;
	private String type;
	private double price;
	private int colorcode;
	private boolean distumper;
	private boolean useOfWater;
	private boolean useOfTinner;
	private String driers;
	private String additives;
	private boolean emulsion;
	private double heatResistent;
	private double waterResistent;
	private double corriosonResistent;
	private int opacity;
	private boolean drying;
	private boolean protectiveFilm;
	private boolean sustain;
	private boolean pigments;
	private boolean dye;
	private boolean diluent;
	private boolean filler;
	private String vanisher;
	private String fingerpaints;
	private String inks;
	private boolean antiGraffitit;
	private boolean insulativepaint;
	private boolean flatfinish;
	private boolean matteFinish;
	private boolean semiGlassFinish;
	private boolean highGlossFinish;
	private boolean peeling;
	private boolean cracking;
	private String brush;
	private String mixture;
	private String toughness;
	private String emulsfier;
	private boolean controlAgent;
	private boolean texturizers;
	private boolean antiFire;
	private boolean uvSteblizer;
	private boolean corrision;
	private boolean inhibitor;
	private boolean reflectness;
	private boolean refractiveIndex;

	@Override
	public int hashCode() {

		return 420;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof PaintDTO) {
				PaintDTO casted = (PaintDTO) obj;
				if (casted.color.equals(this.color) && casted.name.equals(this.name)) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("both are not same");
				}

			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getColorcode() {
		return colorcode;
	}

	public void setColorcode(int colorcode) {
		this.colorcode = colorcode;
	}

	public boolean isDistumper() {
		return distumper;
	}

	public void setDistumper(boolean distumper) {
		this.distumper = distumper;
	}

	public boolean isUseOfWater() {
		return useOfWater;
	}

	public void setUseOfWater(boolean useOfWater) {
		this.useOfWater = useOfWater;
	}

	public boolean isUseOfTinner() {
		return useOfTinner;
	}

	public void setUseOfTinner(boolean useOfTinner) {
		this.useOfTinner = useOfTinner;
	}

	public String getDriers() {
		return driers;
	}

	public void setDriers(String driers) {
		this.driers = driers;
	}

	public String getAdditives() {
		return additives;
	}

	public void setAdditives(String additives) {
		this.additives = additives;
	}

	public boolean isEmulsion() {
		return emulsion;
	}

	public void setEmulsion(boolean emulsion) {
		this.emulsion = emulsion;
	}

	public double getHeatResistent() {
		return heatResistent;
	}

	public void setHeatResistent(double heatResistent) {
		this.heatResistent = heatResistent;
	}

	public double getWaterResistent() {
		return waterResistent;
	}

	public void setWaterResistent(double waterResistent) {
		this.waterResistent = waterResistent;
	}

	public double getCorriosonResistent() {
		return corriosonResistent;
	}

	public void setCorriosonResistent(double corriosonResistent) {
		this.corriosonResistent = corriosonResistent;
	}

	public int getOpacity() {
		return opacity;
	}

	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}

	public boolean isDrying() {
		return drying;
	}

	public void setDrying(boolean drying) {
		this.drying = drying;
	}

	public boolean isProtectiveFilm() {
		return protectiveFilm;
	}

	public void setProtectiveFilm(boolean protectiveFilm) {
		this.protectiveFilm = protectiveFilm;
	}

	public boolean isSustain() {
		return sustain;
	}

	public void setSustain(boolean sustain) {
		this.sustain = sustain;
	}

	public boolean isPigments() {
		return pigments;
	}

	public void setPigments(boolean pigments) {
		this.pigments = pigments;
	}

	public boolean isDye() {
		return dye;
	}

	public void setDye(boolean dye) {
		this.dye = dye;
	}

	public boolean isDiluent() {
		return diluent;
	}

	public void setDiluent(boolean diluent) {
		this.diluent = diluent;
	}

	public boolean isFiller() {
		return filler;
	}

	public void setFiller(boolean filler) {
		this.filler = filler;
	}

	public String getVanisher() {
		return vanisher;
	}

	public void setVanisher(String vanisher) {
		this.vanisher = vanisher;
	}

	public String getFingerpaints() {
		return fingerpaints;
	}

	public void setFingerpaints(String fingerpaints) {
		this.fingerpaints = fingerpaints;
	}

	public String getInks() {
		return inks;
	}

	public void setInks(String inks) {
		this.inks = inks;
	}

	public boolean isAntiGraffitit() {
		return antiGraffitit;
	}

	public void setAntiGraffitit(boolean antiGraffitit) {
		this.antiGraffitit = antiGraffitit;
	}

	public boolean isInsulativepaint() {
		return insulativepaint;
	}

	public void setInsulativepaint(boolean insulativepaint) {
		this.insulativepaint = insulativepaint;
	}

	public boolean isFlatfinish() {
		return flatfinish;
	}

	public void setFlatfinish(boolean flatfinish) {
		this.flatfinish = flatfinish;
	}

	public boolean isMatteFinish() {
		return matteFinish;
	}

	public void setMatteFinish(boolean matteFinish) {
		this.matteFinish = matteFinish;
	}

	public boolean isSemiGlassFinish() {
		return semiGlassFinish;
	}

	public void setSemiGlassFinish(boolean semiGlassFinish) {
		this.semiGlassFinish = semiGlassFinish;
	}

	public boolean isHighGlossFinish() {
		return highGlossFinish;
	}

	public void setHighGlossFinish(boolean highGlossFinish) {
		this.highGlossFinish = highGlossFinish;
	}

	public boolean isPeeling() {
		return peeling;
	}

	public void setPeeling(boolean peeling) {
		this.peeling = peeling;
	}

	public boolean isCracking() {
		return cracking;
	}

	public void setCracking(boolean cracking) {
		this.cracking = cracking;
	}

	public String getBrush() {
		return brush;
	}

	public void setBrush(String brush) {
		this.brush = brush;
	}

	public String getMixture() {
		return mixture;
	}

	public void setMixture(String mixture) {
		this.mixture = mixture;
	}

	public String getToughness() {
		return toughness;
	}

	public void setToughness(String toughness) {
		this.toughness = toughness;
	}

	public String getEmulsfier() {
		return emulsfier;
	}

	public void setEmulsfier(String emulsfier) {
		this.emulsfier = emulsfier;
	}

	public boolean isControlAgent() {
		return controlAgent;
	}

	public void setControlAgent(boolean controlAgent) {
		this.controlAgent = controlAgent;
	}

	public boolean isTexturizers() {
		return texturizers;
	}

	public void setTexturizers(boolean texturizers) {
		this.texturizers = texturizers;
	}

	public boolean isAntiFire() {
		return antiFire;
	}

	public void setAntiFire(boolean antiFire) {
		this.antiFire = antiFire;
	}

	public boolean isUvSteblizer() {
		return uvSteblizer;
	}

	public void setUvSteblizer(boolean uvSteblizer) {
		this.uvSteblizer = uvSteblizer;
	}

	public boolean isCorrision() {
		return corrision;
	}

	public void setCorrision(boolean corrision) {
		this.corrision = corrision;
	}

	public boolean isInhibitor() {
		return inhibitor;
	}

	public void setInhibitor(boolean inhibitor) {
		this.inhibitor = inhibitor;
	}

	public boolean isReflectness() {
		return reflectness;
	}

	public void setReflectness(boolean reflectness) {
		this.reflectness = reflectness;
	}

	public boolean isRefractiveIndex() {
		return refractiveIndex;
	}

	public void setRefractiveIndex(boolean refractiveIndex) {
		this.refractiveIndex = refractiveIndex;
	}
	
}

