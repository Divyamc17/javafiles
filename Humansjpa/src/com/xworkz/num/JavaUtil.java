package com.xworkz.num;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JavaUtil {
	
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}
	static {
		System.out.println("method created in static block");
		factory=Persistence.createEntityManagerFactory("com.xworkz");
	}
}

