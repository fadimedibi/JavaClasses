package com.class12;

public class TwoDArrayRecap {

	public static void main(String[] args) {
		int[][] array1 = new int[2][3];

		// first row:
		array1[0][0] = 9;
		array1[0][1] = 10;
		array1[0][2] = 11;

		// second row:
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;

		for (int i[] : array1) {
			for (int j : i) {
				System.out.println(j);
			}
		}
		System.out.println("******************");

		int[][] array2 = { { 44, 55, 67 }, { 22, 11, 32 } };

		for (int[] is : array2) {
			for (int is2 : is) {
				System.out.println(is2);

			}

		}

	}

}
