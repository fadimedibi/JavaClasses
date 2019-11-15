package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// Declare a string and
		// if has more than 10 characters---->String is large
		// otherwise ------>string is small
		String str = "Welcome home";
		int l = str.length();
		if (l >= 10) {
			System.out.println("String is large");
		} else {
			System.out.println("String is small");
		}

		char character = str.charAt(4);
		System.out.println(character);
// create an object of the class where method is defined
		Recap1 obj = new Recap1();
// int num=obj.sum(10, 30); compile error saying change return type

		obj.sum(10, 20);
		MethodWithReturnValue obj1 = new MethodWithReturnValue();
		int sum = obj1.sum(50, 50);
		int large = obj1.findLargest(20, 40);
		System.out.println(large);

	}
	// return type,method name(list of parameters

	int sum(int num1, int num2) {
		int c = num1 + num2;
		return c;
	}

	/*
	 * void findLargest(int num1, int num2) { int largest; if(num1>num2) {
	 * largest=num1; }else { largest=num2; }
	 * System.out.println("Largest number is "+largest);
	 * 
	 */
	
	//method to find largest number
	int findLargest(int num1, int num2) {

		int largest;
		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}

}
