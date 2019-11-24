package com.class22;

public class InstanceVariables {

	String name="Samir";	// instance variable(outside of the method, inside the class
	
	
	public static void main(String[] args) {
		String name="Burcu"; 	//Local variable(inside the method)
		System.out.println(name);  // printing the local variable
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);  // printing the instance variable
		obj.name="John";
		System.out.println(obj.name);   //changing the value of instance variable
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		
	}
	
	
	
	
}
