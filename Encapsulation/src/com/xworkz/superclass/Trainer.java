package com.xworkz.superclass;

public class Trainer {
    protected String name;
    protected String speacialization;
    protected int experience;
    
    protected Trainer() {
    	System.out.println("default constructor");
    }
    protected Trainer(String name,String speacialization,int experience) {
   	 this.name=name;
   	 this.speacialization=speacialization;
   	 this.experience=experience;
   	
   }
    protected boolean trainer()
    {
    	System.out.println("trainer is good in explaination");
    	return true;
    }
    
    protected boolean conducInterview() {
    System.out.println("conduct interview ?");
    	return true;
    	
    }
    protected boolean coding() {
    	System.out.println("Omkar expert at coding");
    	return true;
    }
}





