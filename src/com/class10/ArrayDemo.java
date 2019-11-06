package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int[]nums=new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		//to find number of elements we use  .length
		System.out.println(nums.length);//how many elements in the array
		
						// 0		1		2			3
		String[] array= {"winter", "Fall", "Summer", "Spring"};
		System.out.println("I was born in "+ array[0]);
		
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		int[]score= {80,90,100,70};
		
		
		
	}

}
