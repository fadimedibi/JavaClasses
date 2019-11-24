package com.class21;

public class Employee {
	/* 1.Create a Class called Employee:
	●Create three  variables  eID , salary and set the CEO to “Sumair” 
	●Create two objects of the class Employee 
	●Set the value of eID, salary for each of the objects
	●Print out the eID , salary and  CEO for each of the objects 
	*/
	public String eID;
	public int salary;
	public static String CEO;
	
	void displayInfo(){
		System.out.println("Name of the employee "+ eID+ " , salary of the employee "+salary+ " CEO of the employee is "+CEO);
	}
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.eID="Hadi Hayirlisi";
		employee1.salary=99000;
		Employee.CEO="Sumair";
		employee1.displayInfo();
		
		Employee employee2=new Employee();
		employee2.eID="Kolay Gelsin";
		employee2.salary=99001;
		Employee.CEO="Sumair";
		employee2.displayInfo();
	}
		
}
