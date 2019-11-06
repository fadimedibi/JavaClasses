package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		String str = "Syntax";
		System.out.println(str.toCharArray());// it just gives the regular output

		char[] array = str.toCharArray();
		for (char i : array) {
			System.out.println(i);
			
		}

		char b='w';
		char c='a';
		System.out.println(b+c);//char does not concatenate
		
		
	}

}
