package com.class3;

public class RelationalOperations {

	public static void main(String[]args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("*************");
		
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		System.out.println("##############");
		
		int a=90;
		int z=300;
		
		//if number a is bigger than number z
		//I want to print a is larger than z
		
		if (a>z) {
			
			System.out.println("a is larger than z");
			
		} else {
			System.out.println("a is smaller than b");
			
			
			int expectedHours=15;
			int actualHours=2;
			
			if(actualHours>expectedHours) {
				System.out.println("you will succed");
				
			}else {
					System.out.println("please study more");
				}
				
			double teaPrice=4.99;
			double allowedPrice=3.99;
			teaPrice-=2;//2.99=4.99-2
			
			//if price is more than that I will not buy
			//if price is less or matches what I can afford then I will buy tea
			
			if(allowedPrice>=teaPrice) {
				System.out.println("I will buy tea");
				System.out.println("and I will enjoy my tea");
					
						}else {
							System.out.println("I cannot afford,I need to study more");
							System.out.println("I will go back to study more");
						}
			
			
			System.out.println("I keep writing some code");
			System.out.println("I keep writing more code");
			
		}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	