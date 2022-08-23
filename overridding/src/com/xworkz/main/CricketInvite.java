package com.xworkz.main;

import com.xworkz.subclass.OneDayCricket;
import com.xworkz.subclass.T20Cricket;
import com.xworkz.subclass.TestCricket;
import com.xworkz.superclass.Cricket;

public class CricketInvite {

	public static void main(String[] args) {
		
      Cricket cricket=new Cricket();
      cricket.setproperties("India", "Dhoni", 'M');
      cricket.setentertainment(true);
      cricket.setpresentation(20000);
      
     Cricket cric=new TestCricket();
      cric.setpresentation(15000.00);
      TestCricket testcricket=new TestCricket();
      testcricket.setGround("Rectangular");
     
     Cricket cre=new OneDayCricket();
     cre.setentertainment(false);
     cre.setpresentation(15000);
     OneDayCricket one=new OneDayCricket();
     one.manOfSeries("Rahul");
     
     Cricket crk=new T20Cricket();
     crk.setentertainment(false);
     T20Cricket t20cricket=new T20Cricket();
     t20cricket.manOfMatch("Dravid");
     
      
	}  
	

}
