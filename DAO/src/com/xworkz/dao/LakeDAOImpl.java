package com.xworkz.dao;

import java.util.Arrays;

public class LakeDAOImpl implements LakeDAO {

	private String[] lakeNames = new String[10];
	private int index = 0;

	@Override
	public boolean save(String lakeName) {
		System.out.println("passing lake name");
		this.lakeNames[index] = lakeName;
		index++;
		return true;
	}

	@Override

	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}

	}

	@Override
	public boolean updateByIndex(String newlake, int index) {
		this.lakeNames[index] = newlake;

		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		this.lakeNames[index]= null;
		return false;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if(this.lakeNames[index]==name) {
				this.lakeNames[index]=newName;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		for (int i = 0; i < lakeNames.length; i++) {
			if(this.lakeNames[index]== name) {
				this.lakeNames[index]=null;
			}
		}
		return false;
	}

}
