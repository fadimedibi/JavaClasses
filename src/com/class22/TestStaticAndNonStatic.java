package com.class22;

public class TestStaticAndNonStatic {

	public static void main(String[] args) {
	
		//how to access static members
		//they can be accessed by class name
		
	System.out.println(StaticVsNonStatic.school);
	StaticVsNonStatic.getInfo1();
	
	
	// how to access non static members 
	//they can be accessed by creating an object of that class
	 StaticVsNonStatic std1=new StaticVsNonStatic();
		
			
			std1.name="Fadime";
			std1.grade='A';
			std1.getInfo();
			std1.getInfo1();
			
		}



}
