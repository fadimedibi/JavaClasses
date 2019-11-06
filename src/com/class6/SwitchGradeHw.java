package com.class6;

import java.util.Scanner;

public class SwitchGradeHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Allow user to enter grade and then provide explanation:
//		A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
//		At the end your program should print which grade was entered by a user with explanation.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
		String level;

		switch (grade) {
		case 'A':
			level = "Excellent";
			break;
		case 'B':
			level = "Good";
			break;
		case 'C':
			level = "Average";
			break;
		case 'D':
			level = "Bad";
			break;
		default:
			level = "Not Acceptable";
		}

		System.out.println("Your grade is " + grade + " and your level is " + level);
	}

}
