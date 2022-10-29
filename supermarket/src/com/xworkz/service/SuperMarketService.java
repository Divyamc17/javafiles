package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.SuperMarketDTO;

public interface SuperMarketService {

boolean validateAndSave(SuperMarketDTO dto);
	
	void displayByName(String name);
	
	void validateAndSave(List<SuperMarketDTO> list);
	
	default SuperMarketDTO findByName(String name) {
		return null;
	}
	default SuperMarketDTO findById(int id) {
		return null;
	}	
	default List<SuperMarketDTO> findAll() {
		return null;
	}
	default List<SuperMarketDTO> findByType(String type){
		return null;
	}
	default List<SuperMarketDTO> findByPincode(String type,int pincode){
		return null;
	}

}

