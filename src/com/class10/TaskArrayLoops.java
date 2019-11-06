package com.class10;

public class TaskArrayLoops {

	public static void main(String[] args) {
		String[] country = {"France","Turkey", "US", "Germany" };
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (country[i].equals("US")) {
				System.out.println("DC");
			} else if (country[i].equals("France")) {
				System.out.println("Paris");
			} else if (country[i].equals("Germany")) {
				System.out.println("Berlin");
			}

		}
	}
}
