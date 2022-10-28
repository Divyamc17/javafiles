package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class SuperMarketDTO {
	
	private int id;
	private String name;
	private String company;
	private int gstNo;
	private long pincode;
	private String type;
	

}
