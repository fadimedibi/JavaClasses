package com.class18;

public class Hello {

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello();
		obj.sayHelloName("Asel");
		obj.sayHelloName("Weqas");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		// obj.sayHelloDifferentLanguage(123); you will get compile time error
		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);	
		obj.isSnowing();
	}

	/*
	 * Create a method that will say hello in different language based on the value
	 * that will passed when user calls a method
	 * 
	 */
	// one way
	void sayHello() {
		System.out.println("Hello Fadime");
	}

	// second way (reusable)
	void sayHelloName(String name) {
		System.out.println("Hello " + name);
	}

	void sayHelloDifferentLanguage(String country) {
				
		switch (country) {
		case "USA":
			System.out.println("Hello");
			break;

		case "Russia":
			System.out.println("Privet");
			break;

		case "Paraguay":
			System.out.println("Hola");
			break;
		default:
			System.out.println("I do not know to say hello in this language");

		}
	
	}
		// method to say name and age
	void sayNameAndAge(String name, int age) {
			System.out.println("My name is "+name+ " and I am "+ age+"years old");
		}
	
	// create a method that will check if it is snowing
	// if it snows ----->stay at home, otherwise go for a walk
	
	void isSnowing() {
		boolean isSnowing=false;
		if(isSnowing) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
