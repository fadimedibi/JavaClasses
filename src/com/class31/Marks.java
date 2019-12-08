package com.class31;
//We have to calculate the percentage of marks obtained in three subjects (each
	// out of 100) by student A and in four subjects (each out of 100) by student B.
	// Create class ‘Marks’ with an abstract method ‘getPercentage’.
	// It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students.
	// The constructor of student A takes the marks in three subjects as its
	// parameters and the marks in four subjects as its parameters for student B.
	// Test your code
public abstract class Marks {

	
public  Marks(int sub1,int sub2,int sub3){
	//this(sub1,sub2,sub3);
	 this.sub1=sub1;
	 this.sub2=sub2;
	 this.sub3=sub3;
	 
	}

	public 	abstract double getPercentage();

}



