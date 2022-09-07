package com.xworkz.main;

import com.xworkz.gym.CustomerPubRule;
import com.xworkz.gym.DownTownPub;
import com.xworkz.gym.PubRule;

public class PubRuleInvite {

	public static void main(String[] args) {
		
		PubRule pubrule=new CustomerPubRule(); 
		
		DownTownPub downtownpub=new DownTownPub(pubrule); 
		downtownpub.checkRules();

	}
}

