package com.class10;

public class HwForArray {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		int[] array = { 3, 5, 9, 10, 68, 45, 27, 56 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		System.out.println();
		System.out.println(sum);

	}

}
