package com.class34;

import java.util.HashSet;
import java.util.Set;

public class Student {
// Create a Set collection that will hold Objects of Student Type.
	// In this set we do not care about the insertion order.
	// Each student object should have name and studentID.
	// Display name of each student.

	String name;
	int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;

	}

	public void display() {
		System.out.println("Student name: " + name + ", student ID: " + studentId);

	}

	public static void main(String[] args) {

		Set<Student> st = new HashSet<>();
		st.add(new Student("Wednesday Addams", 101));
		st.add(new Student("Sheldon Cooper", 201));
		st.add(new Student("Forrest Gump", 301));
		st.add(new Student("Kevin McAllister", 104));
		st.add(new Student("Adrian Monk", 302));
		st.add(new Student("Elsa of Arendelle", 106));
		st.add(new Student("Anne Shirley", 107));

		for (Student s : st) {
			// System.out.println(s.name);
			s.display();
		}

	}

}
