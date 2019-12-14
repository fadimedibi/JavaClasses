package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratiorUsage {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("John");
		stringList.add("Ak");
		
		
		// remove names that are shorter than 4 character
		stringList.remove(2);
		System.out.println(stringList);
		
		// removing elements using for loop
		for (int i = 0; i < stringList.size(); i++) {
			if(stringList.get(i).length()<4) {
				stringList.remove(i);
			}
			
		}
		System.out.println(stringList);
		
		
		System.out.println("removing elements with iterator");
		List<String> stringList1=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("John");
		stringList.add("Ak");
		
		Iterator<String> it=stringList1.iterator();
		while(it.hasNext()) {
			if(it.next().length()<4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
		
		
		
		
		
		
		
		
		
	}

}
