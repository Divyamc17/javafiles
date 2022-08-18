package com.xworkz.subclass;

import com.xworkz.superclass.KeyBoard;

public class TouchPadKeyBoard extends KeyBoard {
 
	public int alphabetKey;
	public int functionKey;
	public int specialKey;
	
	 public TouchPadKeyBoard(double length,double width,int numberKey, int alphabetKey,int functionKey,int specialKey){
		super(length,width,numberKey);
		this.alphabetKey=alphabetKey;
		this.functionKey=functionKey;
		this.specialKey=specialKey;
		
	}
	 public TouchPadKeyBoard(double length,double width,int numberKey) {
		 super(length,width,numberKey); 
	 }
	 
	 public void torisu() {
		 
		 System.out.println(super.length);
		 System.out.println(super.width);
		 System.out.println(super.numberKey);
		 System.out.println(this.alphabetKey);
		 System.out.println(this.functionKey);
		 System.out.println(this.specialKey);
	 }
}

