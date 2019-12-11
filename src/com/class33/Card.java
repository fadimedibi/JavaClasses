package com.class33;

public abstract class Card {

	// Create a Card class that will have implemented and unimplemented methods
	// and a constructor that will initializes credit card type.
	// Create 3 subclasses of a Card card.
	// Create 3 objects of different card and store them into LinkedList.
	// Using for loop/advanced for loop/ iterator access all methods of the class.

	String cardType;

	Card(String cardType) {
		this.cardType = cardType;
	}

	public void openAnAccount() {
		System.out.println("As a bank of XXXX, even if you go to Mars,"
		+ " we will find you to open an account!HaHaHa");
	}

	public abstract void moneyOrderFee(double amount);
}

class MasterCard extends Card {
	int amount;

	MasterCard(String cardType) {
		super(cardType);
	}

	@Override
	public void moneyOrderFee(double amount) {
		System.out.println("Money order fee will be $5 through " + cardType);
	}
}

class CreditCard extends Card {
	CreditCard(String cardType) {
		super(cardType);
	}

	@Override
	public void moneyOrderFee(double amount) {
		if ((amount >= 250) && (amount <= 2000)) {
			System.out.println("Money order fee will be 1.70$ through " + cardType);
		} else if ((amount >= 2000.1) && (amount < 100000)) {
			System.out.println("Money order fee will be " + amount * 0.01 + "$ through " + cardType);
		} else {
			System.out.println("Money order will be FREE through " + cardType);
		}
	}
}

class DebitCard extends Card {
	DebitCard(String cardType) {
		super(cardType);
	}
	@Override
	public void moneyOrderFee(double amount) {

		if (amount <= 1000) {
			System.out.println("Money order fee will be " + amount * 0.001 + "$ through " + cardType);
		} else {
			System.out.println("Money order fee will be " + amount * 0.002 + "$ through " + cardType);
		}

	}

}