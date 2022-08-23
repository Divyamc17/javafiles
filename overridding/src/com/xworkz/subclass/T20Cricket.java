package com.xworkz.subclass;

import com.xworkz.superclass.Cricket;

public class T20Cricket extends Cricket {
	
	public T20Cricket() {
		System.out.println("constructor T20Cricket");
	}
	public String manOfMatch(String name) {
		if (name== captain)
			
		{
			return captain;
		}
		return "noOne";

}
	public boolean setentertainment(boolean entertainment) {
		  System.out.println("setentertainment is true");
		  if(entertainment==false) {
			  return true;
		  }
		  return false;
}
}
