package com.class8;

public class TaskForLoop {

	public static void main(String[] args) {
		//print numbers from 1 to 100 in 1 line with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+ " ");
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	//Print numbers from 100 to 1
		for(int i=100; i>=1; i--) {
		System.out.println(i);
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	//print even numbers from 20 to 1 (2ways)
	for(int i=20; i>=1; i--) {
		if(i%2==0) {
		System.out.println(i);
		}
	}
	//print odd numbers from 20 to 50 (2ways)
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	for(int i=20; i<=50; i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	//what is the output;
	int sum=0;
		for(int i=1; i<=5; i++)	{
			sum=sum+i;
			System.out.print(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);
		
		//what is the output
		int sumAll=0;
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		int total=2;
		for(int y=1; y<=3; y++) {
			total=total*y;
		}
		System.out.println(total);
		
	}
}
