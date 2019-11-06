package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		
		String str=new String();
		// two ways to create string object
	//1st way to create a string object:String Literal
		String name="John";
		System.out.println(name);
		// string.length
		// name.length();
		System.out.println(name.length());
		
	//2nd way to create a string object:with new key word
		String name1=new String("John1");
		System.out.println(name1);
		
		/*This method returns the length of this string
		 * the length is equal to the number of 16 -bit Unicode characters in the string.
		  */
		
		int name1Len=name1.length();
		System.out.println("The length of name1Len is " +name1Len);
		
		
		String str1="Hello woRLd";
		System.out.println("before: "+str1);
		str1=str1.toLowerCase();
		System.out.println("after: :"+str1);
		
		// .equals()
		String str2="HeLlo wORLd";
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//. equalsIgnoreCase
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//. toUpperCase(); 
		String str3="Mohammad";
		System.out.println("Before:"+str3);
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		
		
		
		
		
		
		
		
		
		
	}

}
