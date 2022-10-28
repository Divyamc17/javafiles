package com.xworkz.repository;

import java.util.List;

import com.xworkz.dto.SuperMarketDTO;

public interface SuperMarketRepository {
	
boolean save(SuperMarketDTO dto);
	
	void displayByName(String name);
	
	void validateAndSave(List<SuperMarketDTO> dto);

}
