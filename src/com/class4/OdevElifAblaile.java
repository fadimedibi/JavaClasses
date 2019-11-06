package com.class4;

import java.util.Scanner;

public class OdevElifAblaile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card?");
		boolean card = scan.nextBoolean();

		if (card = false) {
			System.out.println("Do you want to get one?");
		}else {
			System.out.println("What is the balance on your card?");
			int in = scan.nextInt();

			if (in <= 1000) {
				System.out.println("Please pay off immediatelly!!");

			} else {
				System.out.println("You can spend more");

			}
		}
	}
}
