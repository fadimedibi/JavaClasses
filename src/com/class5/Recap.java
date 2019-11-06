package com.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		
		System.out.println("Pleae enter string value");
		String val=anyVariableName.nextLine(); //takes the entire line
		
		Scanner anyVariableName=new Scanner(System.in);
		System.out.println("Please eneter boolean value");
		boolean val1=anyVariableName.nextBoolean();
		
		System.out.println("Pleae enter string value");
		String val2=anyVariableName.next();//take first word until space
		
		System.out.println("Please neter integer value");
		int val3=anyVariableName.nextInt();
		
		System.out.println("Please neter double value");
		double val4=anyVariableName.nextDouble();

		System.out.println("Please enter char value");
		char val5=anyVariableName.nextChar()At(0);
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}
	
	

}
