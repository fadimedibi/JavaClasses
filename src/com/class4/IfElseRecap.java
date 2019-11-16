package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Class Schedule if tuesday---->sdlc if wednesday---->java review if
		 * thursday----->sdlc if saturday----->java coding if sunday------> my favorite
		 * java class */
		
		
		int day = 7;

		if (day == 2) {
			System.out.println("SDLC Class");
		} else if (day == 3) {
			System.out.println("Java Review Class");
		} else if (day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6) {
			System.out.println("Java Class");
		} else if (day == 6) {
			System.out.println("My Favorite Java Class");
		} else {
			System.out.println("There is no class at school");
		}
	}

}
