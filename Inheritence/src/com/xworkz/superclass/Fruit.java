package com.xworkz.superclass;

public class Fruit {
	
	public String name;
	public double price;
	public String shape;
	
	public Fruit(String name,double price,String shape)
	{
    this.name=name;
    this.price=price;
    this.shape=shape;
	}
	public Fruit() {
		System.out.println("default fruit");
	}
}
