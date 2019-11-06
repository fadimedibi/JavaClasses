package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a day:");
		int day = scan.nextInt();
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It's a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It's a weekend");

		} else {
			System.out.println("Invalid day");
		}
	}
}
