package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// Let's create a collection of veggies where I do not want to have duplicate
		//hashset order of elements is not preserved
		HashSet<String> hset = new HashSet<>();
		
		// storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");

		System.out.println(hset.size());
		System.out.println(hset);

		//they do not have any methods to retrieve elements from the collection
		//.get(); , .set();
		
		// how can we retrieve all elements?
		System.out.println("1st way --- iterator");
		
		Iterator<String> it =hset.iterator();
		
		while(it.hasNext()) {
			String element= it.next();
			System.out.println(element);
		}
		
		System.out.println("2nd way--- enhanced for loop");
		for(String element: hset) {
			System.out.println(element);
		}
		
		
	}

}
