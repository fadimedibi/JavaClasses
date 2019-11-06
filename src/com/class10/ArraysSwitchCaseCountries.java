package com.class10;

public class ArraysSwitchCaseCountries {

	public static void main(String[] args) {

		String[] country = { "France", "Turkey", "US", "Germany" };
		for (int i = 0; i < country.length; i++) {
			switch (country[i]) {
			case "France":
				System.out.println("Paris");
				break;
			case "US":
				System.out.println("DC");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			
			}
		}
	}

}
