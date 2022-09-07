package com.xworkz.gym;

public class GymStaff {
	
	private GymRule gymRule;
	
	public GymStaff(GymRule gymRule) {
		System.out.println("passing the gym rules");
		this.gymRule=gymRule;
	}
	
	public void checkRules() {
		boolean shoes=gymRule.wearShoes();
		boolean allowed=gymRule.unisex();
		double fee=gymRule.monthlyFees();
		if(shoes && fee>200 && allowed) {
			System.out.println("rules are followed");
		}
		else {
			System.out.println("rules are not followed");
		}
	}
	
	public void maintanance() {
		
	}

}
