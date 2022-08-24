package com.xworkz.check;

public class Palindrome {

	public static void main(String[] args) {

		// How to check if a string is a palindrome?
		String cityName = "gadag";
		StringBuffer buffer = new StringBuffer(cityName);
		buffer.reverse();
		String data = buffer.toString();
		if (cityName.equals(data)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

	}

}
