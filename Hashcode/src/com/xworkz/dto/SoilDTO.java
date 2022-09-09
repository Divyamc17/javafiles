package com.xworkz.dto;

public class SoilDTO {

	
	private int typeSoil;
	private String sand;
	private String clay;
	private String silt;
	private boolean texture;
	private int textureType;
	private boolean porosity;
	private boolean permeability;
	private boolean infiltration;
	private boolean shrinkSwellRate;
	private boolean waterHoldingCapacity;
	private boolean consistency;
	private String shape;
	private double size;
	private double density;
	private int densityType;
	private String particleDensity;
	private String bulkDensity;
	private int noOfChemicals;
	private String drySoil;
	private String moistSoil;
	private String wetSoil;
	private String cementedSoil;
	private double temperature;
	private String color;
	private boolean resistivity;
	private boolean minerals;
	private double ironContent;
	private double silica;
	private double poreSize;
	private double macropores;
	private boolean smell;
	private boolean cohesion;
	private boolean adhesion;
	private double poreSpace;
	private double poreSizes;
	private double meltingPoint;
	private double energy;
	private boolean seedGermination;
	private boolean seedDormancy;
	private boolean nutritients;
	private boolean decomposing;
	private int noOfStones;
	private double fractalDimension;
	private double cultivation;
	private boolean electricPass;
	private boolean fertility;
	private boolean specificSurfaceArea;

	@Override
	public int hashCode() {

		return 143;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof SoilDTO) {
				SoilDTO casted = (SoilDTO) obj;
				if (casted.sand.equals(this.sand) && casted.color.equals(this.color)) {
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

	public int getTypeSoil() {
		return typeSoil;
	}

	public void setTypeSoil(int typeSoil) {
		this.typeSoil = typeSoil;
	}

	public String getSand() {
		return sand;
	}

	public void setSand(String sand) {
		this.sand = sand;
	}

	public String getClay() {
		return clay;
	}

	public void setClay(String clay) {
		this.clay = clay;
	}

	public String getSilt() {
		return silt;
	}

	public void setSilt(String silt) {
		this.silt = silt;
	}

	public boolean isTexture() {
		return texture;
	}

	public void setTexture(boolean texture) {
		this.texture = texture;
	}

	public int getTextureType() {
		return textureType;
	}

	public void setTextureType(int textureType) {
		this.textureType = textureType;
	}

	public boolean isPorosity() {
		return porosity;
	}

	public void setPorosity(boolean porosity) {
		this.porosity = porosity;
	}

	public boolean isPermeability() {
		return permeability;
	}

	public void setPermeability(boolean permeability) {
		this.permeability = permeability;
	}

	public boolean isInfiltration() {
		return infiltration;
	}

	public void setInfiltration(boolean infiltration) {
		this.infiltration = infiltration;
	}

	public boolean isShrinkSwellRate() {
		return shrinkSwellRate;
	}

	public void setShrinkSwellRate(boolean shrinkSwellRate) {
		this.shrinkSwellRate = shrinkSwellRate;
	}

	public boolean isWaterHoldingCapacity() {
		return waterHoldingCapacity;
	}

	public void setWaterHoldingCapacity(boolean waterHoldingCapacity) {
		this.waterHoldingCapacity = waterHoldingCapacity;
	}

	public boolean isConsistency() {
		return consistency;
	}

	public void setConsistency(boolean consistency) {
		this.consistency = consistency;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public int getDensityType() {
		return densityType;
	}

	public void setDensityType(int densityType) {
		this.densityType = densityType;
	}

	public String getParticleDensity() {
		return particleDensity;
	}

	public void setParticleDensity(String particleDensity) {
		this.particleDensity = particleDensity;
	}

	public String getBulkDensity() {
		return bulkDensity;
	}

	public void setBulkDensity(String bulkDensity) {
		this.bulkDensity = bulkDensity;
	}

	public int getNoOfChemicals() {
		return noOfChemicals;
	}

	public void setNoOfChemicals(int noOfChemicals) {
		this.noOfChemicals = noOfChemicals;
	}

	public String getDrySoil() {
		return drySoil;
	}

	public void setDrySoil(String drySoil) {
		this.drySoil = drySoil;
	}

	public String getMoistSoil() {
		return moistSoil;
	}

	public void setMoistSoil(String moistSoil) {
		this.moistSoil = moistSoil;
	}

	public String getWetSoil() {
		return wetSoil;
	}

	public void setWetSoil(String wetSoil) {
		this.wetSoil = wetSoil;
	}

	public String getCementedSoil() {
		return cementedSoil;
	}

	public void setCementedSoil(String cementedSoil) {
		this.cementedSoil = cementedSoil;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isResistivity() {
		return resistivity;
	}

	public void setResistivity(boolean resistivity) {
		this.resistivity = resistivity;
	}

	public boolean isMinerals() {
		return minerals;
	}

	public void setMinerals(boolean minerals) {
		this.minerals = minerals;
	}

	public double getIronContent() {
		return ironContent;
	}

	public void setIronContent(double ironContent) {
		this.ironContent = ironContent;
	}

	public double getSilica() {
		return silica;
	}

	public void setSilica(double silica) {
		this.silica = silica;
	}

	public double getPoreSize() {
		return poreSize;
	}

	public void setPoreSize(double poreSize) {
		this.poreSize = poreSize;
	}

	public double getMacropores() {
		return macropores;
	}

	public void setMacropores(double macropores) {
		this.macropores = macropores;
	}

	public boolean isSmell() {
		return smell;
	}

	public void setSmell(boolean smell) {
		this.smell = smell;
	}

	public boolean isCohesion() {
		return cohesion;
	}

	public void setCohesion(boolean cohesion) {
		this.cohesion = cohesion;
	}

	public boolean isAdhesion() {
		return adhesion;
	}

	public void setAdhesion(boolean adhesion) {
		this.adhesion = adhesion;
	}

	public double getPoreSpace() {
		return poreSpace;
	}

	public void setPoreSpace(double poreSpace) {
		this.poreSpace = poreSpace;
	}

	public double getPoreSizes() {
		return poreSizes;
	}

	public void setPoreSizes(double poreSizes) {
		this.poreSizes = poreSizes;
	}

	public double getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public boolean isSeedGermination() {
		return seedGermination;
	}

	public void setSeedGermination(boolean seedGermination) {
		this.seedGermination = seedGermination;
	}

	public boolean isSeedDormancy() {
		return seedDormancy;
	}

	public void setSeedDormancy(boolean seedDormancy) {
		this.seedDormancy = seedDormancy;
	}

	public boolean isNutritients() {
		return nutritients;
	}

	public void setNutritients(boolean nutritients) {
		this.nutritients = nutritients;
	}

	public boolean isDecomposing() {
		return decomposing;
	}

	public void setDecomposing(boolean decomposing) {
		this.decomposing = decomposing;
	}

	public int getNoOfStones() {
		return noOfStones;
	}

	public void setNoOfStones(int noOfStones) {
		this.noOfStones = noOfStones;
	}

	public double getFractalDimension() {
		return fractalDimension;
	}

	public void setFractalDimension(double fractalDimension) {
		this.fractalDimension = fractalDimension;
	}

	public double getCultivation() {
		return cultivation;
	}

	public void setCultivation(double cultivation) {
		this.cultivation = cultivation;
	}

	public boolean isElectricPass() {
		return electricPass;
	}

	public void setElectricPass(boolean electricPass) {
		this.electricPass = electricPass;
	}

	public boolean isFertility() {
		return fertility;
	}

	public void setFertility(boolean fertility) {
		this.fertility = fertility;
	}

	public boolean isSpecificSurfaceArea() {
		return specificSurfaceArea;
	}

	public void setSpecificSurfaceArea(boolean specificSurfaceArea) {
		this.specificSurfaceArea = specificSurfaceArea;
	}

}
