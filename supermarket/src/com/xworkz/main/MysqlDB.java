package com.xworkz.main;

public enum MysqlDB {

	URL("jdbc:mysql://Localhost:3306/xworkz"),USERNAME("root"),SCREATE("root"),
    DRIVER("com.mysql.cj.jdbc.Driver");
 private String value;
 
 private MysqlDB(String value) {
	this.value=value;
}
 public String getValue() {
	return value;
}
}
