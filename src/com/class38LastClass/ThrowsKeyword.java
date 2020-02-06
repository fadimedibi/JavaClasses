package com.class38LastClass;

public class ThrowsKeyword {

	public static void main(String[] args) {
		System.out.println("Beginning");
		callingExceptionMethod();
		System.out.println("end");
		
	}
	
	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae=new ArithmeticException();
		throw (ae);
	}
	
	public static void callingExceptionMethod() {
		try {
			throwingException();
		}catch (ArithmeticException e) {
			System.out.println("interrupted Exception");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
