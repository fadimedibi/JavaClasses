package com.class31_;

public class CarTest {

	public static void main(String[] args) {
		Truck carTruck = new Truck();

		carTruck.color = "Black";
		carTruck.carPrice = 90000;
		carTruck.weight = 1500;

		carTruck.calculateSalePrice();
		carTruck.display();

		Sedan carSedan = new Sedan();
		carSedan.color = "Silver";
		carSedan.carPrice = 56000;
		carSedan.length = 25;

		carSedan.calculateSalePrice();
		carSedan.display();

	}

}
