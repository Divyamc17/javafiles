package com.xworkz.service;

import com.xworkz.dto.GardenDTO;
import com.xworkz.repository.GardenRepository;
import com.xworkz.repository.GardenRepositoryImpl;

public class GardenSreviceImpl implements GardenService {

	
	public GardenSreviceImpl() {
		System.out.println("created"+getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(GardenDTO dto) {
		String name=dto.getName();
		double length=dto.getLength();
		double width=dto.getWidth();
		int noseats=dto.getNoSeats();
		int notrees=dto.getNoTrees();
		
		if(name!=null && name.length()>3 && name.length()<50) {
			System.out.println("name is valid");
			if(length>100.00 && length<1500.00) {
				System.out.println("length is valid");
				if(width>100.00 && width<1000.00) {
					System.out.println("width is  valid");
					if(noseats>1 && noseats<50) {
						System.out.println("noseats is valid");
						if(notrees>1 && notrees<80) {
							System.out.println("notrees is valid");
							System.out.println("All the properties are valid");
							
							GardenRepository garden= new GardenRepositoryImpl();
							garden.save(dto);
						}
						else {
							System.err.println("notrees is not valid");
						}
					}
					else {
						System.err.println("noseats is not valid");
					}
				}
				else {
					System.err.println("width is not valid");
				}
			}
			else {
				System.err.println("length is not valid");
			}
		}
		else {
			System.err.println("name is not valid");
		}
		return false;
	}

}
