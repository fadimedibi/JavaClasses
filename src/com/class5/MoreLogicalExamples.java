package com.class5;

import java.util.Scanner;

public class MoreLogicalExamples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
double sale;
double comm;

		System.out.println("Please enter daily sales:");
		sale = scan.nextDouble();
	
		if (sale < 100) {
			// lets give user 10% commission
			comm = sale * (0.1);
		} else if (sale > 100 && sale < 200) {
			// lets give user 20% commission
			comm = sale * (0.2);
		} else if (sale >= 200 && sale < 500) {
			// lets give user 30% commission
			comm = sale * (0.3);
		} else if (sale >= 500) {
			// lets give user 50% commission
			comm = sale * (0.5);
		} else {
			comm = 0;
		}
		
System.out.println("Based on your sales your commission is " + comm);
	}

}
