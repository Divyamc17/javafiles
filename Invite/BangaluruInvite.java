package com.xworkz.Invite;

import com.xworkz.subclass.BengaluruCity;
import com.xworkz.superclass.City;


public class BangaluruInvite {

	public static void main(String[] args) {
		BengaluruCity bengalurucity=new BengaluruCity("Bengaluru","Karnataka","India","siliconCity","Kempe Gowda",741);
		bengalurucity.torisu();
		
		
		City city=new BengaluruCity("Bengaluru","Karnataka","India");
		BengaluruCity convt=(BengaluruCity)city;
		convt.torisu();
		
		City city1=new BengaluruCity("Bengaluru","Karnataka","India","siliconCity","Kempe Gowda",741); 
		BengaluruCity cont=(BengaluruCity)city1;
		cont.torisu();
	}

}