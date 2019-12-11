package com.class31_;

public class CarTest {

	public static void main(String[] args) {
		
		Car car=new Car(2000,"blue");
		System.out.println(car.calculateSalePrice());
		//car.display();
		
		
		Truck carTruck = new Truck(2000,"grey",1500);

//		carTruck.color = "Black";
//		carTruck.carPrice = 90000;
//		carTruck.weight = 1500;

		System.out.println(carTruck.calculateSalePrice());
		
		//carTruck.display();

		Sedan carSedan = new Sedan(2000,"pink",30);
//		carSedan.color = "Silver";
//		carSedan.carPrice = 56000;
//		carSedan.length = 25;

		System.out.println(carSedan.calculateSalePrice());
		//carSedan.display();
	

	}

}
