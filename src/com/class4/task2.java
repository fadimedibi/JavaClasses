package com.class4;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rate = 3.75;
		int price = 250000;

		if (rate < 4.5) {
			System.out.println("I will cosider buying");
			if (price > 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}
		} else {
			System.out.println("I will not buy a house");
		}
	}
}
