package com.class6;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HomeWork: Using scanner class create calculator. 
//		Allow user to enter 2 numbers and operator(+,-,*,/). 
//		Based on operator provide the result to user.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int first=scan.nextInt();
		System.out.println("Please enter second number");
		int sec=scan.nextInt();
		System.out.println("Please enter the operator (+,-,*,/)");
		char op=scan.next().charAt(0);
		int result;
		
		switch(op) {
		case '+':
			result=first+sec;
			break;
		case '-':
			result=first-sec;
			break;
		case '*':
			result=first*sec;
			break;
		case'/':
			result=first/sec;
			break;
		default:
			result=000;
			
			}
		System.out.println(result);
	}

}
