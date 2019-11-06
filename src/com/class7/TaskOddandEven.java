package com.class7;

public class TaskOddandEven {

	public static void main(String[] args) {
		// print odd numbers from 50 to 100
		int i=50;
		while (i<=100) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		// print only even numbers from 100 to 1
int z=100;
while(z>=1) {
	if(z%2==0) {
		System.out.println(z);
	}
	z--;	
}

	}

}
