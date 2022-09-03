package com.xworkz.dto;

public class CollegeDTO {

	private String name;
	private String streetName;
	private String area;
	private String cityName;
	private Integer founder;
	private Integer StartedYear;
	private boolean underVtu;
	private boolean afflicted;
	private Integer noOfEntrance;
	private Integer noofEntranceSteps;
	private boolean waitingLobby;
	private boolean receptionRoom;
	private boolean officeRoom;
	private String principalName;
	private String specialization;
	private String noOfExperiance;
	private Integer noOfFloors;
	private Integer noOfTotalSteps; 
	private Integer noOfRooms;
	private Integer noOfSection;
	private Integer noOfStudents;
	private Integer noOfBranch;
	private Integer noOfCanteen;
	private Integer noOfTeachingStaff;
	private Integer noOfNonteachingStaff; 
	private Integer nOfHOD;
	private Integer noOfLibrary;
	private Integer noOfCollectionBooks;
	private Integer grounWidth;
	private Integer groundLength;
	private Integer noOfGirlsHostal;
	private Integer noOfBoysHostial;
	private Integer fees;
	private Integer contactNo;
	private Integer overAllResult;
	
	
	@Override
	public int hashCode() {

		return 460;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not equal to null");
	     if(obj instanceof CollegeDTO) {
	    	 System.out.println("casting done");
	    	 CollegeDTO converted=(CollegeDTO)obj;
	      if(converted.name.equals(this.name)&& converted.cityName.equals(this.cityName)) {
	    	  System.out.println("name and cityName are equal");
	      }
	      else {
	    	  System.out.println("name and cityName are not equal");
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public Integer getFounder() {
		return founder;
	}


	public void setFounder(Integer founder) {
		this.founder = founder;
	}


	public Integer getStartedYear() {
		return StartedYear;
	}


	public void setStartedYear(Integer startedYear) {
		StartedYear = startedYear;
	}


	public boolean isUnderVtu() {
		return underVtu;
	}


	public void setUnderVtu(boolean underVtu) {
		this.underVtu = underVtu;
	}


	public boolean isAfflicted() {
		return afflicted;
	}


	public void setAfflicted(boolean afflicted) {
		this.afflicted = afflicted;
	}


	public Integer getNoOfEntrance() {
		return noOfEntrance;
	}


	public void setNoOfEntrance(Integer noOfEntrance) {
		this.noOfEntrance = noOfEntrance;
	}


	public Integer getNoofEntranceSteps() {
		return noofEntranceSteps;
	}


	public void setNoofEntranceSteps(Integer noofEntranceSteps) {
		this.noofEntranceSteps = noofEntranceSteps;
	}


	public boolean isWaitingLobby() {
		return waitingLobby;
	}


	public void setWaitingLobby(boolean waitingLobby) {
		this.waitingLobby = waitingLobby;
	}


	public boolean isReceptionRoom() {
		return receptionRoom;
	}


	public void setReceptionRoom(boolean receptionRoom) {
		this.receptionRoom = receptionRoom;
	}


	public boolean isOfficeRoom() {
		return officeRoom;
	}


	public void setOfficeRoom(boolean officeRoom) {
		this.officeRoom = officeRoom;
	}


	public String getPrincipalName() {
		return principalName;
	}


	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getNoOfExperiance() {
		return noOfExperiance;
	}


	public void setNoOfExperiance(String noOfExperiance) {
		this.noOfExperiance = noOfExperiance;
	}


	public Integer getNoOfFloors() {
		return noOfFloors;
	}


	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}


	public Integer getNoOfTotalSteps() {
		return noOfTotalSteps;
	}


	public void setNoOfTotalSteps(Integer noOfTotalSteps) {
		this.noOfTotalSteps = noOfTotalSteps;
	}


	public Integer getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public Integer getNoOfSection() {
		return noOfSection;
	}


	public void setNoOfSection(Integer noOfSection) {
		this.noOfSection = noOfSection;
	}


	public Integer getNoOfStudents() {
		return noOfStudents;
	}


	public void setNoOfStudents(Integer noOfStudents) {
		this.noOfStudents = noOfStudents;
	}


	public Integer getNoOfBranch() {
		return noOfBranch;
	}


	public void setNoOfBranch(Integer noOfBranch) {
		this.noOfBranch = noOfBranch;
	}


	public Integer getNoOfCanteen() {
		return noOfCanteen;
	}


	public void setNoOfCanteen(Integer noOfCanteen) {
		this.noOfCanteen = noOfCanteen;
	}


	public Integer getNoOfTeachingStaff() {
		return noOfTeachingStaff;
	}


	public void setNoOfTeachingStaff(Integer noOfTeachingStaff) {
		this.noOfTeachingStaff = noOfTeachingStaff;
	}


	public Integer getNoOfNonteachingStaff() {
		return noOfNonteachingStaff;
	}


	public void setNoOfNonteachingStaff(Integer noOfNonteachingStaff) {
		this.noOfNonteachingStaff = noOfNonteachingStaff;
	}


	public Integer getnOfHOD() {
		return nOfHOD;
	}


	public void setnOfHOD(Integer nOfHOD) {
		this.nOfHOD = nOfHOD;
	}


	public Integer getNoOfLibrary() {
		return noOfLibrary;
	}


	public void setNoOfLibrary(Integer noOfLibrary) {
		this.noOfLibrary = noOfLibrary;
	}


	public Integer getNoOfCollectionBooks() {
		return noOfCollectionBooks;
	}


	public void setNoOfCollectionBooks(Integer noOfCollectionBooks) {
		this.noOfCollectionBooks = noOfCollectionBooks;
	}


	public Integer getGrounWidth() {
		return grounWidth;
	}


	public void setGrounWidth(Integer grounWidth) {
		this.grounWidth = grounWidth;
	}


	public Integer getGroundLength() {
		return groundLength;
	}


	public void setGroundLength(Integer groundLength) {
		this.groundLength = groundLength;
	}


	public Integer getNoOfGirlsHostal() {
		return noOfGirlsHostal;
	}


	public void setNoOfGirlsHostal(Integer noOfGirlsHostal) {
		this.noOfGirlsHostal = noOfGirlsHostal;
	}


	public Integer getNoOfBoysHostial() {
		return noOfBoysHostial;
	}


	public void setNoOfBoysHostial(Integer noOfBoysHostial) {
		this.noOfBoysHostial = noOfBoysHostial;
	}


	public Integer getFees() {
		return fees;
	}


	public void setFees(Integer fees) {
		this.fees = fees;
	}


	public Integer getContactNo() {
		return contactNo;
	}


	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}


	public Integer getOverAllResult() {
		return overAllResult;
	}


	public void setOverAllResult(Integer overAllResult) {
		this.overAllResult = overAllResult;
	}
	
	
}
