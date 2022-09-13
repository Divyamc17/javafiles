package com.xworkz.main;

import com.xworkz.dao.MovieDAO;
import com.xworkz.dao.MovieDAOImpl;
import com.xworkz.dto.MovieDTO;

public class MovieInvite {

	public static void main(String[] args) {
	  
		MovieDTO movie=new MovieDTO();
        movie.setName("Karthikeya 2");
        movie.setLanguage("Telugu");
        movie.setDirector("Chandoo Mondeti");
        movie.setProducer("Abhishek Agarwal");
        
        MovieDAO movi=new MovieDAOImpl();
        movi.create(movie);
	}

}
