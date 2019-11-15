package com.class18;

public class Task {
//Create a method that will take 2 parameters as a numbers
//and prints which number is larger.

	void maxNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger number");
		} else if((num2 > num1)) {
			System.out.println(num2 + " is larger number");
		}else {
			System.out.println("Numbers are equal");
		}
	}
//Create a method that will take a number 
//and prints whether the number is even or odd.
	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}
	}
//Create a method that will print whether given String is palindrome or not.
	void palindrome(String s) {

		String reverse = "";

		for (int j = s.length() - 1; j >= 0; j--) {
			reverse = reverse + s.charAt(j);
		}

		if (reverse.equalsIgnoreCase(s)) {
			System.out.println(s+ " ---> This string is palindrome");
		} else {
			System.out.println(s+ " ---> This string is NOT palindrome");
		}
	}

	public static void main(String[] args) {
		Task obj = new Task();
		obj.maxNumber(67, 45);
		obj.evenOdd(79);
		obj.palindrome("tras nicin sart");
		obj.palindrome("bu kitap su kitap o kitap");
	}

}
