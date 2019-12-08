package com.class31_;
//4. Create a Class Car that would have the following fields: 

//carPrice and color and method calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. 
//The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following: 
//if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
//if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public class Car {
	double carPrice;
	static String color;

	public double calculateSalePrice() {
		return carPrice;
	}

	public void display() {
		System.out.println("Sale Price of " + Car.color + " vehicle is $" + carPrice);
	}
}
class Truck extends Car {
	int weight;

	public double calculateSalePrice() {
		if (weight > 2000) {
			carPrice = carPrice - (carPrice * 0.1);
		} else {
			carPrice = carPrice - (carPrice * 0.2);
		}
		return carPrice;
	}
}
class Sedan extends Car {
	int length;

	public double calculateSalePrice() {
		if (length > 20) {
			carPrice = carPrice - (carPrice * 0.05);
		} else {
			carPrice = carPrice - (carPrice * 0.1);
		}
		return carPrice;
	}

}
