package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//create a car class that will have variables, methods and constructor
// create a map that will hold car number and car objects store in it

class Car {
	String make, model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void display() {
		System.out.println(make + " " + model);
	}
}

public class CarTest {

	public static void main(String[] args) {

		Map<Integer, Car> mapCar = new LinkedHashMap<>();

		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "S"));

		System.out.println(mapCar.size()); // 5 Tesla S is overriden

		// display only value objects
		Collection<Car> coll = mapCar.values();
		for (Car c : coll) {
			System.out.println(c.make + "--" + c.model);
			c.display();
		}

		// map key to its corresponding values(entrySet or keySet)

		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		for (Entry<Integer, Car> ent : set) {
			System.out.println(ent.getKey() + "---" + ent.getValue().make + "--" + ent.getValue().model);
			ent.getValue().display();
			// Asel's way
//			Integer i=ent.getKey();
//			Car c=ent.getValue();
//			System.out.println("Key"+i+" is asocciated with value of "+c.make);

		}
		// using keySet
		Set<Integer> keySet = mapCar.keySet();
		for (int key : keySet) {
			// Integer+map Object----->value Object(car Type)
			// System.out.println(key+"---"+
			// mapCar.get(key).make+"---"+mapCar.get(key).model);

			Car car = mapCar.get(key);
			String carDetails = car.make + "-" + car.model;
			System.out.println(key + "=" + carDetails);

		}
// use iterator to iterate through values, keySet, entrySet
		
		Iterator<Entry<Integer,Car>> carIt=set.iterator();
		while(carIt.hasNext()) {
			Entry<Integer, Car> entry=carIt.next();
			System.out.println(entry.getKey()+" = "+entry.getValue().make+" "+entry.getValue().model);
			
			
			
		}
			
	}

}
