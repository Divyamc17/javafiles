package com.xworkz.subclass;

import com.xworkz.superclass.Fruit;

public class MangoFruit extends Fruit {

	 public String taste;
	 public String color;
	 public boolean ripen;
	  
	 public MangoFruit(String name,double price,String shape,String taste,
			 String color,boolean ripen) {
	   super(name,price,shape);	
		 this.taste=taste;
		 this.color=color;
		 this.ripen=ripen;	
	 }
	 public MangoFruit(String name,double price,String shape) {
	 super(name,price,shape);	
	 }
	 
	 public void torisu() {
		 
		 System.out.println(super.name);
		 System.out.println(super.price);
		 System.out.println(super.shape);
		 System.out.println(this.taste);
		 System.out.println(this.color);
		 System.out.println(this.ripen);
	 }
	 
}
