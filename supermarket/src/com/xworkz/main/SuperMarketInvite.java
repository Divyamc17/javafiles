package com.xworkz.main;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.SuperMarketDTO;
import com.xworkz.service.SuperMarketService;
import com.xworkz.service.SuperMarketServiceImpl;

public class SuperMarketInvite {

	public static void main(String[] args) {
		
		SuperMarketDTO marketDTO=new SuperMarketDTO(1,"Costco","Castco Wholesale Corporation",1457895,560002,"Wholesale");
		SuperMarketDTO marketDTO1=new SuperMarketDTO(2,"Kroger","Kroger Corporate Office",245788,560103,"Wholesale");
		SuperMarketDTO marketDTO2=new SuperMarketDTO(3,"E Mart","Mart Corporation",2154879,570002,"Grocery");
		SuperMarketDTO marketDTO3=new SuperMarketDTO(4,"Fresh Mart","mart Wholesale Corporation",548729,561002,"Wholesale");
		SuperMarketDTO marketDTO4=new SuperMarketDTO(5,"D mart","Dmart Wholesale Corporation",254872,560102,"Wholesale");
		
		System.out.println(marketDTO);
		System.out.println(marketDTO1);
		System.out.println(marketDTO2);
		System.out.println(marketDTO3);
		System.out.println(marketDTO4);
		
		
		SuperMarketService serv=new SuperMarketServiceImpl();
		/*serv.validateAndSave(marketDTO);
		serv.validateAndSave(marketDTO1);
		serv.validateAndSave(marketDTO2);
		serv.validateAndSave(marketDTO3);
		serv.validateAndSave(marketDTO4);*/
		
		serv.displayByName("Kroger");
		
		//serv.validateAndSave(null);
		
		List<SuperMarketDTO> dto=new ArrayList<SuperMarketDTO>();
		dto.add(0, marketDTO);
		dto.add(1, marketDTO1);
		dto.add(2, marketDTO2);
		dto.add(3, marketDTO3);
		dto.add(4, marketDTO4);
		
		System.out.println(dto);
		
		SuperMarketService servo=new SuperMarketServiceImpl();
		servo.validateAndSave(dto);
		

	}

	}


