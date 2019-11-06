package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
		// verify if button is displayed on the page
		// if button is displayed then we need to verify text on
		//if text equal to sign in----->test case passs
		//otherwise----->wrong text is displayed
		
		boolean isDisplayed=true;
		String buttonText="Sign In" ;
		
		if (isDisplayed) {
			System.out.println("Button is displayed");
			
			if(buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			}else {
				System.out.println("Wrong text is displayed");
			}
						
		}else {
			System.out.println("Button is not displayed");
		}
		
			
			
		}

	}

