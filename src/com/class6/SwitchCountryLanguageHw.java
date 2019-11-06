package com.class6;

import java.util.Scanner;

public class SwitchCountryLanguageHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter their country and capture it.
//		Once values are captured print which language user speaks.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		String lang;

		switch (country) {
		case "Turkey":
			lang = "Turkish";
			break;
		case "US":
			lang = "English";
			break;
		case "France":
			lang = "French";
			break;
		case "Mexico":
			lang = "Spanish";
			break;
		default:
			lang = "Invalid";
		}
		System.out.println("Your country is " + country + " and your language is " + lang);
	}

}
