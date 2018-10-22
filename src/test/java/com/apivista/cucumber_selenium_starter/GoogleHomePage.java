package com.apivista.cucumber_selenium_starter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	private WebDriver driver;
	private static final String GOOGLE_HOMEPAGE_URL = "https://www.google.com";
	private static final By SEARCH_INPUT = By.name("q");
	private static final By SEARCH_RESULTS = By.id("search");

	public GoogleHomePage(WebDriver webDriver) {
		this.driver = webDriver;
	}

	public void navigateTo() {
		driver.get(GOOGLE_HOMEPAGE_URL);
	}

	public void enterSearchString(String searchString) {
		WebElement element = driver.findElement(SEARCH_INPUT);
		element.sendKeys(searchString);
	}

	public void pressReturnKey() {
		WebElement element = driver.findElement(SEARCH_INPUT);
		element.sendKeys(Keys.RETURN);
	}

	public boolean resultsShown() {
		WebElement element = driver.findElement(SEARCH_RESULTS);
		return element.isDisplayed();
	}
}
