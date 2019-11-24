package com.class22;

public class StaticVsNonStatic {

	// template for students(School,name, grade)
	
	static String school="Syntax";
	
	String name;
	char grade;
	
	void getInfo() {			// instance (non static) method
		System.out.println("My name is "+name+ " and I am going to "+school+" and my grade is "+grade);
	}
	static void getInfo1() {		// static method
		System.out.println("I am attending classes at "+ school);
		//System.out.println("My name is "+name);
		//compiler vill give an error
		// you CANNOT access NON STATIC members within static methods
		
	}
	
	
	public static void main(String[] args) {
		//Accessing static members within the same class
		//just use name for a variable
		//or call method by its name only
		
		System.out.println(school);
		getInfo1();
		
		
		// to access a non static method we need to create an object
		 StaticVsNonStatic std1=new StaticVsNonStatic();
		 std1.getInfo();
	}
	
	
}
