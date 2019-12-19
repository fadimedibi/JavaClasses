package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		//Create a map of a person(name,last name, address, city, state
	
	
	Map<String, String> personMap=new LinkedHashMap<>();
	personMap.put("Name","Ahmet");
	personMap.put("LastName","Yildiz");
	personMap.put("Address","123 Test");
	personMap.put("City","Dallas");
	personMap.put("State","TX");
	
	System.out.println(personMap);
	// how to retrieve a specific value?
	String value=personMap.get("State");
	System.out.println(value);
	
	//how to retrieve all keys and all values?
	System.out.println("---------Printing all keys---------");
	Set<String> keys=personMap.keySet();
	
	//1st way for each loop
	for(String key:keys) {
	//	System.out.println(key); or you can print keys and values together
		System.out.println(key+":"+personMap.get(key));
	}

	// 2nd way iterator
	Iterator<String> keysIterator=keys.iterator();
	while(keysIterator.hasNext()) {
		String mapKey=keysIterator.next();
		String mapValue=personMap.get(mapKey);
		System.out.println(mapKey+":"+ mapValue);
		//System.out.println(keysIterator.next()+ personMap.get(keysIterator.next())); 
		//when we do this way it goes to next value and mixes, then throws an exception for no such an element
		
		
	}
	System.out.println("---------Printing all values---------");
	
	Collection<String> values=personMap.values();
	
	//1st way for each loop
	for(String val:values) {
		System.out.println(val);
	}
	// 2nd way iterator
	Iterator<String> valuesIterator=values.iterator();
	while(valuesIterator.hasNext()) {
		System.out.println(valuesIterator.next());
	}
	
	
	}

}
