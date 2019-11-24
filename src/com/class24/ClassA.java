package com.class24;

public class ClassA {

		// Write program for multilevel inheritance
		// where class A inherited by B and class B inherit class by C.

		public static String name = "Class A";
		public String position = "Employee";
		public int workHours = 40;

		public void info() {
			System.out.println("This is the  " + this.name + " and the position is " + position + " and works " + workHours
					+ " hours in a week");

		}
	}

