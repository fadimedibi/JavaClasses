package com.class5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		

//		if (true) {
//			if block of code
//		}else {
//		else block of code
//		}
//		AND:
//		if(true AND true)----->true
//		if (true AND false)---->false		
//		if(false AND true)----->false
//		if(false AND false)----->false
//		
//		OR
//		if(true OR true)----->true
//		if (true OR false)---->true		
//		if(false OR true)----->true
//		if(false OR false)----->false
		
		
		/* if number between 1-10---->number is small
		 *if number between 10-100----->number is medium
		 *if number between 100-1000-----> number is larger
		 *any other number-------> is out of range */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number between 1-1000");
		int num=scan.nextInt();
		
		if (num>1 && num<10) {
			System.out.println("This number is small");
		}else if (num>=10 && num<100){
			System.out.println("This number is medium");
		}else if (num>=100 && num<1000) {
			System.out.println("This number is large");
		}else {
			System.out.println("This number is out of the range");
		}
			
		}
				
	}

