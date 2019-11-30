package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Monkey extends Animal {
	// cannot override static methods with instance variable
	// public void whoAmI() {
//		
//	}	
	
	// anything related to static we CANNOT override it
	 // when both methods are static within Sub and Super class it is
    //method hiding
	
	public static void whoAmI() {
	System.out.println("I am a monkey");
}
}
