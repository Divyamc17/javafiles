package com.xworkz.repository;

import java.util.List;

import com.xworkz.dto.SuperMarketDTO;

public interface SuperMarketRepository {
	
boolean save(SuperMarketDTO dto);
	
void displayByName(String name);
	
boolean validateAndSave(List<SuperMarketDTO> list);

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
