package com.xworkz.main;

import com.xworkz.dto.GraphitDTO;

public class GraphiteInvite {

	public static void main(String[] args) {
	
		GraphitDTO graphit1=new GraphitDTO();
        graphit1.setForm("Allotrophy");
        System.out.println(graphit1.getForm());
        graphit1.setColour("Gray");
        System.out.println(graphit1.getColour());
        graphit1.setUse("PencilLead");
        System.out.println(graphit1.getUse());
        graphit1.setSense("soft");
        System.out.println(graphit1.getSense());
        graphit1.setSymbol("C");
        System.out.println(graphit1.getSymbol());
        graphit1.setMadeUpOf("carbon");
        System.out.println(graphit1.getMadeUpOf());
       int num1= graphit1.hashCode();
       System.out.println(num1);
        
        GraphitDTO graphit2=new GraphitDTO();
        graphit2.setForm("Allotrophy");
        System.out.println(graphit2.getForm());
        graphit2.setColour("Gray");
        System.out.println(graphit2.getColour());
        int num2= graphit2.hashCode();
        System.out.println(num2);
        graphit2.setUse("PencilLead");
        System.out.println(graphit2.getUse());
        graphit2.setSense("soft");
        System.out.println(graphit2.getSense());
        graphit2.setSymbol("C");
        System.out.println(graphit2.getSymbol());
        graphit2.setMadeUpOf("carbon");
        System.out.println(graphit2.getMadeUpOf());
   
        
        if(graphit1.hashCode()==graphit2.hashCode()) {
        	graphit1.equals(graphit2);
        }
        else {
        
        System.out.println("bith are not equal");
	}

}
}