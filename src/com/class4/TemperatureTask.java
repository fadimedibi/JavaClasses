package com.class4;

import java.util.Scanner;

public class TemperatureTask {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String city=scan.nextLine();
		
		System.out.println("Please enter your city's temperature");		
		int temp=scan.nextInt();
		
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temperature of "+city+ " is " + convertedTemp+ " C");
				
		 
		  System.out.println("Please Enter First Name");
		  String firstName=scan.nextLine();
		  
		  System.out.println("Please Enter Surname");
		  String surName=scan.nextLine();
		  
		  System.out.print(firstName + " " + surName);
		  
		}
		
		
	}
	

