package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw1test {

	public static void main(String[] args) {

		ArrayList<Insurance> arrlist = new ArrayList<>();

		Car car = new Car("Progressive", "Honda Odyssey");
		Pet pet = new Pet("Pet First", "Chicken");
		Health health = new Health("Cigna");

		arrlist.add(car);
		arrlist.add(pet);
		arrlist.add(health);
		System.out.println("------- 1st  way  for loop----");
		for (int i = 0; i < arrlist.size(); i++) {
			arrlist.get(i).getQuote();
			arrlist.get(i).cancelInsurance();
		}

		System.out.println("------- 2nd way for each/ advanced loop-----");
		for (Insurance i : arrlist) {
			i.getQuote();
			i.cancelInsurance();
		}

		System.out.println("------- 3rd way iterator-----");
		Iterator<Insurance> it = arrlist.iterator();
		while (it.hasNext()) {
			Insurance i = it.next();
			i.getQuote();
			i.cancelInsurance();

		}

	}

}
