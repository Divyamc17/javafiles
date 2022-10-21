package com.xworkz.data;

import com.xworkz.dto.ProjectorDTO;
import com.xworkz.service.ProjectorService;
import com.xworkz.service.ProjectorServiceImpl;
 

public class ProjectorInvite {

	public static void main(String[] args) {
		ProjectorDTO projectordto=new ProjectorDTO("Projector","Samsung","White",50.00,25.00);
        System.out.println(projectordto);
        
        ProjectorService service= new ProjectorServiceImpl();
        service.validateAndSave(projectordto);
        
	} 

}
