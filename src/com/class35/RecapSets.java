package com.class35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RecapSets {

	
	// int [] array= {12,12,14,15};
	//In arrays we can retrieve values from array:
	//for loop
	//enhanced for loop
	
	public static void main(String[] args) {
		Set<Double> set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		set.add(59.99);
		set.add(39.99);
		set.add(19.99);
		
		//In set we can retrieve values from a Set:
		
		//enhanced for loop	
		//iterator
		
		Iterator<Double> it=set.iterator();
		
		while(it.hasNext()) {
			Double d=it.next(); //we can use double d=it.next(); unwrapping 
			if(d<50) {
				it.remove();
				
			}
		
		}
		System.out.println(set);	
		
		
		System.out.println("----------------");
		for(Double d1:set) {
			System.out.println(d1);
		}
		
		//How can I access just 1 values from the Set collection
		Set<String> lset= new LinkedHashSet<>();
		
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");
		
		//1 way convert to the Array List
		 List<String> myList=new ArrayList<>();
		 myList.addAll(lset);
		 String element=myList.get(2);
		 System.out.println(element); 
		
		 
		List<String>myList1=new ArrayList<>(lset);
		
		
		
		
		
		
	}

}
