package com.xworkz.dao;

import com.xworkz.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO {

	
	private AlcoholDTO[] alcohol=new AlcoholDTO[14];
    private int index=0;
	
	@Override
	public boolean create(AlcoholDTO dto) {
		this.alcohol[index]=dto;
		System.out.println("Properties of Alcohol"+dto+"into index"+this.index);
		this.index++;
		return true;
	}

}
