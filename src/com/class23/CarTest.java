package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car.make="Toyota";
		Car car1=new Car();
		
		
		car1.model="Camry";
		car1.color="Pink";
		car1.speed=200;
		car1.doors=4;
		car1.getDetails();
		System.out.println("-----------------------");
		
		BetterCar.make="Toyota";
			
		
		BetterCar betterCar1=new BetterCar("Corolla","White",180,5);
		
		betterCar1.getDetails();
		
//		Car car2=new Car();
//		car2.model="Corolla";
//		car2.color="Blue";
//		car2.speed=150;
//		car2.doors=2;
//		car2.getDetails();
		
		
		
//		Car car1=new Car();
//		Car---class name
//		car1 ---- object reference variable
//		= ----- assigning operator
//		new ---- keyword used to create an object
//		Car() ----- constructor
//		; ---- end of statement
		
		
		
		
//		Constructor: special method / block of code that is being executed when we create an object of the class
		
		

	}

}
