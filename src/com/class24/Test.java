package com.class24;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Child 1---");
		Child1 c1=new Child1();
		System.out.println(Child1.race);
		System.out.println(c1.hairColor);
		System.out.println(c1.eyeColor);
		c1.sing();
		c1.code();
		System.out.println("---Parent---");
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(parent.race);
		parent.sing();
		//parent.code();  // it was in the child class
		
		System.out.println("---Child 2----");
		Child2 c2=new Child2();
		System.out.println(c2.race);
		System.out.println(c2.hairColor);
		System.out.println(c2.eyeColor);
		c2.sing();
		c2.draw();
		//child2.code();
		
		
		
		
		
		
		
	}

}
