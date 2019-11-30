package com.class26;

public class WebDriverTest {

	public static void main(String[] args) {
			ChromeDriver chrome=new ChromeDriver();
			chrome.open();
			chrome.refresh();
			
			FirefoxDriver firefox=new FirefoxDriver();
			firefox.open();
			firefox.refresh();
			
			// creating an object of child class given reference to the parent
			WebDriver driver=new ChromeDriver();
			driver.open();
			driver.refresh();
			
			WebDriver driver1=new FirefoxDriver();
			driver.open();
			driver.refresh();
	//		driver.getTitle();// no access to child specific class through Parent Type
		
	}

}
