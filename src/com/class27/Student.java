package com.class27;

class Student {
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
	public void grade() {
		System.out.println("I don't know what grade I am in!");

	}

	public void study() {
		System.out.println("I study different subjects");
	}

	public void exam() {
		System.out.println("I have to take final exams to finish my courses");
	}
}

	class SyntaxStudent extends Student {
		public void grade() {
			System.out.println("I don't have a grade, I am in bootcamp");
		}

		public void study() {
			System.out.println("I study JAVA");
		}

		public void SDLC() {
			System.out.println("I also learn SDLC in Syntax");
		}

	}

	class CollegeStudent extends Student {

		public void study() {
			System.out.println("I study Computer Science");
		}

		public void Club() {
			System.out.println("i am in Drama club");
		}

	}

	class SchoolStudent extends Student {

		public void grade() {
			System.out.println("I am in 12th grade");

		}

		public void SemesterBreak() {
			System.out.println("I have winter break");
		}
	}


