package com.class24;

public class Student {
/*Write program as a Student class   that has instance variables name and address. 
	Create a constructor that will initialize those variables. 
	Print name & address of given  student by the displayInfo method.*/
	
	String name;
	String address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Student name: "+name+ " and his/her address is: "+address);
	}
	
	public static void main(String[] args) {
		Student obj=new Student("Dibi","150 Doris Cv Collierville,TN 38125");
		obj.displayInfo();
	}
	
}
