package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		// We can not create an object of interface/ CAN NOT INSTANTIATE!!!
		// WebDriver webdriver = new WebDriver();

		ChromeDriver chr = new ChromeDriver();
		chr.openBrowser();
		chr.closeBrowser();
		chr.maximizeWindow();
		chr.findElement();
		chr.worksFaster();
		chr.SearchHistory();
		chr.screenshot();

		System.out.println("--------------");
		FirefoxDriver obj = new FirefoxDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.worksFaster();
		// obj.SearchHistory();
		obj.screenshot();
		System.out.println("--------------");
		System.out.println("Creating an Object of a class FirefoxDriver by taking reference of an interface (WebDriver)");
		//WebDriver is an interface, driver is a reference variable, FirefoxDriver() is a Constructor,
		//new is a keyword, and new FirefoxDriver() is an Object.
		
		WebDriver ffDriver=new FirefoxDriver();
		ffDriver.openBrowser();
		ffDriver.closeBrowser();
		ffDriver.maximizeWindow();
		ffDriver.findElement();
	//	ffDriver.worksFaster(); undefined for WebDriver Interface
	//	ffDriver.SearchHistory();  undefined for WebDriver Interface
	//	ffDriver.screenshot();  undefined for WebDriver Interface
		System.out.println("--------------");
		System.out.println("Creating an Object of a class ChromeDriver by taking reference of an interface (WebDriver)");
		WebDriver chrDriver=new ChromeDriver();
		chrDriver.openBrowser();
		chrDriver.closeBrowser();
		chrDriver.maximizeWindow();
		chrDriver.findElement();
	//	chrDriver.worksFaster();  undefined for WebDriver Interface
	//	chrDriver.SearchHistory();   undefined for WebDriver Interface
	//	chrDriver.screenshot();  undefined for WebDriver Interface

	}

}
