package com.class11;

public class TaskArrays {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns
		// and print all values of the whole array.

		int[][] array = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 1, 0, 9, 5 },

		};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("**************");
		// Create a 2D array or integer type where you will store odd and even numbers
		// in 3 rows and 4 columns.
		// Develop a program which will identify/print the even numbers only.

		int[][] num = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 1, 0, 9, 5 },

		};
		for (int even[] : num) {
			for (int getEven : even) {
				if (getEven % 2 == 0) {
					System.out.print(getEven + " ");
				}

			}

		}

		// Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.
		int[][] number = { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 0, 9 }};
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				sum = sum + number[i][j];

			}
			System.out.println("the sum of the arrays is " + sum);System.out.println();
		}
		
		
		System.out.println();
		System.out.println("***********************");
		
		int[][] numbers = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 1, 0, 9, 5 },

		};
		int sum1=0;
		for(int numb[]: numbers) {
			for(int getNum:numb) {
				sum1=sum1+getNum;
			}
					}
		System.out.println("The sum of all of the elements in the array is= "+sum1);
		
		
	}

}
