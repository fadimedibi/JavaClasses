package com.class30;

public interface WebDriver {

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

interface TakesScreenshot {
	void screenshot();
}

class ChromeDriver implements WebDriver, TakesScreenshot {

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open a new tab ");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close a tab ");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize window ");
	}

	@Override
	public void findElement() {
		System.out.println("You can find an element at Chrome ");
	}

	public void worksFaster() {
		System.out.println("Chrome works faster on desktop ");
	}

	public void SearchHistory() {
		System.out.println("You can reach your search history in Chrome ");
	}

	@Override
	public void screenshot() {
		System.out.println("You can take a screenshot with Chrome");

	}

}

class FirefoxDriver implements WebDriver, TakesScreenshot {

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open a new tab ");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox can close a tab ");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize window ");

	}

	@Override
	public void findElement() {
		System.out.println("You can find an element at Firefox ");

	}

	public void worksFaster() {
		System.out.println("Firefox works faster on mobile ");
	}

	@Override
	public void screenshot() {
		System.out.println("You can take a screenshot with Firefox");

	}

}