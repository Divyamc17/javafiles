package com.xworkz.gym;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("not required");
		return true;
	}

	@Override
	public int age() {
		System.out.println("above 21");
		return 0;
	}

	@Override
	public boolean validProof() {
		System.out.println("any national id");
		return true;
	}

}
