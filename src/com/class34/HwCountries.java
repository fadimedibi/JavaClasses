package com.class34;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HwCountries {

	public static void main(String[] args) {
		// Create a Set collection in which you need to add names of the countries.
		//In this set we want all objects to be sorted in alphabetical order. 
		//Using 2 different ways retrieve all elements from set.
		
		Set<String> c=new TreeSet<>();
		
		c.add("Burundi");
		c.add("Sierra Leone");
		c.add("Zambia");
		c.add("Zimbabwe");
		c.add("Sri Lanka");
		c.add("Guatemala");
		
		System.out.println(c);
		//Using 2 different ways retrieve all elements from set.
		
		System.out.println("---for each----");
		for(String country:c) {
			System.out.println(country);
		}
		System.out.println("---Iterator----");
		Iterator<String> it=c.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
