package com.xworkz.dao;

import com.xworkz.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO {
   
	
	private TabletDTO[] tablet=new TabletDTO[10];
	private int index=0;
	
	@Override
	public boolean create(TabletDTO dto) {
		this.tablet[index]=dto;
		System.out.println("tablet details"+dto+"into index"+this.index);
		this.index++;
		return true;
	}

}
