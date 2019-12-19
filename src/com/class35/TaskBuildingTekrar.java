package com.class35;

import java.util.HashMap;
import java.util.*;

public class TaskBuildingTekrar {

	public static void main(String[] args) {

		Map<Integer, String> bMap = new HashMap<>();
		bMap.put(1, "Google");
		bMap.put(2, "Syntax");
		bMap.put(3, "Kohls");
		bMap.put(4, "JCP");
		bMap.put(5, "Target");
		bMap.put(3, "Walmart");
		bMap.put(7, "Aldi");
		bMap.put(6, "JCP");

		int size = bMap.size();
		System.out.println(size);
		System.out.println(bMap);

		bMap.replace(4, "Goodwill");
		bMap.remove(7);

		System.out.println(bMap.size());
		System.out.println(bMap);

	}

}
