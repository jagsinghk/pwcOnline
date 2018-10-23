package com.apivista.cucumber_selenium_starter.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apivista.cucumber_selenium_starter.BasePage;

public class GoogleHomePage extends BasePage{
	public static final String GOOGLE_HOMEPAGE_URL = "https://www.google.com";
	private static final By SEARCH_INPUT = By.name("q");
	private static final By SEARCH_RESULTS = By.id("search");

	public GoogleHomePage(WebDriver webDriver, WebDriverWait wait) {
		super(webDriver, wait);
		System.out.println("----------------------------------- Google page constructor");

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
