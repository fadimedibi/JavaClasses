package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<>();
		//to store values inside you collection
		
		arrayList.add("john");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		//to retrieve the value from arrayList
		System.out.println(arrayList.get(1));

		//how many elements inside the arrayList?
		int size=arrayList.size();
		System.out.println(size);
		
		//creating an object of arrayList that will hold numeric values
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		//update the value
		numArrList.set(0, 1000);
		System.out.println(numArrList);// it gets all the values in one line
		
		
		//retrieving values
		System.out.println(numArrList.get(2));// it gets only the index 2 value of the array
		
		
		//int num-->control or counter----> controls # of iterations for the loop
		for (int num = 0; num < numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}
		for(Integer number:numArrList) {
			System.out.println(number);
		}
	}

}
