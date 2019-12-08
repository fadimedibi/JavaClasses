package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		BMW bmw = new BMW("765945yhfergj", "Sedan", "BMW", "X5");
		// comes from Vehicle class
		bmw.drive();
		bmw.start();
		bmw.stop();
		// comes from Car class
		bmw.breaking();
		// comes from BMW class
		bmw.display();
		bmw.displayTotal();  // OR BMW.displayTotal();
		

		Vehicle vehicle = new BMW("765945yhfergj", "Sedan", "BMW", "A7");
		// comes from Vehicle class
		vehicle.drive();
		vehicle.start();
		vehicle.stop();
		// comes from Car class-- won't be available to the parent
		// vehicle.breaking();
		// comes from BMW class-- won't be available to the grandparent
		// vehicle.display();
		vehicle.displayTotal();
		
		Car car = new BMW("765945yhfergj", "Sedan", "BMW", "X3");
		// comes from Vehicle class
		car.drive();
		car.start();
		car.stop();
		// comes from Car class
		car.breaking();
		// comes from BMW class --- won't be available to the parent
		// car.display();
		
		new BMW("765945yhfergj", "Sedan", "BMW", "A5");
		new BMW("765945yhfergj", "Sedan", "BMW", "A2");
		new BMW("765945yhfergj", "Sedan", "BMW", "A4");
		System.out.println("----------");
			
		car.displayTotal();
	}

}
