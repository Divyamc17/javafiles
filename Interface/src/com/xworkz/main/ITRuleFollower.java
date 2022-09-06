package com.xworkz.main;

import com.xworkz.interfaces.HRRules;
import com.xworkz.interfaces.ManagerRules;
import com.xworkz.interfaces.SecurityRules;

public class ITRuleFollower implements HRRules, SecurityRules, ManagerRules {

	@Override
	public boolean informLeave() {
	System.out.println("without information leave is not applicable");
		return false;
	}

	@Override
	public boolean wfh() {
		System.out.println("during covid time");
		return false;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("swipe card is available ");
		return false;
	}

	@Override
	public boolean parkingApporval() {
		System.out.println("for parking approval is required");
		return false;
	}

	@Override
	public boolean applyLeaves() {
	    System.out.println("without information leaves are approved");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("prohibited");
		return false;
	}

}
