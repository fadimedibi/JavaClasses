package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		//to store key+value into map
		
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		
		//how to verify if there is any element inside map
		
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
		// I want to add more entry
		//map.put("105", "Julie");-----> CE: key and value type must be matched
		// adding duplicate values---->Ok
		map.put(105, "John");
		System.out.println(map);
		// adding duplicate keys----> override, we can not have duplicate keys
		map.put(102, "Jessie");
		System.out.println(map);
		
		//how to access a value 
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103,  "Zeynep");
		System.out.println(map);
		
		//how to remove an Object from a map
		
		map.remove(101);
		System.out.println(map);
		
		//how to verify if certain key is exist
				boolean flag1=map.containsKey(200);
				System.out.println(flag1);
				if (flag1 ) {
					map.replace(200, "Seval");
				}else {
					map.put(200, "Seval");
				}
				//how to verify if certain values is exist
				boolean contains=map.containsValue("Seval");
				System.out.println(contains);
				System.out.println(map);
				
				
				
				TreeSet map3 = new TreeSet();
				map3.add("one");
				map3.add("two");
				map3.add("three");
				map3.add("four");
				map3.add("one");
			//	map3.clear();
				map3.removeAll(map3);
				Iterator it = map3.iterator();
				while (it.hasNext() )
				{
				System.out.print( it.next() + " " );
				}
	}

}
