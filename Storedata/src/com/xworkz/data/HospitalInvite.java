package com.xworkz.data;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.service.HospitalService;
import com.xworkz.service.HospitalServiceImpl;

public class HospitalInvite {

	public static void main(String[] args) {
		
		HospitalDTO hospitalDTO=new HospitalDTO(1, "Jaya Dev", "Cardio ", "C N Manjunath", 1972);
        System.out.println(hospitalDTO);
        
        HospitalService hospitalsevs=new HospitalServiceImpl();
        hospitalsevs.validateAndSave(hospitalDTO);
	}

}
