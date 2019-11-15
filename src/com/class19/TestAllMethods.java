package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// To find the largest number from 300 and 500
		// then identify is the largest number

		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
		boolean odd = obj.isOdd(large);
		System.out.println(odd);

		System.out.println(obj.isOdd(obj.findLargest(300, 500)));

// call method weekDayNAme
		// if the output will be Tuesday or Wednesday, Thursday, saturday and Sunday
		// -------->I am learning JAVA

		String day = obj.weekDayName(5);

		if (day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Saturday")
				|| day.equals("Sunday")) {
			System.out.println("I am learning JAVA");
		} else {
			System.out.println("I am practicing JAVA");
		}
	}

}
