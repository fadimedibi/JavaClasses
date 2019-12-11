package com.class32;

public class Recap {

	public static void main(String[] args) {
		// to store a single value
		int number = 10;

		// to store multiple values
		// 1st way:
		int[] array = { 10, 20, 30 };
		// 2nd way:
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr[2]);
		// to retrieve all values 1 by 1
		System.out.println("---with for loop----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---with for each loop----");
		// enhanced loop/for each loop/ advanced loop
		for (int num : arr) {
			System.out.println(num);
		}

		// we can store non primitive types:Objects
		Fruit f = new Apple();
		Fruit f1 = new Banana();
		Fruit f2 = new Orange();
		Monkey monkey=new Monkey();
		
		
		
		
		Object [] mixArray = { f, f1, f2,monkey,"Hello" };
		for (Object fr : mixArray) {

		}

	}

}
class Monkey{
	
}

class Fruit {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}

class Banana extends Fruit {

}
