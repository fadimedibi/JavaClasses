package com.class33;

public abstract class Insurance {
	// Create a class Insurance that will have an attribute as insuranceName
	// and unimplemented behavior as getQuote and cancelInsurance.
	// Create 3 subclasses Car, Pet, Health.
	// Car class has it’s own attribute as carModel and Class Pet has petType
	// attribute.
	// Create 3 objects of the sub classes and store them in ArrayList.
	// Using for loop/advanced for loop/ iterator access all methods of the class.

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {
	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " Insurance Qoute for " + carModel + " is $800/year");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Sorry, " + insuranceName + "!! I am cancelling this crazy insurance....");

	}
}

class Pet extends Insurance {
	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " Insurance Qoute for " + petType + " is $75/month");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Sorry, " + insuranceName + "! I am cancelling pet insurance due to unexpected death! :(");

	}
}

class Health extends Insurance {
	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + "Insurance Qoute for health is $300/month");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Sorry, " + insuranceName + "!! I am cancelling this crazy insurance for a better deal!!");

	}

}
