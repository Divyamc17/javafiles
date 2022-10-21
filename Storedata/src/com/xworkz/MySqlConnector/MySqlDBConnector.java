package com.xworkz.MySqlConnector;

public enum MySqlDBConnector {

	URL("jdbc:mysql://Localhost:3306/xworkz"),USERNAME("root"),SECREATE("root");
	
	private String value; 
	
	private MySqlDBConnector(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}

