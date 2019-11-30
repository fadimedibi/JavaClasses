package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// creating an obj of parent class
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("--------------------");
		// creating an obj of parent class

		Cat cat = new Cat();
		cat.eat();// from parent
		cat.sleep();// from parent
		cat.meow();// from child

		// widening: bite---short--int---long---float----double
		double d = 90;
		// narrowing :
		int i = (int) 1.99;
		System.out.println("------------------");
		// Non-primitive TypeCasting
		// Widening -----> creating an object of the class and giving reference to the
		// parent class
		Animal obj = new Cat();
		// Narrowing
//		Cat obj2=new Animal();------> cannot convert from animal to Cat class
		obj.eat(); //coming from parent
		obj.sleep();//this method will come from child class----> runtime polymorphism
//		obj.meow(); compiler error-----> method won't available

	}

}
