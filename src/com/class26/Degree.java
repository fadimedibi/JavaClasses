
package com.class26;
//Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”.
//Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and ‘Postgraduate’ each having a method with the same name that prints “I am an Undergraduate” and “I am a Postgraduate” respectively. 
//Call the method by creating an object of each of the three classes.

public class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}

}

class UnderGraduate extends Degree {

	public void getDegree() {
		System.out.println("I am an undergraduate");
	}

}

class PostGraduate extends Degree {
	public void getDegree() {
		System.out.println("I am a Postgraduate");
	}

}