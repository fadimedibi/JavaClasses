package com.class10;

public class ArraysDecrIncr {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		int a = 2;
		System.out.println(grades[1]);
		System.out.println(grades[a]);

		a += 2; // 2+2
		System.out.println(grades[a]);

		a--; // 4-2
		System.out.println(grades[a]);
		System.out.println("---------------------------------");
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);

		System.out.println("---------------------------------");

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;
		for (int j = 0; j < size; j++) {
			System.out.print(animals[j] + " ");
		}
		
		//create an array to store 5 double values, print all elements in 1 line
		System.out.println();
		System.out.println("===============================");
		double[] value = { 1.5, 3.7, 2.8, 4.9, 3.0 };
		for (int i = 0; i < value.length; i++)
			System.out.print(value[i]+ " ");

	}
}
