package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale? (True or False)");
		boolean sale = scan.nextBoolean();
		int price;
		double discount;
		double finalPrice;	
		
		
		if(!sale) {
			System.out.println("I am not shopping");
		}else {
			
			System.out.println("Price of the item");
			price=scan.nextInt();
						
			if (price < 20) {
				// 10% discount
				discount = price*0.1;
//				finalPrice = price - (price-discount);
			} else if (price >= 20 && price < 100) {
				discount = price*0.2;
//				finalPrice = price - (price-discount);
			} else if (price >= 100 && price < 500) {
				discount = price*0.3;
//				finalPrice = price - (price-discount);
			} else {
				discount = price*0.5;
				
			}
			finalPrice = price-discount;
			System.out.println("After discount " + discount + " the price of the item reduce from " + price + " to "+ finalPrice);
			
		}
			}
}
