package com.xworkz.dao;

import com.xworkz.dto.AppartmentDTO;

public class AppartmentDAOImpl implements AppartmentDAO {

	private AppartmentDTO[] appartment=new AppartmentDTO[14];
	private int index=0;
	
	
	@Override
	public boolean create(AppartmentDTO dto) {
		this.appartment[index]=dto;
		System.out.println("Appartment deatails" +dto+"into index"+this.index);
		this.index++;
		return true;
	}
	}


