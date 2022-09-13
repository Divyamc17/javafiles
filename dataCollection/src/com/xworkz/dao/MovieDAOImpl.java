package com.xworkz.dao;

import com.xworkz.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {

	private MovieDTO[] movie=new MovieDTO[14];
	private int index=0;
	
	@Override
	public boolean create(MovieDTO dto) {
		this.movie[index]=dto;
		System.out.println("Movie details"+dto+this.index);
		this.index++;
		return true;
	}

}
