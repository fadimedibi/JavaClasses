package com.class36;

import java.util.*;

public class TaskString {

	public static void main(String[] args) {
		//Create the collection that will store single unique Objects of a String type in which order is preserved.
		//Write a logic to concatenate all string from the collection.
		
		Set<String> col=new LinkedHashSet<>();
		
		col.add("Do");
		col.add("you");
		col.add("wanna");
		col.add("build");
		col.add("a");
		col.add("snowman?");
		
		for(String c:col) {
			System.out.print(c+" ");
		}
		
		
		
		
	}

}
