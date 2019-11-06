package com.class13;

public class Task2 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String str = "Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		System.out.println("***********************");
//Create a String and if the String is not empty perform the following: 
//if the String has an odd number of characters and has 3 or more characters, 
//print the character in the middle of the String.
		
		String str1 = "Merhaba";
		if (!str1.isEmpty()) {
			if (str1.length() % 2 == 1 && str1.length() >= 3) {

				System.out.println(str1.charAt((str1.length()) / 2));
			}
		}
	}

}
