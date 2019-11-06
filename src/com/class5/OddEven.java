package com.class5;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int n = scan.nextInt();

		if (n % 2 == 1) {
			System.out.println("Weird");

		} else if (n % 2 == 0 && n >= 2 && n <= 5) {
			System.out.println("Not Weird");
		} else if (n % 2 == 0 && n >= 6 && n <= 20) {
			System.out.println("Weird");
		} else if (n % 2 == 0 && n > 20) {
			System.out.println("Not Weird");
		}
	}
}
