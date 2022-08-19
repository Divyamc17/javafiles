package com.xworkz.Invite;

import com.xworkz.subclass.EarthPlanet;
import com.xworkz.superclass.Planet;

public class EarthInvite {

	public static void main(String[] args) {

		EarthPlanet earthplanet = new EarthPlanet("Oval", "blue", "tfyr", "Earth", 6713, true);
		earthplanet.torisu();

		Planet planet = new EarthPlanet("Oval", "blue", "tfyr");
		EarthPlanet convo = (EarthPlanet) planet;
	    convo.torisu();
		
		Planet planet1 = new EarthPlanet("Oval", "blue", "tfyr", "Earth", 6713, true);
		EarthPlanet convetedFromPlanet = (EarthPlanet)planet1;
		convetedFromPlanet.torisu();
		
	}

}
