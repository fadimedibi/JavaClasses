package com.class27;

public class Car {

	String make, model;
	int year;
	
	Car(){
		System.out.println("I am non argumentative constructor");
	}
	
	public void display() {
		System.out.println("We build  "+year+" "+make+" "+ model);
	}
	public static void main(String [] args) {
		Car car=new Car();
		car.display();
		
		int num=5; 
		System.out.println(num);
		System.out.println("----------------Object of the child class------------");
		Tesla tesla=new Tesla();
		//tesla.display();
	}
}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		super();
		System.out.println("Non argument constructor of the child class");
	}
	
}
