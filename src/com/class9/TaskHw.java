package com.class9;

import java.util.Scanner;

public class TaskHw {

	public static void main(String[] args) {
// Write a program that reads a range of integers (start and end point), 
//		provided by a user 
//		and then from that range prints the sum of the even and odd integers.
		
Scanner scan=new Scanner(System.in);
System.out.println("Please enter starting point");
int start=scan.nextInt();
System.out.println("Please enter ending point");
int end=scan.nextInt();
int firstNumber=0;
int secondNumber=0;

if(firstNumber<secondNumber) {
	start=firstNumber;
}else {
	start=secondNumber;
	end=firstNumber;
}
int sumOdd=0;
int sumEven=0;
for(int i=start; i<=end; i++) {
	if(i%2==0) {
	sumEven=sumEven+i;
	}else {
		sumOdd=sumOdd+i;
	}
}
System.out.println("Sum of the even numbers: "+sumEven);
System.out.println("Sum of the even numbers: "+sumOdd);

	}

}
