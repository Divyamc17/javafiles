package com.xworkz.dto;

public class ClothDTO {


		private String type;
		private boolean Washable;
		private String colour;
		private boolean comfort;
		private double durable;
		private String moistureManagement;
		private String thermalInsulation;
		private boolean sweatAbsorption;
		private boolean windprof;
		private String uvProtection;
		private String colourResistance;
		private String quickDrying;
		private boolean lightWaight;
		private boolean waterproof;
		private String compression;
		private String longLastingFit;
		private String attractive;
		private String dimensionallyStable;
		private String appearance;
		private String rubbing;
		private String breathble;
		private String economical;
		private String stifness;
		private String goodSurfaceTexture;
		private String lustre;
		private String antiOder;
		private String wicking;
		private String recovery;
		private String stability;
		private String drape;
		private String tensileStringth;
		private String registanceToAbrasion;
		private String tearingStrength;
		private String surfaceFraction;
		private String burstingStrength;
		private String RegistanceToSnagging;
		private String waterRepellent;
		private String stretchAndRecovery;
		private String perspiration;
		private String regustanceToStain;
		private String registanceToMonth;
		private String withstandUse;
		private String nonAbsorbent;
		private String easyToDispose;
		private String soilResistence;

		@Override
		public int hashCode() {
			return 180;

		}

		@Override
		public boolean equals(Object obj) {
			if (obj != null) {
				System.out.println("is not equal");
				if (obj instanceof ClothDTO) {
					System.out.println("is a instance of cloth");
					ClothDTO converted = (ClothDTO) obj; // casting
					if (converted.colour.equals(this.colour) && converted.type.equals(this.type)) {
						System.out.println("colour and type are equal");

					} else {
						System.out.println("colour and type are not equal");
					}
				} else {
					System.out.println("both are equal");
				}
			}
			return super.equals(obj);

		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isWashable() {
			return Washable;
		}

		public void setWashable(boolean washable) {
			Washable = washable;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public boolean isComfort() {
			return comfort;
		}

		public void setComfort(boolean comfort) {
			this.comfort = comfort;
		}

		public double getDurable() {
			return durable;
		}

		public void setDurable(double durable) {
			this.durable = durable;
		}

		public String getMoistureManagement() {
			return moistureManagement;
		}

		public void setMoistureManagement(String moistureManagement) {
			this.moistureManagement = moistureManagement;
		}

		public String getThermalInsulation() {
			return thermalInsulation;
		}

		public void setThermalInsulation(String thermalInsulation) {
			this.thermalInsulation = thermalInsulation;
		}

		public boolean isSweatAbsorption() {
			return sweatAbsorption;
		}

		public void setSweatAbsorption(boolean sweatAbsorption) {
			this.sweatAbsorption = sweatAbsorption;
		}

		public boolean isWindprof() {
			return windprof;
		}

		public void setWindprof(boolean windprof) {
			this.windprof = windprof;
		}

		public String getUvProtection() {
			return uvProtection;
		}

		public void setUvProtection(String uvProtection) {
			this.uvProtection = uvProtection;
		}

		public String getColourResistance() {
			return colourResistance;
		}

		public void setColourResistance(String colourResistance) {
			this.colourResistance = colourResistance;
		}

		public String getQuickDrying() {
			return quickDrying;
		}

		public void setQuickDrying(String quickDrying) {
			this.quickDrying = quickDrying;
		}

		public boolean isLightWaight() {
			return lightWaight;
		}

		public void setLightWaight(boolean lightWaight) {
			this.lightWaight = lightWaight;
		}

		public boolean isWaterproof() {
			return waterproof;
		}

		public void setWaterproof(boolean waterproof) {
			this.waterproof = waterproof;
		}

		public String getCompression() {
			return compression;
		}

		public void setCompression(String compression) {
			this.compression = compression;
		}

		public String getLongLastingFit() {
			return longLastingFit;
		}

		public void setLongLastingFit(String longLastingFit) {
			this.longLastingFit = longLastingFit;
		}

		public String getAttractive() {
			return attractive;
		}

		public void setAttractive(String attractive) {
			this.attractive = attractive;
		}

		public String getDimensionallyStable() {
			return dimensionallyStable;
		}

		public void setDimensionallyStable(String dimensionallyStable) {
			this.dimensionallyStable = dimensionallyStable;
		}

		public String getAppearance() {
			return appearance;
		}

		public void setAppearance(String appearance) {
			this.appearance = appearance;
		}

		public String getRubbing() {
			return rubbing;
		}

		public void setRubbing(String rubbing) {
			this.rubbing = rubbing;
		}

		public String getBreathble() {
			return breathble;
		}

		public void setBreathble(String breathble) {
			this.breathble = breathble;
		}

		public String getEconomical() {
			return economical;
		}

		public void setEconomical(String economical) {
			this.economical = economical;
		}

		public String getStifness() {
			return stifness;
		}

		public void setStifness(String stifness) {
			this.stifness = stifness;
		}

		public String getGoodSurfaceTexture() {
			return goodSurfaceTexture;
		}

		public void setGoodSurfaceTexture(String goodSurfaceTexture) {
			this.goodSurfaceTexture = goodSurfaceTexture;
		}

		public String getLustre() {
			return lustre;
		}

		public void setLustre(String lustre) {
			this.lustre = lustre;
		}

		public String getAntiOder() {
			return antiOder;
		}

		public void setAntiOder(String antiOder) {
			this.antiOder = antiOder;
		}

		public String getWicking() {
			return wicking;
		}

		public void setWicking(String wicking) {
			this.wicking = wicking;
		}

		public String getRecovery() {
			return recovery;
		}

		public void setRecovery(String recovery) {
			this.recovery = recovery;
		}

		public String getStability() {
			return stability;
		}

		public void setStability(String stability) {
			this.stability = stability;
		}

		public String getDrape() {
			return drape;
		}

		public void setDrape(String drape) {
			this.drape = drape;
		}

		public String getTensileStringth() {
			return tensileStringth;
		}

		public void setTensileStringth(String tensileStringth) {
			this.tensileStringth = tensileStringth;
		}

		public String getRegistanceToAbrasion() {
			return registanceToAbrasion;
		}

		public void setRegistanceToAbrasion(String registanceToAbrasion) {
			this.registanceToAbrasion = registanceToAbrasion;
		}

		public String getTearingStrength() {
			return tearingStrength;
		}

		public void setTearingStrength(String tearingStrength) {
			this.tearingStrength = tearingStrength;
		}

		public String getSurfaceFraction() {
			return surfaceFraction;
		}

		public void setSurfaceFraction(String surfaceFraction) {
			this.surfaceFraction = surfaceFraction;
		}

		public String getBurstingStrength() {
			return burstingStrength;
		}

		public void setBurstingStrength(String burstingStrength) {
			this.burstingStrength = burstingStrength;
		}

		public String getRegistanceToSnagging() {
			return RegistanceToSnagging;
		}

		public void setRegistanceToSnagging(String registanceToSnagging) {
			RegistanceToSnagging = registanceToSnagging;
		}

		public String getWaterRepellent() {
			return waterRepellent;
		}

		public void setWaterRepellent(String waterRepellent) {
			this.waterRepellent = waterRepellent;
		}

		public String getStretchAndRecovery() {
			return stretchAndRecovery;
		}

		public void setStretchAndRecovery(String stretchAndRecovery) {
			this.stretchAndRecovery = stretchAndRecovery;
		}

		public String getPerspiration() {
			return perspiration;
		}

		public void setPerspiration(String perspiration) {
			this.perspiration = perspiration;
		}

		public String getRegustanceToStain() {
			return regustanceToStain;
		}

		public void setRegustanceToStain(String regustanceToStain) {
			this.regustanceToStain = regustanceToStain;
		}

		public String getRegistanceToMonth() {
			return registanceToMonth;
		}

		public void setRegistanceToMonth(String registanceToMonth) {
			this.registanceToMonth = registanceToMonth;
		}

		public String getWithstandUse() {
			return withstandUse;
		}

		public void setWithstandUse(String withstandUse) {
			this.withstandUse = withstandUse;
		}

		public String getNonAbsorbent() {
			return nonAbsorbent;
		}

		public void setNonAbsorbent(String nonAbsorbent) {
			this.nonAbsorbent = nonAbsorbent;
		}

		public String getEasyToDispose() {
			return easyToDispose;
		}

		public void setEasyToDispose(String easyToDispose) {
			this.easyToDispose = easyToDispose;
		}

		public String getSoilResistence() {
			return soilResistence;
		}

		public void setSoilResistence(String soilResistence) {
			this.soilResistence = soilResistence;
		}
	}

	

