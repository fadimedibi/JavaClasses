package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework4 {

	public static void main(String[] args) {
		// TCreate an arrayList of even numbers from 1 to 50.
		// Using Iterator remove any number that is divisible by 5 from that
		// arrayList.ODO Auto-generated method stub

		
		//creating an object of arrayList and referring to the list
		List<Integer> numbers = new ArrayList<>();
		
		//storing only even numbers using loop
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}

		System.out.println(numbers);
// removing number that are divisible by 5 using iterator
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
