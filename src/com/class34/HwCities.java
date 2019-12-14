package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HwCities {

	public static void main(String[] args) {
		// Create a Set of cities in which
		// you want to make sure that insertion order is maintained.
		// Using Iterator remove any city that starts with “A”;

		Set<String> city = new LinkedHashSet<>();
		city.add("Kuala Lumpur");
		city.add("Seoul");
		city.add("Addis Ababa");
		city.add("Bangkok");
		city.add("Abu Dhabi");
		city.add("São Paulo");
		city.add("Astana");

		System.out.println(city);
		Iterator<String> it = city.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A")) {
				it.remove();

			}

		}
		System.out.println(city);
	}

}
