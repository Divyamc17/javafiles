package com.xworkz.data;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.service.HospitalService;
import com.xworkz.service.HospitalServiceImpl;

public class HospitalInvite {

	public static void main(String[] args) {
		
		HospitalDTO hospitalDTO=new HospitalDTO(1, "Jaya Dev", "Cardio ", "C N Manjunath", 1972);
		HospitalDTO hospitalDTO1=new HospitalDTO(3,"Kidwai","oncology","RaviVarma",1948);
		HospitalDTO hospitalDTO2=new HospitalDTO(4,"Nimhans","Neuro","Mari Gowda",1974);
		HospitalDTO hospitalDTO3=new HospitalDTO(5,"St.John","General","Catholic Bishops",1963);
		HospitalDTO hospitalDTO4=new HospitalDTO(6,"Apollo","General","Prathap Reddy",1983);
		HospitalDTO hospitalDTO5=new HospitalDTO(7,"Bowring","General","Jhon Bowring",1943);
		HospitalDTO hospitalDTO6=new HospitalDTO(8,"columbia Asia","General","Dr.Chan Boon Kheng",1996);
		HospitalDTO hospitalDTO7=new HospitalDTO(9,"Indira Gandhi","Childern","State Govt",1960);
		HospitalDTO hospitalDTO8=new HospitalDTO(10,"Rajiv Gandhi","Cardio","State Govt",1996);
		HospitalDTO hospitalDTO9=new HospitalDTO(11,"Sanjay Gandhi","General","State Govt",1996);
		HospitalDTO hospitalDTO10=new HospitalDTO(12,"Narayana Hrudayalaya","Cardio","Devi Shetty",2001);
		HospitalDTO hospitalDTO11=new HospitalDTO(13,"Vanivilas","women","Rama Shetty",1957);
		HospitalDTO hospitalDTO12=new HospitalDTO(14,"Victoria","General","Shri KrishnaRaja Wodeyar",1900);
		HospitalDTO hospitalDTO13=new HospitalDTO(15,"Kasturba","General","Malathi",1980);
		HospitalDTO hospitalDTO14=new HospitalDTO(16,"A V hospital","General","Anuradha",2003);
		HospitalDTO hospitalDTO15=new HospitalDTO(17,"Forties","General","Fortis Escorts",1996);
		HospitalDTO hospitalDTO16=new HospitalDTO(18,"Aster","General","Azad Moopen",1987);
		HospitalDTO hospitalDTO17=new HospitalDTO(19,"Amala","Cancer","Kuriakose Elias Charvara",1978);

        System.out.println(hospitalDTO);
        System.out.println(hospitalDTO1);
        System.out.println(hospitalDTO2);
        System.out.println(hospitalDTO3);
        System.out.println(hospitalDTO4);
        System.out.println(hospitalDTO5);
        System.out.println(hospitalDTO6);
        System.out.println(hospitalDTO7);       
        System.out.println(hospitalDTO8);
        System.out.println(hospitalDTO9);
        System.out.println(hospitalDTO10);
        System.out.println(hospitalDTO11);
        System.out.println(hospitalDTO12);
        System.out.println(hospitalDTO13);
        System.out.println(hospitalDTO14);
        System.out.println(hospitalDTO15);
        System.out.println(hospitalDTO16);
        System.out.println(hospitalDTO17);
     
       
        
        HospitalService hospitalsevs=new HospitalServiceImpl();
        hospitalsevs.validateAndSave(hospitalDTO);
        hospitalsevs.validateAndSave(hospitalDTO1);
        hospitalsevs.validateAndSave(hospitalDTO2);
        hospitalsevs.validateAndSave(hospitalDTO3);
        hospitalsevs.validateAndSave(hospitalDTO4);
        hospitalsevs.validateAndSave(hospitalDTO5);
        hospitalsevs.validateAndSave(hospitalDTO6);
        hospitalsevs.validateAndSave(hospitalDTO7);
        hospitalsevs.validateAndSave(hospitalDTO8);
        hospitalsevs.validateAndSave(hospitalDTO9);
        hospitalsevs.validateAndSave(hospitalDTO10);
        hospitalsevs.validateAndSave(hospitalDTO11);
        hospitalsevs.validateAndSave(hospitalDTO12);
        hospitalsevs.validateAndSave(hospitalDTO13);
        hospitalsevs.validateAndSave(hospitalDTO14);
        hospitalsevs.validateAndSave(hospitalDTO15);
        hospitalsevs.validateAndSave(hospitalDTO16);
        hospitalsevs.validateAndSave(hospitalDTO17);
        
        
        
        
	}

}
