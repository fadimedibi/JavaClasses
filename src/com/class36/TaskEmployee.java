package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TaskEmployee {

	public static void main(String[] args) {
		// //Create a Map that will store Employee name and salary.
		// Write a logic to retrieve an employee who gets the highest salary.
		// Output should be in the below format
		// John Smith=$100000

		Map<String, Double> empMap = new LinkedHashMap<>();
		empMap.put("Tarkan", 250.001);
		empMap.put("Ben", 190.000);
		empMap.put("Sen", 100.000);
		empMap.put("O", 250.000);

		System.out.println(empMap);
		
		double max = 0;
		Collection<Double> empCol = empMap.values();

		for (Double e : empCol) {
			if (e > max) {
				max = e;
			}

		}

		Set<Entry<String, Double>> keyEnt = empMap.entrySet();
		for (Entry<String, Double> key : keyEnt) {
			if (key.getValue() == max) {
				System.out.println(key);
			}
		}

	}
	
}
