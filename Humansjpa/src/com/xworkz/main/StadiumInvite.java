package com.xworkz.main;

import java.util.Optional;

import com.xworkz.entity.StadiumEntity;
import com.xworkz.num.Stadium;
import com.xworkz.repository.StadiumRepository;
import com.xworkz.repository.StadiumRepositoryImpl;
import com.xworkz.service.StadiumService;
import com.xworkz.service.StadiumServiceImpl;

public class StadiumInvite {

	public static void main(String[] args) {
     
		/*StadiumEntity ent = new StadiumEntity(1, "Kanteerava", 1988, 5000, 350,Stadium.INNERGROUND);

		StadiumRepository repository = new StadiumServiceImpl();

		StadiumService serv = new StadiumServiceImpl(repository);
		serv.validateAndSave(ent);

		System.out.println(ent);*/
		
		 StadiumService service1=new StadiumServiceImpl();
		 
		 Optional<StadiumEntity> stadium=service1.findById(10);
		 
		 if(stadium.isPresent()) {
			 StadiumEntity entity=stadium.get();
			 System.out.println(entity);
		 }else {
			 System.out.println("stadium id is null");
		 }

	}
}
