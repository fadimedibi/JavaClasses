package com.class20;

public class Andrei {
	
	public String name;  //default
	String phone;
	private String SSN;
	protected String birthday;

	// public can be seen from everywhere
	public void add1() {  //public
		
		int num1 = 2;
		int num2 = 1;
		int result = num1 + num2;
	}
// default can be seen /accessed 
	//with in package
	void add2(int num1, int num2) {
		int result = num1 + num2;
	}
	// protected can be seen /accessed 
	//with in package
	protected int add3() {
		int num1 = 2;
		int num2 = 2;
		int result = num1 + num2;
		return result;
	}
//private can be seen /accessed 
	//only with this class
	private int add4(int num1, int num2) {

		int number1 = 4;
		int number2 = 2;
		int result = number1 + number2;
		return result;
	}
}

