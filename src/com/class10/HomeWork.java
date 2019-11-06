package com.class10;

public class HomeWork {

	public static void main(String[] args) {
		// 1.Create an array of cars and store 6 elements into it.
		// Using 2 different loops
		// Print all values from the array.

		// 2.Create an array on integers and calculate
		// the sum of all elements in an array.

		// 3.Create an array of countries.
		// While retrieving all values from an array print capital for each country.

//1. task
		String[] cars = { "Honda", "Toyota", "Jeep", "Buick", "Lexus", "BMW" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] + " ");
		}
		System.out.println();

		for (String cr : cars) {
			System.out.println(cr);
		}

		System.out.println("-----------------");
//2.task	
		int[] num = { 3, 5, 7, 9, 11, 13 };
		int sumOfArray = 0;
		for (int i = 0; i < num.length; i++) {
			sumOfArray = sumOfArray + num[i];
		}
		System.out.println(sumOfArray);

		System.out.println("------------------");

//3. task	
		// 3.Create an array of countries.
		// While retrieving all values from an array
		// print capital for each country

		String[] co = { "Turkey", "Germany", "USA", "Mexico" };
		for (int i = 0; i < co.length; i++) {
			switch (co[i]) {
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "USA":
				System.out.println("DC");
				break;
			case "Mexico":
				System.out.println("Mexico City");
				break;
			}
		}
		System.out.println("----------------------");
		for (String element : co) {

			if (element.equals("Turkey")) {
				System.out.println("Ankara");
			} else if (element.equals("Germany")) {
				System.out.println("Berlin");
			} else if (element.equals("USA")) {
				System.out.println("DC");
			} else if (element.equals("Mexico")) {
				System.out.println("Mexico City");
			}
		}
		System.out.println("----------------------");
		String city = null;
		for (String element : co) {
			if (element.equals("Turkey")) {
				city = ("Ankara");
			} else if (element.equals("Germany")) {
				city = ("Berlin");
			} else if (element.equals("USA")) {
				city = ("DC");
			} else if (element.equals("Mexico")) {
				city = ("Mexico City");
			}

			System.out.println("the capital of " + element + " is " + city);
		}

	}

}
