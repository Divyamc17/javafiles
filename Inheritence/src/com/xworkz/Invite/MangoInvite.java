package com.xworkz.Invite;


import com.xworkz.subclass.MangoFruit;
import com.xworkz.superclass.Fruit;

public class MangoInvite {

	public static void main(String[] args) {
		MangoFruit mangofriut = new MangoFruit("mango", 50.00, "oval", "sweet", "orange", true);
		mangofriut.torisu();

		Fruit fruit = new MangoFruit("mango", 50.00, "oval");
		MangoFruit convert = (MangoFruit) fruit;
		convert.torisu();

		Fruit fruit1 = new MangoFruit("mango", 50.00, "oval", "sweet", "orange", true);
		MangoFruit convo = (MangoFruit) fruit1;
		convo.torisu();

	}

}
