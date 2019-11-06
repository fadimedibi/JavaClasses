package com.class8;

public class JavaBreak {

	public static void main(String[] args) {
	
	// break keyword breaks/exits the loop	
		for (int i=0; i<10; i++) {
		
		if(i==7) {
			break;
		}
		System.out.println(i);
	}
System.out.println("I am outside of the loop");

// continue : it will skip current iteration

for(int i=1; i<=5; i++) {
	if(i==2) {
		continue;
		}
		System.out.println(i);
		
	}
System.out.println("I am outside of the loop");
// I want to print numbers from 1 to 20 except 5,6,7

for (int a=1; a<=20; a++) {
	if(a==5 || a==6 || a==7) {
		continue;
	}
	System.out.println(a);
	}
System.out.println("-----------------");

	
	
	for (int b=1; b<=20; b++) {
		if(b==5 || b==6 || b==7) {
			break;
		}
		System.out.println(b);
		
}

}
	}











