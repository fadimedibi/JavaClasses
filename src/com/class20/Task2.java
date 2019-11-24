package com.class20;

public class Task2 {
//	Create a method that will take a String and return whether String is palindrome or not.
//  Method should be available to all classes within your projects.
	
	public boolean method2(String word) {
		boolean result=false;
		
		String reverse = "";
		
		for (int j = word.length() - 1; j >= 0; j--) {
			reverse=reverse+ word.charAt(j);
		}

		if (word.equalsIgnoreCase(reverse)) {
			result=true;
		} else {
			result=false;
		}
		return result;
	}
	public static void main(String[] args) {
		
		Task2 obj2=new Task2();
		
		boolean result1=obj2.method2("tras nicin sarte");
		System.out.println(result1);
	}
	
}
