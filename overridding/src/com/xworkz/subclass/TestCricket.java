package com.xworkz.subclass;

import com.xworkz.superclass.Cricket;

public class TestCricket extends Cricket {
	
	public TestCricket() {
		System.out.println("default constructor");
	}
	public String groundType;
	//@overriding
	public double setpresentation(double presentation) {
	if(presentation==20000) {
		return 2;
	}
		
		System.out.println("below presentation");
		return 0;
	}
	public void setGround(String groundType) {
		
	this.groundType=groundType;
	}
      
}
