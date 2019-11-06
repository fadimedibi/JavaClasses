package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender:F or M");
		char gender = scan.next().charAt(0);
		String userGender;
		// switch only works with byte,short, int, char,String
		switch (gender) {
		case 'F':
			userGender = "Female";
			break;
		case 'M':
			userGender = "Male";
			break;
		default:
			userGender = "Unknown";
		}

		System.out.println("Your gender is " + userGender);

	}

}
