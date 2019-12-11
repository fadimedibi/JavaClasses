package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		// Create  an  arrayList  of  words. 
		//Remove  every word that ends with “e”. 
		//Use iterator
		
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		list.add("Fadime");
		list.add("Murat");

		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
