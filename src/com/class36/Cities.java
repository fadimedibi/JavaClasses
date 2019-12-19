package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Create a Map from array of cities that will sort keys in alphabetical order.
// As a key store the name of the city and as a value store the length of the city 
//(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//If any city name is more than 7 characters remove that city ( use Iterator ). 

//Create a Map that will store Employee name and salary.
//Write a logic to retrieve an employee who gets the highest salary.
//Output should be in the below format
//John Smith=$100000

public class Cities {
	public static void main(String[] args) {

		String[] cities = { "Paris", "Kuala Lumpur", "Memphis", "London", "Little Rock" };
		Map<String, Integer> CityMap = new TreeMap<>();

		for (String city : cities) {
			CityMap.put(city, city.length());

		}

		System.out.println(CityMap);

		Iterator<Entry<String, Integer>> cityIt = CityMap.entrySet().iterator();

		while (cityIt.hasNext()) {

			String key = cityIt.next().getKey();
			if (key.length() > 7) {
				cityIt.remove();
			}

		}
		System.out.println(CityMap);
	}
}
