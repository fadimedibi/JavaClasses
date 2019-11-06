package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		String[] actualNames= {"John", "Smith", "Alex", "Tanaz"};
		Arrays.sort(actualNames);
		
		String[] expectedNames= {"Smith","John","Tanaz", "Alex"};
		//to sort the elements of an array:
		Arrays.sort(expectedNames);
		
		System.out.println(Arrays.toString(actualNames));
		
		Arrays.parallelSort(expectedNames);
		
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		
		System.out.println(actual.equals(expected));
		
		
		
		
		
		
		int[]numbers= {123,34,55,66,99};
			for(int i:numbers) {
			System.out.print(i+" ");
		}
			System.out.println("*************");
			
			Arrays.sort(numbers);
			for(int i:numbers) {
			System.out.print(i+ " ");
			}
	}

}
