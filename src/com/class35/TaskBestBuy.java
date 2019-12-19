package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TaskBestBuy {

	public static void main(String[] args) {
		// Create a map of Best Buy store.
		// Place item id and item name into it. Example (7664847 = Printer, 7879885= TV
		// etc )
		// Retrieve all keys and values from a Best Buy map using EntrySet.

		Map<Integer, String> BestBuyMap = new HashMap<>();
		BestBuyMap.put(7664847, "Printer");
		BestBuyMap.put(7879885, "TV");
		BestBuyMap.put(6790987, "Refrigerator");
		BestBuyMap.put(1234567, "Security System");
		BestBuyMap.put(9876543, "Video Games");
		BestBuyMap.put(6789345, "Crap near register");

		Set<Entry<Integer, String>> entrySet = BestBuyMap.entrySet();

		System.out.println("--using for each loop to get all entry objects--");

		for (Entry<Integer, String> entry : entrySet) {
			// System.out.println(entry);
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();
		System.out.println("--using for iterator to get all entry objects--");

		Iterator<Entry<Integer, String>> entIterator = entrySet.iterator();
		while (entIterator.hasNext()) {
			Entry<Integer, String> ent = entIterator.next();
			Integer key = ent.getKey();
			String val = ent.getValue();
			System.out.println(key + "----->" + val);
		}

	}

}
