package com.xworkz.mysql;

public enum   MysqlDBCredential {
	 
	URL("jdbc:mysql://Localhost:3306/xworkz"),USERNAME("root"),SCREATE("root"),
    DRIVER("com.mysql.cj.jdbc.Driver");
 private String value;
 
 private MysqlDBCredential(String value) {
	this.value=value;
}
 public String getValue() {
	return value;
}
   
}
