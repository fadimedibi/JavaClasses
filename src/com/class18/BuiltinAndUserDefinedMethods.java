package com.class18;

import java.util.Scanner;

public class BuiltinAndUserDefinedMethods {

	public static void main(String[] args) {
		
		// replace() method is a built in method in String class
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		// nextLine() is a built in method in Scanner class
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		
		BuiltinAndUserDefinedMethods obj=new BuiltinAndUserDefinedMethods(); 
		obj.myMethod();
	}
void myMethod() {
	System.out.println("This is user defined method that I created");
}
}
