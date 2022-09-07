package com.xworkz.gym;

public class DownTownPub {
	
	private PubRule rule; 
	
	
	public DownTownPub(PubRule rule) {
		System.out.println("some rules are their");
		this.rule=rule;
	}
	 public void checkRules() {
	    boolean dress=rule.dressCodefollowed();
		boolean proof= rule.validProof();
		int age=rule.age();
		if(dress && proof && age>21) {
			System.out.println("applicable for all rules");
		}
		else {
			System.out.println("not applicable for all rules");
		}
	 }

}
