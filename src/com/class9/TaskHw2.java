package com.class9;

import java.util.Scanner;

public class TaskHw2 {

	public static void main(String[] args) {
//		Write a guessing game where the user has to guess a secret number between 1 and 20. 
//		After every guess input, the program tells the user whether their number was too large or too small. 
//		The program will keep asking the user to enter the number until he finds the correct number. 
//		When the correct answer is found the system should display “Congratulations!!. You got it!”

		int guess;
		int secretNumber = 7;
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess the secret number (Hint: between 1-20 )");
		guess = scan.nextInt();
		while (guess != secretNumber) {
			if(guess<secretNumber) {
				System.out.println("Number is too small");
			}else {
				System.out.println("Number is too big");
			}
			System.out.println("Guess the secret number (Hint: between 1-20 )");
			guess = scan.nextInt();
		}
		System.out.println("Congratulations!! You got it!");
	}

}
