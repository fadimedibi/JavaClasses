package com.class11;

public class TwoDArraysDemo2Strings {

	public static void main(String[] args) {
		String[][] names= {
				{"Khan", "Yusuf","Alex","Zeynep"},
				{"Muhammed", "Ann","Naslihan", "Weqas"},
				{"Ali", "Ayse", "Zubair", "Sifa"}
					};
		int length=names.length;
		System.out.println(length);
		int lengthOfElements=names[0].length;
		System.out.println(lengthOfElements);
		
		for(String getArrays[]: names) {
			for(String getName: getArrays) {
				System.out.print(getName+ " ");
				
			}
			System.out.println();
		}
	}

}
