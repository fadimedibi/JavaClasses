package com.class23;

public class Car {
/* we want to build make as Toyota cars 
 * that will have different models and colors*/
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {  // this method it is accessible from all Java class(public), (void) does not return , does not have any parameters
		System.out.println("I build "+color+" "+ make+" "+model);
		System.out.println("My car has "+doors+" doors and can have speed up to "+speed );
	}
	
	 
	
	
	
}
