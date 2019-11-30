package com.class27;

public class TestStudent {

	public static void main(String[] args) {
	Student s1=new SyntaxStudent();
	s1.study();
	s1.exam();
	s1.grade();
//	s1.SDLC();
	Student s2=new CollegeStudent();
	s2.study();
	s2.exam();
	s2.grade();
//	s2.club();
	Student s3=new SchoolStudent();
	s3.study();
	s1.exam();
	s3.grade();
//	s3.semesterBreak();
	System.out.println("------with Array-----");
	Student[] st= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
	for(Student s:st) {
		s.study();
		s.exam();
		s.grade();

	}
	}
	
	
	
	}


