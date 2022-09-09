package com.xworkz.dto;

public class TreeDTO {

	
	private String name;
	private String type;
	private String scientificName;
	private String commonName;
	private String domain;
	private String kingdom;
	private boolean multicellureOrganisms;
	private String plantColour;
	private String photosynthesis;
	private boolean medicinalPlant;
	private String divisionName;
	private String group;
	private double noOfLivingSpecies;
	private String cellName;
	private String roots;
	private String wood;
	private String leaves;
	private String seeds;
	private String fruits;
	private String pollen;
	private String spores;
	private String phytoliths;
	private String amber;
	private String structure;
	private String growth;
	private String effectsOfFreezing;
	private String cells;
	private String internalDistribustion;
	private String genomics;
	private String encology;
	private String ecologicalRelationShip;
	private String importenceOfPlant;

	@Override
	public int hashCode() {
		return 200;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not equal");
			if (obj instanceof TreeDTO) {
				System.out.println("it is a instanceof plant");
				TreeDTO converted = (TreeDTO) obj;// casting
				if (converted.commonName.equals(this.commonName)
						&& converted.scientificName.equals(this.scientificName)) {
					System.out.println("commonName and scientificName are equal");

				} else {
					System.out.println("commonName and scientificName are not equal");
				}
			} else {
				System.out.println("both are equal");
			}
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public boolean isMulticellureOrganisms() {
		return multicellureOrganisms;
	}

	public void setMulticellureOrganisms(boolean multicellureOrganisms) {
		this.multicellureOrganisms = multicellureOrganisms;
	}

	public String getPlantColour() {
		return plantColour;
	}

	public void setPlantColour(String plantColour) {
		this.plantColour = plantColour;
	}

	public String getPhotosynthesis() {
		return photosynthesis;
	}

	public void setPhotosynthesis(String photosynthesis) {
		this.photosynthesis = photosynthesis;
	}

	public boolean isMedicinalPlant() {
		return medicinalPlant;
	}

	public void setMedicinalPlant(boolean medicinalPlant) {
		this.medicinalPlant = medicinalPlant;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getNoOfLivingSpecies() {
		return noOfLivingSpecies;
	}

	public void setNoOfLivingSpecies(double noOfLivingSpecies) {
		this.noOfLivingSpecies = noOfLivingSpecies;
	}

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public String getRoots() {
		return roots;
	}

	public void setRoots(String roots) {
		this.roots = roots;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public String getLeaves() {
		return leaves;
	}

	public void setLeaves(String leaves) {
		this.leaves = leaves;
	}

	public String getSeeds() {
		return seeds;
	}

	public void setSeeds(String seeds) {
		this.seeds = seeds;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getPollen() {
		return pollen;
	}

	public void setPollen(String pollen) {
		this.pollen = pollen;
	}

	public String getSpores() {
		return spores;
	}

	public void setSpores(String spores) {
		this.spores = spores;
	}

	public String getPhytoliths() {
		return phytoliths;
	}

	public void setPhytoliths(String phytoliths) {
		this.phytoliths = phytoliths;
	}

	public String getAmber() {
		return amber;
	}

	public void setAmber(String amber) {
		this.amber = amber;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getGrowth() {
		return growth;
	}

	public void setGrowth(String growth) {
		this.growth = growth;
	}

	public String getEffectsOfFreezing() {
		return effectsOfFreezing;
	}

	public void setEffectsOfFreezing(String effectsOfFreezing) {
		this.effectsOfFreezing = effectsOfFreezing;
	}

	public String getCells() {
		return cells;
	}

	public void setCells(String cells) {
		this.cells = cells;
	}

	public String getInternalDistribustion() {
		return internalDistribustion;
	}

	public void setInternalDistribustion(String internalDistribustion) {
		this.internalDistribustion = internalDistribustion;
	}

	public String getGenomics() {
		return genomics;
	}

	public void setGenomics(String genomics) {
		this.genomics = genomics;
	}

	public String getEncology() {
		return encology;
	}

	public void setEncology(String encology) {
		this.encology = encology;
	}

	public String getEcologicalRelationShip() {
		return ecologicalRelationShip;
	}

	public void setEcologicalRelationShip(String ecologicalRelationShip) {
		this.ecologicalRelationShip = ecologicalRelationShip;
	}

	public String getImportenceOfPlant() {
		return importenceOfPlant;
	}

	public void setImportenceOfPlant(String importenceOfPlant) {
		this.importenceOfPlant = importenceOfPlant;
	}
}
