package com.class5;

public class LogicalOperatorsOr {

	public static void main(String[] args) {

//     7 days a week
//		if days is 2 or 4---->SDLC class
//		if day 6-7---->java class
//		idf day 1 or 5 ----- no class
//		if day 3----->review classs

		int day = 6;
		// false OR false---->false
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
			// true OR false---->true
		} else if (day == 6 || day == 7) {
			System.out.println("Java Class");
			// false OR false---->false
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("Not a valid day");
		}

	}

}
