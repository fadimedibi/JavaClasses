package com.class2;

public class variables {

	public static void main(String[]args) {
		
		String name="Fadime";
		String lastName="Dibi";
		char grade='2';
		String city="Memphis";
		String state="TN";
		int phoneNumber=5558877;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);	 
				
		city="Collierville";
		state="AL";
		phoneNumber=55578454;
		grade='3';
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		System.out.println("My name is "+ name);
		System.out.println("I live in city of "+ city);
		System.out.println("My phone number is "+phoneNumber);
		
		String text="My name is ";
		String text2="I live in city of ";
		String text3="My phone number is ";
		
		System.out.println(text+name);
		System.out.println(text2+city);
		System.out.println(text3+phoneNumber);
		
		
	}
}
