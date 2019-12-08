package com.class31_;
//Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. 

//After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 
//Requirements: 

//Valid email consider to be only gmail
//Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
public class Registration {
	private String email, userName, password;

//getter
	public String getEmail() {
		return email;

	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

//setter
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public void setUserName(String newUserName) {
		if (newUserName.isEmpty()) {
			System.out.println("Invalid user name!");
		} else {
			if (newUserName.length() <= 6) {
				System.out.println("User name should be longer, Please try again!!");
			} else {
				userName = newUserName;
			}
		}
	}

	public void setPassword(String newPassword) {
		if (newPassword.isEmpty()) {
			System.out.println("Invalid password!");
		} else {
			if (newPassword.length() <= 6) {
				System.out.println("Password should be longer, Please try again!!");
			} else if (newPassword.contains(userName)) {
				System.out.println("Password MUST NOT be contains user name");
			} else {
				password = newPassword;
			}
		}

	}
}
