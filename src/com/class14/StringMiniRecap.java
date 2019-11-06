package com.class14;

public class StringMiniRecap {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str);

		System.out.println(str == str3);// it gives false
		System.out.println(str.equals(str3));// we can check the string equality

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2);

		String str2 = str.replaceAll("Hello", "Bye");
		System.out.println(str2);
	}

}
