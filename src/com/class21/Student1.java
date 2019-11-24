package com.class21;

public class Student1 {
	/*
	 * 2.Create a Class called Students ●Create three variables studentName ,
	 * studentID and numberOfStudents ●Create three objects of the Students Class
	 * ●Set the value for studentName , studentID and increment the numberOfStudents
	 * for each object ●Print out total number of students
	 */

	public String studentName;
	public int studentID;
	 static int numberOfStudent;

	
	public static void main(String[] args) {

		Student1 st1 = new Student1();

		st1.studentName = "Zeynep";
		st1.studentID = 5;
		Student1.numberOfStudent++;

		Student1 st2 = new Student1();

		st2.studentName = "Ferhat";
		st2.studentID = 10;
		Student1.numberOfStudent++;
		
		Student1 st3 = new Student1();

		st3.studentName = "Sumeyye";
		st3.studentID = 15;
		Student1.numberOfStudent++;
		
		System.out.println("The total number of students: "+ Student1.numberOfStudent);
	}

}
