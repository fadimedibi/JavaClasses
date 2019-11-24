package com.class20;

public class Task1 {
	//Create a method that will take 1 parameter as a String and return reversed String. 
	//Method should be visibly only within same package.
	
	
	//method with return:
	String reverseString(String word) {
	String reversed="";
	for (int i = word.length()-1; i >=0 ; i--) {
		reversed+=word.charAt(i);
		}
		return reversed;
		
		//method without return:
		
 void String  hello() {
		System.out.println("Hello");
	}

	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
	//Create a method that will take a String and return whether String is palindrome or not. 
	// Method should be available to all classes within your projects.
	
	boolean isPalindrome(String parameter) {
		boolean result=false;
		String reverse=reverseString(parameter);
		
		if(parameter.equalsIgnoreCase(reverse)) {
			result=true;
		}else {
			result=false;
		}
		
		return result;
	}
	
	//Create a method that will take a string and return an array of words from that string. 
	//Method should be available only within same class.
	private String[] arrayOfWords(String sentence) {
//		String[] stringArray;
//		stringArray = sentence.split(" ");
//		return stringArray;

		return sentence.split(" ");//	return sentence.split(" "); you can make it only one line
	}
	
	
	public static void main(String[] args) {
		Task1 obj=new Task1();
		System.out.println(obj.reverseString("Java Class"));
		
	boolean result2	=obj.isPalindrome("Syntax");
	System.out.println(result2);
	
	String[] strArray = obj.arrayOfWords("What a beautiful day is today!");
	System.out.println("The length of the array is: " + strArray.length);
	for (String word : strArray) {
		System.out.println(word);
			
		
		}
	
}
}
