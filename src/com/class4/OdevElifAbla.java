package com.class4;

import java.util.Scanner;

public class OdevElifAbla {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the numbers of worked years ");
		int year = scan.nextInt();

		System.out.println("Please enter your annual salary");
		int salary = scan.nextInt();

		if (year >= 5) {
			System.out.println("You are eligible for bonus");
			if (salary >= 50000) {
				System.out.println("Bonus is $5000");
			} else {
				System.out.println("Bonus is $3000");
			}
		} else {
			System.out.println("You are NOT eligible for bonus");

		}
	}

}
