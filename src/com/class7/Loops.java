package com.class7;

public class Loops {

	public static void main(String[] args) {
	
//loops : to repeat same block of code
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
		//instead of writing 5 times, we can do loops
//	loops:
//	1. while
//	2. do while
//	3. for
//	4.advanced for loop/enhanced loop/ for each loop
//		
		
		int time=8;
		if(time<12) {//condition is true
			System.out.println("Good Morning");//code executes 1 time
		}
		
	
		while(time<12) {//condition is true
			System.out.println("Good Morning");//code executes infinitely(infinite loop)
		time++;	
			}
		
		System.out.println("--------------------");
		int i=-1;
		while(i<=5) {
			System.out.println("Good morning");
			i++;
		}
		
		System.out.println("Outside of while loop");
		
	}

}
