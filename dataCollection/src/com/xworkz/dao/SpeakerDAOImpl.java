package com.xworkz.dao;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO {

	private SpeakerDTO[] speaker= new SpeakerDTO[14];
	private int index=0;
	
	
	@Override
	public boolean create(SpeakerDTO dto) {
		this.speaker[index]=dto;
		System.out.println("Speaker details"+dto+"into index"+this.index);
		this.index++;
		return true;
	}

}
