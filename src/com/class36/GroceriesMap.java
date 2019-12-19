package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GroceriesMap {

	public static void main(String[] args) {
	Map<String, Integer> groceryMap= new LinkedHashMap<>();
	groceryMap.put("Milk",2);
	groceryMap.put("Tea",3);
	groceryMap.put("Onion",5);
	groceryMap.put("Apple",10);
	//groceryMap.put();
		
	//retrieve a single value
	groceryMap.get("Apple");
	
	//verify if specific key or value is in the map
	groceryMap.containsKey("Milk");
	groceryMap.containsValue(2);
	
	//how to retrieve all values?
	Collection <Integer> values=groceryMap.values();
	
	for(Integer val:values) {
		System.out.println(val);
	}
	Iterator<Integer> valIt=values.iterator();
	while(valIt.hasNext()) {
		System.out.println(valIt.next());
	}	
		//how to retrieve all keys and map them to values(milk---->2) using keySet
		
		Set<String>keys=groceryMap.keySet();
		for(String k:keys) {
			System.out.println((k.toUpperCase())+"----->"+groceryMap.get(k));
		
	}
			
		Iterator<String> keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
			Integer itVal=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"---->"+itVal);
		}
		//how to retrieve all keys and map them to values(milk---->2) Using entrySet
	
	Set<Entry<String, Integer>> entr=groceryMap.entrySet();
	
	for(Entry<String, Integer> ent:entr) {
		System.out.println(ent.getKey()+"------>"+ent.getValue());
		
	}
	
	Iterator<Entry<String,Integer>> entryIterator=entr.iterator();
	while(entryIterator.hasNext()) {
		Entry<String, Integer> ent=entryIterator.next();
		String key=ent.getKey();
		Integer val=ent.getValue();
		
		System.out.println(key+"---->"+val);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
