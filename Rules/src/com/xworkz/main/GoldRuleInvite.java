package com.xworkz.main;

import com.xworkz.gym.GoldGymRule;
import com.xworkz.gym.GymRule;
import com.xworkz.gym.GymStaff;

public class GoldRuleInvite {

	public static void main(String[] args) {
	   
		GymRule gymRule = new GoldGymRule();
		System.out.println(gymRule.monthlyFees()); 
		
		
		GymStaff staff=new GymStaff(gymRule);
		staff.checkRules();
		staff.maintanance();
		
	}

}
