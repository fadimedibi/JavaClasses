package com.class19;

public class Task {

	String createEmail(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + "@" + emailType + "com";
		return email;
	}

	boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	
	public static void main(String[] args) {
		Task obj = new Task();
		String email = obj.createEmail("Ferhat", "Dibi", "gmail");
		System.out.println(email.toLowerCase());

		boolean prime = obj.isPrime(79);
		System.out.println(prime);
	}
}
