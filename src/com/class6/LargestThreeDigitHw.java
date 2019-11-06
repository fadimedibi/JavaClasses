package com.class6;

import java.util.Scanner;

public class LargestThreeDigitHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

 System.out.println("Please enter number 1: ");
 int num1=scan.nextInt();
 System.out.println("Please enter number 2: ");
 int num2=scan.nextInt();
 System.out.println("Please enter number 3: ");
 int num3=scan.nextInt();
 int largestNumber;
 if (num1>num2 && num1>num3){
	 largestNumber=num1;
 		}else  if(num2>num1 && num2>num3){
 			largestNumber=num2;
 		}else  {
 			largestNumber=num3;
 			
 }
 		System.out.println("Largest number is "+largestNumber);
 }

 
 
	}
