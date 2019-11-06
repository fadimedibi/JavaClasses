package com.class10;

public class ArraysLoopAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;
		for (int i = 0; i< size; i++) {
			if(animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
			System.out.println(animals[i] + " ");
			}
		}
	}
}
