package com.class23;

public class ConstructorDemo {
	

//		Car car1=new Car();
//		Car---class name
//		car1 ---- object reference variable
//		= ----- assigning operator
//		new ---- keyword used to create an object
//		Car() ----- constructor
//		; ---- end of statement
//		Constructor: special method / block of code that is being executed when we create an object of the class

		// How constructor is executed
//		Every time when we create an object we call a constructor  and entire block of code inside the constructor will be executed first.
//		If we don't create an constructor  compiler will create 1 default constructor
// 		why do we need a constructor?
//		constructor initialize Object
	
	// ConstructorDemo(){

		// }
		ConstructorDemo() {
			System.out.println("I am your constructor");
		}
		
		ConstructorDemo(String str){
			System.out.println("I am constructor with 1 parameter "+str);
		}
		
		ConstructorDemo(int num) {
			System.out.println("I am constructor with 1 parameter "+num);
		}
		ConstructorDemo(int num, int num1) {
			System.out.println("I am constructor with 2 parameter "+num);
		}
		

		public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an object");
		obj.hello();
		obj.hello("Hello");

		ConstructorDemo obj2 = new ConstructorDemo(123,345);
		
		
	}

	public void hello() {
		System.out.println("Hello class");
		System.out.println("Hello instructors");
	}

	public void hello(String str) {
		System.out.println("Hello class:))");
		System.out.println("Hello instructors");
	}
	
	
}
