package com.class12;

import java.util.Scanner;

public class HomeworkUserNamePassword {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements: Username and Password cannot be empty, if so→ message=“Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=“Password is too short”. Password cannot contain username if
		 * so, → message=“Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		String userName = scan.nextLine();
		System.out.println("Please enter your password");
		String password = scan.nextLine();
		System.out.println("Please confirm your password");
		String confirm = scan.nextLine();
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("User Name and Password can not be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password can not contain User Name");
		} else if (!confirm.equals(password)) {
			System.out.println("Password does not match");
		} else {
			System.out.println("Your User Name and Password have been created!");
		}

	}

}
