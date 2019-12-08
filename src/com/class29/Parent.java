package com.class29;

public class Parent{
	
	String str="Hello";
	int age;
	
	public Parent(int age) {  // parent constructor
	this.age=age;
	}
	
	public void hello() { //parent method
		System.out.println("Hello");
	}
	
}
class Child extends Parent{
	String str1="Bye";
	public Child(int age){
		super(age);
	}
	
	
	public void access() { 
		System.out.println(super.str);
		System.out.println(str1);
		
	}
	public void hello() {
		System.out.println("hello");
	}
	public void display() {
		hello();
		super.hello();
		
	}
}