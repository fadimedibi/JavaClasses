package com.class5;

import java.util.Scanner;

public class HomeWorkScore {

	public static void main(String[] args) {
		
//			if the average score >=90 -----> grade=A
//			if the average score >= 70 and <90 ----->grade=B
//			if the average score>=50 and <70 ------> grade=C
//			if the average score<50  grade=F

				
		Scanner scan= new Scanner(System.in);

		System.out.println("Please enter your Quiz Score: ");
		int quiz = scan.nextInt();
		System.out.println("Please enter your Mid Term Score: ");
		int midTerm = scan.nextInt();
		System.out.println("Please enter your Final Score: ");
		int finalScore = scan.nextInt();
		double average = (quiz + midTerm + finalScore) / 3;
		System.out.println("Your average is: "+average );

		if (average >= 90) {
			System.out.println("Your grade is 'A' ");
		} else if (average >= 70 && average < 90) {
			System.out.println("Your grade is 'B'");
		} else if (average >= 50 && average < 70) {
			System.out.println("Your grade is 'C'");
		} else if (average < 50) {
			System.out.println("Your grade is 'F'");
		}else {
			System.out.println("Unknown");
		}

	}

}
