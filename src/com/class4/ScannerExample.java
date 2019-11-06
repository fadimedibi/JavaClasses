package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(); will be numbers
		 * nextLine(); String	
		 *nextDouble():---->double
		 */
		
		int number=scan.nextInt();
		 System.out.println("Entered number is " + number);
		 
		 
		 System.out.println("***********");
		 
		 Scanner input=new Scanner(System.in);
		 System.out.println("Please enter your name");
		 String name=input.nextLine();
		 System.out.println("Good afternoon "+ name);
		 
		 
		 
		 
		 
	}
}
