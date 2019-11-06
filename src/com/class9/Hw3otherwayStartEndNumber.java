package com.class9;

import java.util.Scanner;

public class Hw3otherwayStartEndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
			System.out.println("Enter start number");
			int firstNumber = scan.nextInt();
			System.out.println("Enter ending number");
			int secondNumber = scan.nextInt();
			
			int start = 0;
			int end = 0;
			
			if (firstNumber < secondNumber) {
				start = firstNumber;
				end = secondNumber;
			} else {
				start = secondNumber;
				end = firstNumber;
			}
			int even = 0;
			int odd = 0;
				for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even = even + i;
				} else {
					odd = odd + i;
				}
			}
			System.out.println("The sum of even numbers is " + even);
			System.out.println("The sum of odd numbers is " + odd);
		}
	}

