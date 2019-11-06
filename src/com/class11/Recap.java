package com.class11;

public class Recap {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 14;
		int num3 = 16;

		int num4 = 13, num5 = 50, num6 = 33;
		int a, b, c, d;

		a = 12;
		b = 33;

		// Array declaration:
		int[] h = new int[3];
		int e[];
		int[] y;
		y = new int[3];
//		u=new int [2];
//		u=12;

		int[] numbers = new int[6];
		numbers[0] = 33;

		int[] arr = { 2, 3, 5, 7 };
		for (int g = 0; g < arr.length; g++) {
			System.out.println(arr[g]);
		}
		System.out.println("--------------------------");

// ar is holding the value of arr,
// for 1 index of arr, ar will store that value temporally
		for (int ar : arr) {
			System.out.println(ar);
		}

		System.out.println("--------------------------");
		// months and day for loop:
		for (int month = 1; month <= 12; month++) {
			for (int day = 1; day <= 30; day++) {
				System.out.println(month + " " + day);
			}
		}

	}

}
