package com.xworkz.dto;

public class BuilidingDTO {

  private Integer noOfFooting;
  private Integer footingLength;
  private Integer footingWidth;
  private Integer footinDepth;
  private Integer noPlinthBeam;
  private Integer plinthLength;
  private Integer plinthWidth;
  private Integer plinthDepth;
  private Integer noOfwall;
  private Integer noOflength;
  private Integer noOfWidth;
  private Integer noOfBricks;
  private Integer brickLength;
  private Integer brickWidth;
  private Integer brickDepth;
  private Integer noOfWindows;
  private Integer windowsLength;
  private Integer windowsWidth;
  private Integer sillHeight;
  private Integer sillwidth;
  private Integer noOfLintels;
  private Integer lintelWidth;
  private Integer lintelLength;
  private Integer lintelDepth;
  private Integer noOfDoors;
  private Integer doorlength;
  private Integer doorWidth;
  private Integer noOfVentilator;
  private Integer ventilaterLength;
  private Integer ventilaterWidth;
  private Integer noOfColumn;
  private Integer columnLength;
  private Integer columnWidth;
  private Integer columnDepth;
  private Integer slabLength;
  private Integer slabWidth;
  private Integer slabDepth;
  private Integer noOfBeam;
  private Integer beamLength;
  private Integer beamWidth;
  private Integer beamDepth;
  private Integer thicknessOfPalastring;
  private Integer flooringLenth;
  private Integer flooringWidth;
  private Integer noOfTiles;
  private Integer heightOfPrapitWall;
  
  
  @Override
	public int hashCode() {
	
		return 45;
	}
  
  @Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("is not equal");
			if (obj instanceof BuilidingDTO) {
				System.out.println("is instance of BuilidingDTO ");
				BuilidingDTO converted = (BuilidingDTO) obj;  //casting
				if (converted.noOfFooting.equals(this.noOfFooting) && converted.noOfBeam.equals(this.noOfBeam)) {
					System.out.println("noOfFooting and noOfBeam are equal");
				} else {
					System.out.println("noOfFooting and noOfBeam are equal");
				}
			}
			else {
				System.out.println("is not instance of BuilidingDTO");
			}
		}

		else {
			System.err.println("is equal");
		}

		return super.equals(obj);
	}

public Integer getNoOfFooting() {
	return noOfFooting;
}

public void setNoOfFooting(Integer noOfFooting) {
	this.noOfFooting = noOfFooting;
}

public Integer getFootingLength() {
	return footingLength;
}

public void setFootingLength(Integer footingLength) {
	this.footingLength = footingLength;
}

public Integer getFootingWidth() {
	return footingWidth;
}

public void setFootingWidth(Integer footingWidth) {
	this.footingWidth = footingWidth;
}

public Integer getFootinDepth() {
	return footinDepth;
}

public void setFootinDepth(Integer footinDepth) {
	this.footinDepth = footinDepth;
}

public Integer getNoPlinthBeam() {
	return noPlinthBeam;
}

public void setNoPlinthBeam(Integer noPlinthBeam) {
	this.noPlinthBeam = noPlinthBeam;
}

public Integer getPlinthLength() {
	return plinthLength;
}

public void setPlinthLength(Integer plinthLength) {
	this.plinthLength = plinthLength;
}

public Integer getPlinthWidth() {
	return plinthWidth;
}

public void setPlinthWidth(Integer plinthWidth) {
	this.plinthWidth = plinthWidth;
}

public Integer getPlinthDepth() {
	return plinthDepth;
}

public void setPlinthDepth(Integer plinthDepth) {
	this.plinthDepth = plinthDepth;
}

public Integer getNoOfwall() {
	return noOfwall;
}

public void setNoOfwall(Integer noOfwall) {
	this.noOfwall = noOfwall;
}

public Integer getNoOflength() {
	return noOflength;
}

public void setNoOflength(Integer noOflength) {
	this.noOflength = noOflength;
}

public Integer getNoOfWidth() {
	return noOfWidth;
}

public void setNoOfWidth(Integer noOfWidth) {
	this.noOfWidth = noOfWidth;
}

public Integer getNoOfBricks() {
	return noOfBricks;
}

public void setNoOfBricks(Integer noOfBricks) {
	this.noOfBricks = noOfBricks;
}

public Integer getBrickLength() {
	return brickLength;
}

public void setBrickLength(Integer brickLength) {
	this.brickLength = brickLength;
}

public Integer getBrickWidth() {
	return brickWidth;
}

public void setBrickWidth(Integer brickWidth) {
	this.brickWidth = brickWidth;
}

public Integer getBrickDepth() {
	return brickDepth;
}

public void setBrickDepth(Integer brickDepth) {
	this.brickDepth = brickDepth;
}

public Integer getNoOfWindows() {
	return noOfWindows;
}

public void setNoOfWindows(Integer noOfWindows) {
	this.noOfWindows = noOfWindows;
}

public Integer getWindowsLength() {
	return windowsLength;
}

public void setWindowsLength(Integer windowsLength) {
	this.windowsLength = windowsLength;
}

public Integer getWindowsWidth() {
	return windowsWidth;
}

public void setWindowsWidth(Integer windowsWidth) {
	this.windowsWidth = windowsWidth;
}

public Integer getSillHeight() {
	return sillHeight;
}

public void setSillHeight(Integer sillHeight) {
	this.sillHeight = sillHeight;
}

public Integer getSillwidth() {
	return sillwidth;
}

public void setSillwidth(Integer sillwidth) {
	this.sillwidth = sillwidth;
}

public Integer getNoOfLintels() {
	return noOfLintels;
}

public void setNoOfLintels(Integer noOfLintels) {
	this.noOfLintels = noOfLintels;
}

public Integer getLintelWidth() {
	return lintelWidth;
}

public void setLintelWidth(Integer lintelWidth) {
	this.lintelWidth = lintelWidth;
}

public Integer getLintelLength() {
	return lintelLength;
}

public void setLintelLength(Integer lintelLength) {
	this.lintelLength = lintelLength;
}

public Integer getLintelDepth() {
	return lintelDepth;
}

public void setLintelDepth(Integer lintelDepth) {
	this.lintelDepth = lintelDepth;
}

public Integer getNoOfDoors() {
	return noOfDoors;
}

public void setNoOfDoors(Integer noOfDoors) {
	this.noOfDoors = noOfDoors;
}

public Integer getDoorlength() {
	return doorlength;
}

public void setDoorlength(Integer doorlength) {
	this.doorlength = doorlength;
}

public Integer getDoorWidth() {
	return doorWidth;
}

public void setDoorWidth(Integer doorWidth) {
	this.doorWidth = doorWidth;
}

public Integer getNoOfVentilator() {
	return noOfVentilator;
}

public void setNoOfVentilator(Integer noOfVentilator) {
	this.noOfVentilator = noOfVentilator;
}

public Integer getVentilaterLength() {
	return ventilaterLength;
}

public void setVentilaterLength(Integer ventilaterLength) {
	this.ventilaterLength = ventilaterLength;
}

public Integer getVentilaterWidth() {
	return ventilaterWidth;
}

public void setVentilaterWidth(Integer ventilaterWidth) {
	this.ventilaterWidth = ventilaterWidth;
}

public Integer getNoOfColumn() {
	return noOfColumn;
}

public void setNoOfColumn(Integer noOfColumn) {
	this.noOfColumn = noOfColumn;
}

public Integer getColumnLength() {
	return columnLength;
}

public void setColumnLength(Integer columnLength) {
	this.columnLength = columnLength;
}

public Integer getColumnWidth() {
	return columnWidth;
}

public void setColumnWidth(Integer columnWidth) {
	this.columnWidth = columnWidth;
}

public Integer getColumnDepth() {
	return columnDepth;
}

public void setColumnDepth(Integer columnDepth) {
	this.columnDepth = columnDepth;
}

public Integer getSlabLength() {
	return slabLength;
}

public void setSlabLength(Integer slabLength) {
	this.slabLength = slabLength;
}

public Integer getSlabWidth() {
	return slabWidth;
}

public void setSlabWidth(Integer slabWidth) {
	this.slabWidth = slabWidth;
}

public Integer getSlabDepth() {
	return slabDepth;
}

public void setSlabDepth(Integer slabDepth) {
	this.slabDepth = slabDepth;
}

public Integer getNoOfBeam() {
	return noOfBeam;
}

public void setNoOfBeam(Integer noOfBeam) {
	this.noOfBeam = noOfBeam;
}

public Integer getBeamLength() {
	return beamLength;
}

public void setBeamLength(Integer beamLength) {
	this.beamLength = beamLength;
}

public Integer getBeamWidth() {
	return beamWidth;
}

public void setBeamWidth(Integer beamWidth) {
	this.beamWidth = beamWidth;
}

public Integer getBeamDepth() {
	return beamDepth;
}

public void setBeamDepth(Integer beamDepth) {
	this.beamDepth = beamDepth;
}

public Integer getThicknessOfPalastring() {
	return thicknessOfPalastring;
}

public void setThicknessOfPalastring(Integer thicknessOfPalastring) {
	this.thicknessOfPalastring = thicknessOfPalastring;
}

public Integer getFlooringLenth() {
	return flooringLenth;
}

public void setFlooringLenth(Integer flooringLenth) {
	this.flooringLenth = flooringLenth;
}

public Integer getFlooringWidth() {
	return flooringWidth;
}

public void setFlooringWidth(Integer flooringWidth) {
	this.flooringWidth = flooringWidth;
}

public Integer getNoOfTiles() {
	return noOfTiles;
}

public void setNoOfTiles(Integer noOfTiles) {
	this.noOfTiles = noOfTiles;
}

public Integer getHeightOfPrapitWall() {
	return heightOfPrapitWall;
}

public void setHeightOfPrapitWall(Integer heightOfPrapitWall) {
	this.heightOfPrapitWall = heightOfPrapitWall;
}


	
	
	
}
