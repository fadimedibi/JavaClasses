package com.class5;

import java.util.Scanner;

public class heightExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height:");
		int height=scan.nextInt();
		
		if(height<5) {
			System.out.println("Sorry!!You are short! ");
			
		}else if(height>=5 && height<6){
		System.out.println("You are medium!");
		}else if(height>=6) {
			System.out.println("You are tall!");
		}
	
			
		}
}
		
		
		
		
	
