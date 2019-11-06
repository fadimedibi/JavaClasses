package com.class4;

import java.util.Scanner;

public class ScannerPr {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter number 1");
		int number1 = keyboard.nextInt();
		System.out.println("Please enter number 2");
		int number2 = keyboard.nextInt();

		if (number1 > number2) {
			System.out.println(number1 + " is bigger than " + number2);
		} else if (number1 == number2) {
			System.out.println(number1 + " is equal to " + number2);
		} else {
			System.out.println(number1 + " is smaller than " + number2);
		}
	}

}
