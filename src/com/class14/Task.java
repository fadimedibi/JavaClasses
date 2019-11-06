package com.class14;

public class Task {

	public static void main(String[] args) {
// Create a String that will hold a sentence.
// Write a program to get a new String without any spaces.
		String str = "Learning Java is fun";
		String str2 = str.replace(" ", "");
		System.out.println(str2);
		
//Create a String that should be combination of letters, numbers and special characters.
//Find out how many alpha characters are there in the String.
		String s = "Hi %^#Ja6789vyu76@#$";
		String s1 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s1);
		System.out.println(s1.length());

//You have a 
//String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?

		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

		String[] array = a.split("\\?");
		System.out.println(array.length);
	}

}
