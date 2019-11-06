package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		
//I want to say good morning 5 times;
		int num=1;
		while(num<=5) {
			System.out.println("Good morning");
			num++;
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("Good morning");
		}
		//say good evening 5 times
		for(int i=0; i<4; i++) {
			System.out.println("Good evening");
		}
		//print numbers 1-10
		for(int i=1; i<=10; i++ ) {
			System.out.println(i);
		}
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
	}

}
