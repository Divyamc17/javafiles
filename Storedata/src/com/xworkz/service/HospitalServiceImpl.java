package com.xworkz.service;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.repository.HospitalRepository;
import com.xworkz.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	public HospitalServiceImpl() {
		System.out.println("craeted"+getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		System.out.println("running valid and save");
		int id=dto.getId();
		String name=dto.getName();
		String specialist=dto.getSpecialist();
		String founder=dto.getFounder();
		int since=dto.getSince();
		
		if(id>0 && id<50000) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<50) {
				System.out.println("name is valid");
				if(specialist!=null && specialist.length()>3 && specialist.length()<50){
					System.out.println("specialist is valid");
					if(founder!=null && founder.length()>3 && founder.length()<50) {
						System.out.println("founder is valid");
						if(since>1800 && since<2023) {
							System.out.println("since is  valid");
							System.out.println("All are valid properties");
							
							HospitalRepository hospital =new HospitalRepositoryImpl();
							hospital.save(dto);
						}
						else {
							System.err.println("since is not valid");
						}
							
					}
					else {
						System.err.println("founder is not valid");
					}
				}
				else {
					System.err.println("specialist is not valid");
				}
			}
			else {
				System.err.println("name is invalid");
			}
		}
		else {
			System.err.println("id is not valid");
		}
			return false;
}
	
}