package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//let's ask user to enter if its raining or not(true or false)
		// as long as there is raining lets keep asking 
		// as long as there is no rain you can go to the park
		
		boolean isRain;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.hasNextBoolean();
		}while(isRain);
		System.out.println("Go to the park");
		
		
		
		/* lest's ask user to enter if it is raining or not (true or false)
		 * as long as there is rain let's keep asking
		 * as soon as there is no rain --> you can go to the park
		 */
//		boolean isRain;
//		Scanner scan=new Scanner(System.in);
//​			do {
//			System.out.println("Is it raining?");
//			isRain=scan.nextBoolean();
//			
//		}while(isRain);
//		System.out.println("Go to the park");
	}
	}

