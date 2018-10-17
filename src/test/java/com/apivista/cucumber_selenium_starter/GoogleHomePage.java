package com.apivista.cucumber_selenium_starter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	private WebDriver driver;
	private static final By searchInput = By.name("q");
	private static final By searchResults = By.id("search");
	
	public GoogleHomePage(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	public void navigateTo() {
		driver.get("https://www.google.com");
	}
	
	public void enterSearchString(String searchString) {
		WebElement element = driver.findElement(searchInput);
		element.sendKeys(searchString);
	}
	
	public void pressReturnKey() {
		WebElement element = driver.findElement(searchInput);
		element.sendKeys(Keys.RETURN);
	}
	
	public boolean resultsShown() {
		WebElement element = driver.findElement(searchResults);
		return element.isDisplayed();
	}
}
