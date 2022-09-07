package com.xworkz.gym;

public class StudentRule {
	
	private ExamRule examRule;
	
	
	public StudentRule(ExamRule examRule) {
		this.examRule=examRule;
	}
	
		public void checkRules(){
			boolean allTicket=examRule.compulsoryAllTicket();
			boolean shoes=examRule.wearShoes();
			boolean arrnaments=examRule.wearArrnaments();
			
			if(allTicket && shoes && arrnaments) {
				System.out.println("rule are folllwed");
			}
			else {
				System.out.println("rules are not followed");
			}
		}
		
		
	}


