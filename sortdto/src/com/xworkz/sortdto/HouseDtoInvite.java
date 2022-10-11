package com.xworkz.sortdto;

import java.util.ArrayList;
import java.util.List;

public class HouseDtoInvite {

	public static void main(String[] args) {
		
		HouseDto house =new HouseDto(1, "Aashishu", "Shiva", Type.VILLA, 2, false, OwningType.LEASE, 1500.00);
		HouseDto house1=new HouseDto(2, "Nandagogula", "Ramesh", Type.INDIVIDUAL, 7, false, OwningType.RENT, 2500.00);
		HouseDto house2=new HouseDto(3, "Jeenu Goodu", "Chakravarthi", Type.APPARTMENT, 25, true,OwningType.OWN,1745.00);
		HouseDto house3=new HouseDto(4, "Chaithya", "Pannaga", Type.VILLA, 18, true, OwningType.OWN, 1000.00);
		HouseDto house4=new HouseDto(5, "sreeSyla", "Mallikarjun", Type.VILLA, 17, false, OwningType.LEASE, 1600.00);
		HouseDto house5=new HouseDto(5, "Kanasu", "Mahesh", Type.INDIVIDUAL, 9, false, OwningType.RENT, 2000.00);
		HouseDto house6=new HouseDto(6, "Raman", "Paramesh", Type.VILLA, 14, false, OwningType.OWN, 19000.00);
		HouseDto house7=new HouseDto(7, "Gruha", "Ganesh", Type.APPARTMENT, 18, true, OwningType.LEASE, 1400.0);
		HouseDto house8=new HouseDto(8, "Maraka", "Maneesh", Type.INDIVIDUAL, 1, false, OwningType.OWN, 2500.00);
		HouseDto house9=new HouseDto(9, "Myna", "Lakshmi", Type.INDIVIDUAL, 2, true, OwningType.RENT, 1800.00);
		HouseDto house10=new HouseDto(10, "Nilaya", "kannesh", Type.APPARTMENT, 4, false, OwningType.RENT, 2500.00);
		HouseDto house11=new HouseDto(11, "Mahalakshmi", "Bharath", Type.INDIVIDUAL, 1, true, OwningType.RENT, 14000.00);
		HouseDto house12=new HouseDto(12, "Lakshmi", "Amaravathi", Type.VILLA, 2, true, OwningType.RENT, 1400.30);
		HouseDto house13=new HouseDto(13, "Janavi", "Davanth", Type.APPARTMENT, 18, false, OwningType.OWN, 1780.20);
		HouseDto house14=new HouseDto(14, "Krupa", "Bhavya", Type.APPARTMENT, 14, true, OwningType.LEASE, 14728.20);
		HouseDto house15=new HouseDto(15, "Karunya", "Kanaka", Type.VILLA, 1, false, OwningType.OWN, 1479.30);
		HouseDto house16=new HouseDto(16, "Mareena", "Naresh", Type.INDIVIDUAL, 14, false, OwningType.RENT, 1458.32);
		HouseDto house17=new HouseDto(17, "Delta", "Byresh", Type.VILLA, 2, true, OwningType.OWN, 1368.20);
		HouseDto house18=new HouseDto(18, "Malpe", "Nithesh", Type.INDIVIDUAL, 18, false, OwningType.LEASE, 19876.30);
		HouseDto house19=new HouseDto(19, "Layasa", "Ravana", Type.INDIVIDUAL, 1, true, OwningType.LEASE, 1900.00);
		HouseDto house20=new HouseDto(20, "Charudi", "Bhuvana", Type.APPARTMENT, 28, true, OwningType.RENT, 12458.35);
		
		List<HouseDto> hous=new ArrayList<HouseDto>();
		hous.add(house);
		hous.add(house1);
		hous.add(house2);
		hous.add(house3);
		hous.add(house4);
		hous.add(house5);
		hous.add(house6);
		hous.add(house7);
		hous.add(house8);
		hous.add(house9);
		hous.add(house10);
		hous.add(house11);
		hous.add(house12);
		hous.add(house13);
		hous.add(house14);
		hous.add(house15);
		hous.add(house16);
		hous.add(house17);
		hous.add(house18);
		hous.add(house19);
		hous.add(house20);
		//asc order by id
		hous.stream()
		.sorted((h1,h2)->{return Integer.compare(h1.getId(), h2.getId());
		}).forEach(n->System.out.println(n));
		System.out.println("-------------------------");
		
		//desc order by id 
		hous.stream()
		.sorted((h1,h2)->{return Integer.compare(h2.getId(), h1.getId());
		}).forEach(n->System.out.println(n));
		System.out.println("-------------------------");

		//asc order by name
		hous.stream(). 
		sorted((h1,h2)->h1.getName().compareTo(h2.getName())).
		forEach(m-> System.out.println(m));
		System.out.println("-------------------------");
		
		//desc order by type
		hous.stream().sorted((h1,h2)->h1.getType().compareTo(h2.getType())).
		forEach(t->System.out.println(t));
		System.out.println("-------------------------");
		
		//desc order by sqfeet
		
		/*hous.stream().sorted((h1,h2)->{return Integer.compare(h1.getSqfeet(), h2.getSqfeet());}).
		forEach(t->System.out.println(t));*/
		System.out.println("-------------------------");
		
		hous.stream().filter(l->l.getLoan()==true).
		sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).
		forEach(r->System.out.println(r));
		System.out.println("-------------------------");
		
		hous.stream().filter(l->l.getLoan()==false).
		sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).
		forEach(r->System.out.println(r));
		System.out.println("-------------------------");
		
		hous.stream().filter(l->l.getOwningType()==OwningType.LEASE).
		sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).
		forEach(r->System.out.println(r));
		System.out.println("-------------------------");
		
		hous.stream().filter(l->l.getType()==Type.APPARTMENT).
		sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).
		forEach(r->System.out.println(r));
		System.out.println("-------------------------");
		
		hous.stream().filter(l->l.getType()==Type.VILLA).
		sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).
		forEach(r->System.out.println(r));
		System.out.println("-------------------------");
		
		
		}

}
