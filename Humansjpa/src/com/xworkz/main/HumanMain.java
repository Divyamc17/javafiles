package com.xworkz.main;

import java.util.Optional;

import com.xworkz.entity.HumanEntity;
import com.xworkz.num.JavaUtil;
import com.xworkz.repository.HumanRepository;
import com.xworkz.repository.HumanRepositoryImpl;
import com.xworkz.service.HumanService;
import com.xworkz.service.HumanServiceImpl;

public class HumanMain {

	public static void main(String[] args) {

		/*
		 * HumanEntity entity=new HumanEntity(1, "Suresh", "Fair", "Male", 65.45, 5.6,
		 * "black", "black", 32, true, 38.23, true, "A124587Vb", 12457891, "TH12477");
		 * 
		 * HumanRepository repository=new HumanRepositoryImpl();
		 * 
		 * HumanService service=new HumanServiceImpl(repository);
		 * service.validateAndSave(entity);
		 */

		HumanService service1 = new HumanServiceImpl(new HumanRepositoryImpl());
		try {
			Optional<HumanEntity> optional = service1.findById(1);

			if (optional.isPresent()) {
				HumanEntity entity = optional.get();
				System.out.println(entity);
			} else {
				System.out.println("optional is null");
			}

			
			service1.updateByName(1, "Sushma");
			
		} finally {
			JavaUtil.getFactory().close();
		}

	}

}
