
package com.xworkz.dto;

public class WaterDTO {

	private String color;
	private Integer density;
	private Integer molarMass;
	private Integer boilingPoint;
	private String meltingPoint;
	private Integer formula;
	private String odor;
	private String solubility;
	private Integer vapourPressure;
	private Integer acidity;
	private Integer basicity;
	private String conjugateAcid;
	private String conjugatrBase;
	private Integer thermal;
	private Integer index;
	private Integer viscocity;
	private String crystalStructure;
	private String pointGroup;
	private String molecularShape;
	private Integer dipoleMoment;
	private Integer molar;
	private Integer formation;
	private Integer gibbs;
	private String mainHazards;
	private String flashPoint;
	private String dataSheet;
	private String cations;
	private String solvents;
	private Integer wavelength;
	private String isotopes;
	private char firstLetter;
	private char secondLetter;
	private char thirdLetter;
	private char fourthLetter;
	private char fivthLetter;
	private String ironContent;
	private String phoshporous;
	private String naturalStroge;
	private String seaWatrer;
	private String shallowWater;
	private String deepWater;
	private String drinkingWater;
	private String hotWater;
	private String hardWater;
	private String softWater;
	private boolean shapeLess;

	@Override
	public int hashCode() {

		return 150;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("is not equal");
			if (obj instanceof WaterDTO) {
				System.out.println("is instance of water");
				WaterDTO converted = (WaterDTO) obj;  //casting
				if (converted.color.equals(this.color) && converted.boilingPoint.equals(this.boilingPoint)) {
					System.out.println("color and boilingpoint are equal");
				} else {
					System.out.println("color and boilingpoint are equal");
				}
			}
			else {
				System.out.println("is not instance of water");
			}
		}

		else {
			System.err.println("is equal");
		}

		return super.equals(obj);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getDensity() {
		return density;
	}

	public void setDensity(Integer density) {
		this.density = density;
	}

	public Integer getMolarMass() {
		return molarMass;
	}

	public void setMolarMass(Integer molarMass) {
		this.molarMass = molarMass;
	}

	public Integer getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(Integer boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public String getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(String meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public Integer getFormula() {
		return formula;
	}

	public void setFormula(Integer formula) {
		this.formula = formula;
	}

	public String getOdor() {
		return odor;
	}

	public void setOdor(String odor) {
		this.odor = odor;
	}

	public String getSolubility() {
		return solubility;
	}

	public void setSolubility(String solubility) {
		this.solubility = solubility;
	}

	public Integer getVapourPressure() {
		return vapourPressure;
	}

	public void setVapourPressure(Integer vapourPressure) {
		this.vapourPressure = vapourPressure;
	}

	public Integer getAcidity() {
		return acidity;
	}

	public void setAcidity(Integer acidity) {
		this.acidity = acidity;
	}

	public Integer getBasicity() {
		return basicity;
	}

	public void setBasicity(Integer basicity) {
		this.basicity = basicity;
	}

	public String getConjugateAcid() {
		return conjugateAcid;
	}

	public void setConjugateAcid(String conjugateAcid) {
		this.conjugateAcid = conjugateAcid;
	}

	public String getConjugatrBase() {
		return conjugatrBase;
	}

	public void setConjugatrBase(String conjugatrBase) {
		this.conjugatrBase = conjugatrBase;
	}

	public Integer getThermal() {
		return thermal;
	}

	public void setThermal(Integer thermal) {
		this.thermal = thermal;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getViscocity() {
		return viscocity;
	}

	public void setViscocity(Integer viscocity) {
		this.viscocity = viscocity;
	}

	public String getCrystalStructure() {
		return crystalStructure;
	}

	public void setCrystalStructure(String crystalStructure) {
		this.crystalStructure = crystalStructure;
	}

	public String getPointGroup() {
		return pointGroup;
	}

	public void setPointGroup(String pointGroup) {
		this.pointGroup = pointGroup;
	}

	public String getMolecularShape() {
		return molecularShape;
	}

	public void setMolecularShape(String molecularShape) {
		this.molecularShape = molecularShape;
	}

	public Integer getDipoleMoment() {
		return dipoleMoment;
	}

	public void setDipoleMoment(Integer dipoleMoment) {
		this.dipoleMoment = dipoleMoment;
	}

	public Integer getMolar() {
		return molar;
	}

	public void setMolar(Integer molar) {
		this.molar = molar;
	}

	public Integer getFormation() {
		return formation;
	}

	public void setFormation(Integer formation) {
		this.formation = formation;
	}

	public Integer getGibbs() {
		return gibbs;
	}

	public void setGibbs(Integer gibbs) {
		this.gibbs = gibbs;
	}

	public String getMainHazards() {
		return mainHazards;
	}

	public void setMainHazards(String mainHazards) {
		this.mainHazards = mainHazards;
	}

	public String getFlashPoint() {
		return flashPoint;
	}

	public void setFlashPoint(String flashPoint) {
		this.flashPoint = flashPoint;
	}

	public String getDataSheet() {
		return dataSheet;
	}

	public void setDataSheet(String dataSheet) {
		this.dataSheet = dataSheet;
	}

	public String getCations() {
		return cations;
	}

	public void setCations(String cations) {
		this.cations = cations;
	}

	public String getSolvents() {
		return solvents;
	}

	public void setSolvents(String solvents) {
		this.solvents = solvents;
	}

	public Integer getWavelength() {
		return wavelength;
	}

	public void setWavelength(Integer wavelength) {
		this.wavelength = wavelength;
	}

	public String getIsotopes() {
		return isotopes;
	}

	public void setIsotopes(String isotopes) {
		this.isotopes = isotopes;
	}

	public char getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(char firstLetter) {
		this.firstLetter = firstLetter;
	}

	public char getSecondLetter() {
		return secondLetter;
	}

	public void setSecondLetter(char secondLetter) {
		this.secondLetter = secondLetter;
	}

	public char getThirdLetter() {
		return thirdLetter;
	}

	public void setThirdLetter(char thirdLetter) {
		this.thirdLetter = thirdLetter;
	}

	public char getFourthLetter() {
		return fourthLetter;
	}

	public void setFourthLetter(char fourthLetter) {
		this.fourthLetter = fourthLetter;
	}

	public char getFivthLetter() {
		return fivthLetter;
	}

	public void setFivthLetter(char fivthLetter) {
		this.fivthLetter = fivthLetter;
	}

	public String getIronContent() {
		return ironContent;
	}

	public void setIronContent(String ironContent) {
		this.ironContent = ironContent;
	}

	public String getPhoshporous() {
		return phoshporous;
	}

	public void setPhoshporous(String phoshporous) {
		this.phoshporous = phoshporous;
	}

	public String getNaturalStroge() {
		return naturalStroge;
	}

	public void setNaturalStroge(String naturalStroge) {
		this.naturalStroge = naturalStroge;
	}

	public String getSeaWatrer() {
		return seaWatrer;
	}

	public void setSeaWatrer(String seaWatrer) {
		this.seaWatrer = seaWatrer;
	}

	public String getShallowWater() {
		return shallowWater;
	}

	public void setShallowWater(String shallowWater) {
		this.shallowWater = shallowWater;
	}

	public String getDeepWater() {
		return deepWater;
	}

	public void setDeepWater(String deepWater) {
		this.deepWater = deepWater;
	}

	public String getDrinkingWater() {
		return drinkingWater;
	}

	public void setDrinkingWater(String drinkingWater) {
		this.drinkingWater = drinkingWater;
	}

	public String getHotWater() {
		return hotWater;
	}

	public void setHotWater(String hotWater) {
		this.hotWater = hotWater;
	}

	public String getHardWater() {
		return hardWater;
	}

	public void setHardWater(String hardWater) {
		this.hardWater = hardWater;
	}

	public String getSoftWater() {
		return softWater;
	}

	public void setSoftWater(String softWater) {
		this.softWater = softWater;
	}

	public boolean isShapeLess() {
		return shapeLess;
	}

	public void setShapeLess(boolean shapeLess) {
		this.shapeLess = shapeLess;
	}

}
