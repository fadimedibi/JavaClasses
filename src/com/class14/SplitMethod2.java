package com.class14;

import java.lang.reflect.Array;

public class SplitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="If you come to calss early,"
				+"then you can study more, also you can learn more'"
				+"and you can leave early";
		
		String[]array=str.split(",");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
			
		String str1="Welcome To Syntax Technologies";
		String[] array2= str1.split(" ", 3);
		System.out.println(array2.length);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
