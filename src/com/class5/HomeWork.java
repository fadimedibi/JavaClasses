package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has acredit card or not. If you
		 * user does not have acredit card then offer them. If they do have oneask what
		 * is balance on the card? If balance ofthe card is larger than 1000, tell them
		 * to payoffimmediately, otherwise you can tell them that they can spend more
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc = input.nextBoolean();

		if (cc) {
			System.out.println("What is the balance on your card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please payoff your balance");
			} else {
				System.out.println("You can spend more");
			}

		} else {
			System.out.println("Would you like to apply for credit card?");
		}

	}

}
