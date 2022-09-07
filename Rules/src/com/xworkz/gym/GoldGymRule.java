package com.xworkz.gym;

public class GoldGymRule implements GymRule {

	@Override
	public boolean wearShoes() {
		System.out.println("compulsory wear shoes");
		return true;
	}

	@Override
	public boolean unisex() {
		System.out.println("it is unisex gym");
		return true;
	}

	@Override
	public double monthlyFees() {
		System.out.println("monthly fees is..");
		return 600;
	}

}
