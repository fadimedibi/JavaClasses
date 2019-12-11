package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework {

	public static void main(String[] args) {
		// Create an arraylist of cars and retrieve all the values using 3 different ways.
		
		ArrayList<String> cars=new ArrayList<>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Honda");
		System.out.println("------First Way------");
for (int i = 0; i < cars.size(); i++) {
System.out.println(cars.get(i));	
}
System.out.println("------Second Way------");
for(String car:cars) {
	System.out.println(car);
}
System.out.println("------Third Way------");
Iterator car=cars.iterator();
while(car.hasNext()) {
	System.out.println(car.next());
}

	}

}
