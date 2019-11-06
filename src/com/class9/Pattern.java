package com.class9;

public class Pattern {

	public static void main(String[] args) {
		//
		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");

		for (int i = 1; i <= 4; i++) { // rows
			for (int j = 1; j <= 5; j++) {// column
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= 7; j++) {// columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		12345678910
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------------------");

//		11111
//		22222
//		33333
//		44444
//		55555

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println("------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
