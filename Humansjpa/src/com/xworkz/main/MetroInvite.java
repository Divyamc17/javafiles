package com.xworkz.main;

import com.xworkz.entity.MetroEntity;
import com.xworkz.repository.MetroRepository;
import com.xworkz.repository.MetroRepositoryImpl;
import com.xworkz.service.MetroService;
import com.xworkz.service.MetroServiceImpl;

public class MetroInvite {

	public static void main(String[] args) {

		
MetroEntity metro=new MetroEntity(1,"Purple","Namma Metro",2000,40,"BMRCL",2,6,52,80,"bmrc.co.in");
		
		MetroRepository repository=new MetroRepositoryImpl();
		
		MetroService service=new MetroServiceImpl(repository);
		service.validateAndSave(metro);
		System.out.println(metro);
		
	}

}
