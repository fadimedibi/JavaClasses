package com.class11;

public class HomeworkCars {

	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian.
		// Then retrieve all values from that array

		String[] cars = { "American", "German", "Korean", "Italian" };
		// 1st way
		for (String i : cars) {
			System.out.println(i);
		}
		System.out.println("*****************");
		// 2nd way
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}

	}

}
