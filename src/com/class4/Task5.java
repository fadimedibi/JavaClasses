package com.class4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	boolean card=true;
	
	
	System.out.println("Do you have a credit card?");
	
	boolean card1=scan.nextBoolean();
	
	
	if (card1) {
		System.out.println("What is the balance on your card?");
		int balance=scan.nextInt();
		if (balance>1000) {
			System.out.println("please pay off immediately");
		}else {
			System.out.println("you can spend more");
		}		
	}else {
		System.out.println("Would you like to get one?");
	}
	
}
	
}
