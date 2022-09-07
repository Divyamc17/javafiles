package com.xworkz.main;

import com.xworkz.gym.ExamRule;
import com.xworkz.gym.KpscRule;
import com.xworkz.gym.StudentRule;

public class ExamRuleInvite {

	public static void main(String[] args) {

		
		ExamRule kpscRule=new KpscRule();
		
		StudentRule studentRule=new StudentRule(kpscRule);
		studentRule.checkRules();
		
	}

}
