package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// Split Method turns as an array of string
		String str = " Video provides a powerful way to help you prove your point.";

		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// how can we find how many sentences are in the following String
		String str1 = "Today is Sunday.Its a sunny day.And we are having Java class";
		String[] array2 = str1.split("\\.");// . is not considered regex
		System.out.println("The number of the sentences in the given string is: " + array2.length);
		for (String string : array2) {
			System.out.println(string.trim());
		}

	}

}
