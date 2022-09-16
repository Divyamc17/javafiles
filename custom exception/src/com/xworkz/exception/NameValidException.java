package com.xworkz.exception;

public class NameValidException extends Exception {

	public NameValidException(String msg) {
		super(msg);
		System.out.println("checking the exception");
		
	}
	
}
