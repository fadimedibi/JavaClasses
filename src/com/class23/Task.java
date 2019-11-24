package com.class23;

public class Task {
	
	//Write a program that will have a constructor: 
	//one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	public int kids;

	Task(int kids){
		System.out.println("One parameter construction: "+kids);
		
	}
	Task(){
		System.out.println("No parameter construction");
	}
}
