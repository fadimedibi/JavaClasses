package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		// add
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		int size = numbers.size();
		System.out.println(size);
		// add more
		numbers.add(10000);
		numbers.add(100000);

//remove 
		numbers.remove(2);
		System.out.println(numbers);

		numbers.remove(size - 1);
		System.out.println(numbers);

		System.out.println(numbers.size());
		numbers.remove(size - 2);
		System.out.println(numbers);

//retrieve value from an arrayList
		int element = numbers.get(1);
		System.out.println(element);

		System.out.println(numbers.size());
		System.out.println("------------------------------");
		// 1st way for loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("------------------------------");
// 2nd way advanced loop

		for (int num : numbers) {
			System.out.println(num);
		}
		// I want to get values backward
		System.out.println("------------------------------");
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}
		System.out.println("------------------------------");
		// 3rd way using iterator

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			int number = iterator.next(); // autounboxing
			if (number % 2 == 0) {
				System.out.println(number);
			}

			// System.out.println(iterator.next());
		}

	}

}
