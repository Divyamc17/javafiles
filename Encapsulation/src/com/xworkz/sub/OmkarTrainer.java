package com.xworkz.sub;

import com.xworkz.superclass.Trainer;

public class OmkarTrainer extends Trainer {

	public OmkarTrainer() {
		System.out.println("default constructor");
	}
	
	 public OmkarTrainer(String name,String speacialization,int experience) {
		 super(name,speacialization,experience);
	 }

	@Override
	public boolean coding() {
		
		return super.coding();
	}
	@Override
	public boolean trainer() {
	
		return super.trainer();
	}
	@Override
	public boolean conducInterview() {
		
		return super.conducInterview();
	}
	public String getName() {
		super.name=name;
		return name;
	}
	public String getSpeacialization() {
		super.speacialization=speacialization;
		return speacialization;
	}
	public int getExperience() {
		super.experience=experience;
		return experience;
	}
		


}

	

