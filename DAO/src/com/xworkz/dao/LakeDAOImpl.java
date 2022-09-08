package com.xworkz.dao;

public class LakeDAOImpl implements LakeDAO {
	
	private String[] lakeNames=new String [10] ;

	
	@Override
	public boolean save(String lakeName) {
		System.out.println("passing lake name");
	     for (int i = 0; i < this.lakeNames.length; i++) {
			if(lakeNames[i]==null) {
				lakeNames[i]=lakeName;
				break;
			}
		}
		return true;
	}
	
	@Override
	public void printAllLakes() {
		System.out.println("");
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}
		
		
	}
	
}
