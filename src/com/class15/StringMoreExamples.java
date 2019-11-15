package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
	// get character at a specific position
		String str="Syntax Technologies Inc";
		char letter=str.charAt(5);
		System.out.println(letter);

		System.out.println(str.charAt(str.length()-1));// last character of the String
		
	// get a substring from a string
		//Syntax
		String substring1=str.substring(0,6);
		System.out.println(substring1);
	//Technologies Inc
		String substring2=str.substring(7);
		System.out.println(substring2);
		
	}

}
