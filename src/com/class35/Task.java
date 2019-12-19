package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		HashMap<Integer,String> floor=new HashMap<>();
floor.put(1, "Google");
floor.put(2,"Syntax");
floor.put(3, "Amazon");
floor.put(4, "Ikea");
floor.put(5, "FurnitureXo");
floor.put(6, "BestBuy");
floor.put(7, "Nuts2U");
int mSize =floor.size();
System.out.println(floor + " " + mSize);
floor.replace(4, "Burger King");
floor.remove(7);
System.out.println( " ---------------------------------"  );
System.out.println(floor + " " + mSize);	
		
		
	}

}
