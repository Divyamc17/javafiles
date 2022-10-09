package com.xworkz.state;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class State {

	public static void main(String[] args) {
	   
		List<String> place=new ArrayList();
		place.add("Andra Prdesh");
		place.add("Arunachal Pradesh");
		place.add("Assam");
		place.add("Bihar");
		place.add("Chattisgash");
		place.add("Goa");
		place.add("Gujarat");
		place.add("Haryana");
		place.add("Himachal Pradesh");
		place.add("Jharkhand");
		place.add("Karnataka");
		place.add("Kearala");
		place.add("Madhya Pradesh");
		place.add("Maharashtra");
		place.add("Manipur");
		place.add("Meghalaya");
		place.add("Mizoram");
		place.add("Nagaland");
		place.add("Odisha");
		place.add("Punjab");
		place.add("Rajasthan");
		place.add("Sikkim");
		place.add("Tamil Nadu");
		place.add("Telengana");
		place.add("Tripura");
		place.add("Uttarakhand");
		place.add("Uttar Pradesh");
		place.add("West Bengal");
		
		
		place.forEach((ref)->System.out.println(ref));
		System.out.println("============");
        place.stream().filter(name->name.endsWith("a")).forEach(ref->System.out.println(ref));
    	System.out.println("============");
    	//place.forEach(ref->System.out.println(ref));
        place.stream().filter(name->name.startsWith("k")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(name->name.contains("u")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(name->name.contains("l")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(name->name.contains("d")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(name->name.contains("r")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(name->name.contains("h")).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().map(name->name.toUpperCase()).forEach(ref->System.out.println(ref)); 
        System.out.println("============");
        place.stream().map(name->name.toLowerCase()).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(cha->cha.length()>10).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().filter(cha->cha.length()<5).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
        System.out.println("============");
        place.stream().collect(Collectors.toList()).Collections.reverse(place).forEach(ref->System.out.println(ref));
	}	

}