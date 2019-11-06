package com.class5;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b1 = !true;
		boolean b2 = !false;
		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = true;

		// if traffic ---->late, else---->on time
		// using! we are reverting condition

		if (!traffic) {
			System.out.println("on time");
		} else {
			System.out.println("Late");
		}

		boolean isRain = false;
		if (!isRain) {
			System.out.println("Take an umbrella");
		} else {
			System.out.println("Don't take an umbrella");
		}

		// let's compare 2 numbers using NOT operator
		int num1 = 10;
		int num2 = 11;

		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}

		if (!(num1 == num2)) {

			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		//if name is not Mary or Anna then you are not my sister.
		String name = "Mary";
		String name2 = "July";

		if (!(name.equals("Mary") || name.equals("Anna"))) {

			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister");
		}
	}

}
