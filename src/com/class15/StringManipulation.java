package com.class15;

public class StringManipulation {

	public static void main(String[] args) {
		// String class comes in Java.lang package
		// 2 ways to create a String
		// first way using String Literal;
		String str = "Hello";
		// second way using new keyword-Creating a String object
		String str1 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
// find the number of characters inside the string
		int length=str.length();
		System.out.println(length);
// case conversion methods/functions		
		System.out.println(str.toLowerCase());//hello
		System.out.println(str);
		System.out.println(str.toLowerCase().toUpperCase());//HELLO
// verify if the string is empty	
		String myString="";//empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null; // no value at all it is equal to 
		//String myString1;
		//System.out.println(myString1.isEmpty());
// verify existence of characters in the string
		String a="Good evening students";
		System.out.println(a.contains("Student"));
		//or
		boolean exist=a.contains("Student");
		System.out.println(exist);
		
// 		
		String a1="Good evening students";
		System.out.println(a1.startsWith("Good"));
		System.out.println(a1.endsWith("student"));
	}

}
