package com.xworkz.main;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.SuperMarketDTO;
import com.xworkz.service.SuperMarketService;
import com.xworkz.service.SuperMarketServiceImpl;

public class SuperMarketInvite {

	public static void main(String[] args) {
		
		/*SuperMarketDTO marketDTO=new SuperMarketDTO(1,"Costco","Castco Wholesale Corporation",1457895,560002,"Wholesale");
		SuperMarketDTO marketDTO1=new SuperMarketDTO(2,"Kroger","Kroger Corporate Office",245788,560103,"Wholesale");
		SuperMarketDTO marketDTO2=new SuperMarketDTO(3,"E Mart","Mart Corporation",2154879,570002,"Grocery");
		SuperMarketDTO marketDTO3=new SuperMarketDTO(4,"Fresh Mart","mart Wholesale Corporation",548729,561002,"Wholesale");
		SuperMarketDTO marketDTO4=new SuperMarketDTO(5,"D mart","Dmart Wholesale Corporation",254872,560102,"Wholesale");
		
		List<SuperMarketDTO> collection = new ArrayList();
		collection.add(marketDTO);
		collection.add(marketDTO1);
		collection.add(marketDTO2);
		collection.add(marketDTO3);
		collection.add(marketDTO4);
		
		SuperMarketService service = new SuperMarketServiceImpl();
		service.validateAndSave(marketDTO);
		service.validateAndSave(marketDTO1);
		service.validateAndSave(marketDTO2);
		service.validateAndSave(marketDTO3);
		service.validateAndSave(marketDTO4);
		
		
		service.displayByName("D mart");*/
		SuperMarketService serv=new SuperMarketServiceImpl();
		//serv.findByName("D mart");
		//serv.findById(3);
		List list=serv.findAll();
		System.out.println(list);
		serv.findByType("Grocery");
		serv.findByPincode("Grocery", 570002);
		

	}

	}


