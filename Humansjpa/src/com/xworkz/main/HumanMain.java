package com.xworkz.main;

import com.xworkz.entity.HumanEntity;
import com.xworkz.repository.HumanRepository;
import com.xworkz.repository.HumanRepositoryImpl;
import com.xworkz.service.HumanService;
import com.xworkz.service.HumanServiceImpl;

public class HumanMain {

	public static void main(String[] args) {

		HumanEntity entity=new HumanEntity(1, "Suresh", "Fair", "Male", 65.45, 5.6, "black", "black", 32, true, 38.23, true, "A124587Vb", 12457891, "TH12477");
		
		HumanRepository repository=new HumanRepositoryImpl();
		
		HumanService service=new HumanServiceImpl(repository);
		service.validateAndSave(entity);
	}

}
