package com.class11;

public class HomeworkContinentsCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of countries:
		// north america countries, south america countries, europe countries, asian
		// countries, african countries.
		// Then print all values from that array.

		String[] c = { "north america countries", "south america countries", "europe countries", "asian countries",
				"african countries" };
//1st way		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("*********************************");
//2nd way:
		for(String i:c) {
			System.out.println(i);
		}
	}

}
