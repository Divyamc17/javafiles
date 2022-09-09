package com.xworkz.dto;

public class GraphitDTO {
	
	private String form;
	private String colour;
	private double latticParameter;
	private double density;
	private double atomicVolume;
	private double triplePoint;
	private double boilingPoint;
	private double meltingPoint;
	private double heatFusion;
	private double automicGas;
	private double entropy;
	private double enthalpy;
	private double specificHeat;
	private double themalConductivity;
	private double elasticModulas;
	private double compressiveStrength;
	private double flexuralStrength;
	private double coefficient;
	private String madeUpOf;
	private boolean isAllotropy;
	private boolean isGoodConductor;
	private String use;
	private String sense;
	private Integer automicNo;
	private String block;
	private String symbol;
	private String hybridization;
	private Integer group;
	private String metampophic;
	
	@Override
	public int hashCode() {

		return 54;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof GraphitDTO) {
	    	 System.out.println("casting done");
	    	 GraphitDTO converted=(GraphitDTO)obj;
	      if(converted.form.equals(this.form)&& converted.colour.equals(this.colour)
	    		  &&converted.use.equals(this.use)&&converted.sense.equals(this.sense)&&
	    		  converted.symbol.equals(this.symbol)&&converted.madeUpOf.equals(this.madeUpOf)) {
	    	  System.out.println("form and colour are equal");
	      }
	      else {
	    	  System.out.println("form and colour are not equal");
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


	public String getForm() {
		return form;
	}


	public void setForm(String form) {
		this.form = form;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public double getLatticParameter() {
		return latticParameter;
	}


	public void setLatticParameter(double latticParameter) {
		this.latticParameter = latticParameter;
	}


	public double getDensity() {
		return density;
	}


	public void setDensity(double density) {
		this.density = density;
	}


	public double getAtomicVolume() {
		return atomicVolume;
	}


	public void setAtomicVolume(double atomicVolume) {
		this.atomicVolume = atomicVolume;
	}


	public double getTriplePoint() {
		return triplePoint;
	}


	public void setTriplePoint(double triplePoint) {
		this.triplePoint = triplePoint;
	}


	public double getBoilingPoint() {
		return boilingPoint;
	}


	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}


	public double getMeltingPoint() {
		return meltingPoint;
	}


	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}


	public double getHeatFusion() {
		return heatFusion;
	}


	public void setHeatFusion(double heatFusion) {
		this.heatFusion = heatFusion;
	}


	public double getAutomicGas() {
		return automicGas;
	}


	public void setAutomicGas(double automicGas) {
		this.automicGas = automicGas;
	}


	public double getEntropy() {
		return entropy;
	}


	public void setEntropy(double entropy) {
		this.entropy = entropy;
	}


	public double getEnthalpy() {
		return enthalpy;
	}


	public void setEnthalpy(double enthalpy) {
		this.enthalpy = enthalpy;
	}


	public double getSpecificHeat() {
		return specificHeat;
	}


	public void setSpecificHeat(double specificHeat) {
		this.specificHeat = specificHeat;
	}


	public double getThemalConductivity() {
		return themalConductivity;
	}


	public void setThemalConductivity(double themalConductivity) {
		this.themalConductivity = themalConductivity;
	}


	public double getElasticModulas() {
		return elasticModulas;
	}


	public void setElasticModulas(double elasticModulas) {
		this.elasticModulas = elasticModulas;
	}


	public double getCompressiveStrength() {
		return compressiveStrength;
	}


	public void setCompressiveStrength(double compressiveStrength) {
		this.compressiveStrength = compressiveStrength;
	}


	public double getFlexuralStrength() {
		return flexuralStrength;
	}


	public void setFlexuralStrength(double flexuralStrength) {
		this.flexuralStrength = flexuralStrength;
	}


	public double getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}


	public String getMadeUpOf() {
		return madeUpOf;
	}


	public void setMadeUpOf(String madeUpOf) {
		this.madeUpOf = madeUpOf;
	}


	public boolean isAllotropy() {
		return isAllotropy;
	}


	public void setAllotropy(boolean isAllotropy) {
		this.isAllotropy = isAllotropy;
	}


	public boolean isGoodConductor() {
		return isGoodConductor;
	}


	public void setGoodConductor(boolean isGoodConductor) {
		this.isGoodConductor = isGoodConductor;
	}


	public String getUse() {
		return use;
	}


	public void setUse(String use) {
		this.use = use;
	}


	public String getSense() {
		return sense;
	}


	public void setSense(String sense) {
		this.sense = sense;
	}


	public Integer getAutomicNo() {
		return automicNo;
	}


	public void setAutomicNo(Integer automicNo) {
		this.automicNo = automicNo;
	}


	public String getBlock() {
		return block;
	}


	public void setBlock(String block) {
		this.block = block;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public String getHybridization() {
		return hybridization;
	}


	public void setHybridization(String hybridization) {
		this.hybridization = hybridization;
	}


	public Integer getGroup() {
		return group;
	}


	public void setGroup(Integer group) {
		this.group = group;
	}


	public String getMetampophic() {
		return metampophic;
	}


	public void setMetampophic(String metampophic) {
		this.metampophic = metampophic;
	}

	
	
	
	

}
