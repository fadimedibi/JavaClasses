package com.class19;

public class Student {

	char getGrade(int score) {
		char grade = 0;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else if (score >= 50 && score < 70) {
			grade = 'D';
		} else if (score < 50) {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		Student s = new Student();
		char grade = s.getGrade(85);
		System.out.println(grade);
	}

}
