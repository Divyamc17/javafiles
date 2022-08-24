package com.xworkz.classes;

public class HondaAutomobile extends Automobile {

	public double openTime;
	public double closeTime;
	
	public HondaAutomobile() {
		System.out.println("default honaautomobile");
	}
	
	public void setopenTime(double openTime) {
		 this.openTime=openTime;
	}
	public void setcloseTime(double closeTime) {
		 this.closeTime=closeTime;
	}
	@Override
	protected void torisu() {
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
	
}


