package com.class34;

import java.util.*;

class Sweets{
	
	String name;
	
	public Sweets(String name) {
		this.name=name;
	}
	public void iLove() {
		System.out.println("I love "+name);
	}
	
}

public class LinkedListDemo2 {

	public static void main(String[] args) {
	 // create a list of Sweets Objects
		
		LinkedList<Sweets> sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));

		
		//lets display name of each sweet Object
		
		for(Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		// retrieving 1 element and accessing method(2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		
		// retrieving 1 element and accessing method(2 steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		String str="Hello 123 ";
		String newStr=str.replace("123","456").trim();
		System.out.println(newStr);
		
		Integer num=100;
		String newNumber=num.toString().replace("100","200");
		System.out.println(newNumber);
		
	}

}
