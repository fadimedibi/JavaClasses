package com.class31_;
//Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. 

//After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 
//Requirements: 

//Valid email consider to be only gmail
//Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
public class Registration {
	private String email, userName, password;

//setter
	public void setEmail(String email) {
		if (email.contains("gmail")) {
			this.email = email;
		} else {
			System.out.println("Invalid email type. Email must be gmail!");
		}
	}

	// getter
	public String getEmail() {
		return email;

	}

//setter
	public void setUserName(String userName) {
		if (userName.isEmpty()) {
			System.out.println("Invalid user name!");
		} else {
			if (userName.length() <= 6) {
				System.out.println("User name should be longer, Please try again!!");
			} else {
				this.userName = userName;
			}
		}
	}

	// getter
	public String getUserName() {
		return userName;
	}

//setter
	public void setPassword(String password) {
		if (password.isEmpty()) {
			System.out.println("Invalid password!");
		} else {
			if (password.length() <= 6) {
				System.out.println("Password should be longer, Please try again!!");
			} else if (password.contains(userName)) {
				System.out.println("Password MUST NOT be contains user name");
			} else {
				this.password = password;
			}
		}

	}

	// getter
	public String getPassword() {
		return password;
	}

}
