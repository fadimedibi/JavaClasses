package com.class24;

public class Task2 {
	//Write a program  that will have a 4 different access levels of constructors
	//and create 3 objects of this class:
	//1 - inside same class; 
	//2 - from outside the class and observe result.
	//3 - from different class inside different package

	public Task2() {
		System.out.println("I am public constructor");
	}
	
	Task2(String str){
		System.out.println("I am default constructor");
	}
	protected Task2(int num){
		System.out.println("I am protected constructor");
	}
	private Task2(int num, int num2) {
		System.out.println("I am private constructor");
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		Task2 obj1=new Task2(4);
		Task2 obj2=new Task2(4,5);
		Task2 obj3=new Task2("Some String");
	}
}
