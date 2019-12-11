package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework3 {

	public static void main(String[] args) {
		// Create an arrayList of drinks.
		//If any drink has letter “a” or “e” replace it with water. 

		ArrayList<String> drinks=new ArrayList<>();
		
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");
		
		System.out.println(drinks);	
		//drinks.set(0,"water");
		
		
		for (int i=0;i<drinks.size(); i++) {
			if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")) {
			drinks.set(i, "water");	
		}
			
			}
		System.out.println(drinks);	
		
	}

}
