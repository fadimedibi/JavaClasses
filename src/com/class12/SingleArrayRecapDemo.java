package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[4];
		array1[0] = 12;
		array1[1] = 13;
		array1[2] = 14;
		array1[3] = 15;
		
		
		int sum1=0;
		
		for (int s = 0; s < 4; s++) {
			sum1=sum1+array1[s];
			System.out.println(array1[s]);
			
		}
		System.out.println("Sum of array is "+sum1);
		
		
//tek birini cikarmak istersek:
		System.out.println(array1[1]);
		
		System.out.println("***********************");
		
// tum array listini cikarmak istersek:
		for (int s = 0; s < array1.length; s++) {
			System.out.println(array1[s]);
			
			System.out.println("***********************");
// For-each loop (each loop=enhanced loop) other way , we hold the value in i temporarly, background array is working .
// each iteration i is getting the value
for(int i:array1) {
	System.out.println(i);
}
		}
		
		

	}

}
