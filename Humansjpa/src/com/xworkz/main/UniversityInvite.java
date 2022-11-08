package com.xworkz.main;

import java.util.Optional;

import com.xworkz.entity.UniversityEntity;
import com.xworkz.repository.UniversityRepository;
import com.xworkz.repository.UniversityRepositoryImpl;
import com.xworkz.service.UniversityService;
import com.xworkz.service.UniversityServiceImpl;

public class UniversityInvite {

	public static void main(String[] args) {

		UniversityEntity university = new UniversityEntity(1, "Kuvempu", 1987, "govt", "Shankarghatta");

//		UniversityRepository repository = new UniversityRepositoryImpl();

		UniversityService service = new UniversityServiceImpl();
//		service.validateAndSave(university);

//		Optional<UniversityEntity> findById = service.findById(1);
//		if (findById.isPresent()) {
//			UniversityEntity universityEntity = findById.get();
//			System.out.println(universityEntity);
//		}

		service.updateByName(1, "vtu university");
	}
}
