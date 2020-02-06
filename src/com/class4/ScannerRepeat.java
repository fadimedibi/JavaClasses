package com.class4;

import java.util.Scanner;

public class ScannerRepeat {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = scan.nextInt();
		System.out.println("Entered number " + number);
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good Afternoon "+name);
		System.out.println("please enter your age");
		int age=input.nextInt();
		System.out.println("your age is" +age);
		System.out.println("Please enter your number of the kids");
		byte kids=input.nextByte();
		System.out.println("You have " +kids+ " kid(s)");
		

	      System.out.println("Please enter first number");
	      int first=scan.nextInt();
	      
	      System.out.println("Please enter second number");
	      int sec=scan.nextInt();
	      
	      if (first*sec>0){
	        System.out.println("True");
	        
	      } else {
	        System.out.println("False");
	        
	        
	        Scanner scan1=new Scanner(System.in);
	        System.out.println("in");
	        
	       int in=scan1.nextInt();
	       if (in==1){
	         System.out.println("January");
	       }else if (in==2){
	         System.out.println("February");
	       }else if (in==3){
	         System.out.println("March");
	       }else if (in==4){
	         System.out.println("April");
	       }else if (in==5){
	         System.out.println("May");
	       }else if(in==6){
	         System.out.println("June");
	       }else if(in==7){
	         System.out.println("July");
	       }else if(in==8){
	         System.out.println("August");
	       }else if(in==9){
	         System.out.println("September");
	       }else if(in==10){
	         System.out.println("October");
	       }else if(in==11){
	         System.out.println("November");
	       }else if(in==12){
	         System.out.println("December");
	         
	       }else{
	         System.out.println("Invalid");
	       }
	       }
	          
	       }   
}


