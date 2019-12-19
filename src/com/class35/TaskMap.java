package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskMap {

	public static void main(String[] args) {
		// Create a map of countries and capitals
		Map<String, String> countryMap = new TreeMap<>();

		countryMap.put("Germany", "Berlin");
		countryMap.put("USA", "DC");
		countryMap.put("Turkey", "Ankara");
		countryMap.put("Japan", "Tokyo");

		System.out.println(countryMap);

		System.out.println("----Print All keys and Values");
		Set<String> keys = countryMap.keySet();
		System.out.println(" -----------For each--------------");
		for (String key : keys) {
			System.out.println(key + ":" + countryMap.get(key));
		}
		System.out.println("----------Iterator------");
		Iterator<String> keysit = keys.iterator();

		while (keysit.hasNext()) {
			String k = keysit.next();
			String v = countryMap.get(k);
			System.out.println(k + ":" + v);

		}
		System.out.println("----Print All Values");
		Collection<String> val = countryMap.values();
		System.out.println("---------- For each------- ");
		for (String v : val) {
			System.out.println(v);
		}
		System.out.println("----------Iterator------");
		Iterator<String> vIt = val.iterator();

		while (vIt.hasNext()) {
			System.out.println(vIt.next());
		}

	}

}
