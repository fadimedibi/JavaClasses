package com.class5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the numbers of years worked:");
				int years=scan.nextInt();
				
				if(years>=5) {
					System.out.println("You are eligible for bonus!");
					System.out.println("Please enter your salary");
					int salary=scan.nextInt();
					if(salary>=50000) {
						System.out.println("Your bonus=5000");
					}else {
						System.out.println("Your bonus=3000");
					}
					
				}else {
					System.out.println("Sorry! You are Not eligible for bonus!");
				}
	}

}
