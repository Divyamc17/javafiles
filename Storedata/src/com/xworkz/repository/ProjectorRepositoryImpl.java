package com.xworkz.repository;

import com.xworkz.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Projector created");
		return false;
	}

}
