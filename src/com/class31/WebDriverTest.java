package com.class31;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.takesScreen();

		TakesScreenshot ts=new ChromeDriver();
		ts.openBrowser();
		ts.closeBrowser();
		ts.maximazeWindow();
		ts.findElement();
		ts.takesScreen();
	}

}
