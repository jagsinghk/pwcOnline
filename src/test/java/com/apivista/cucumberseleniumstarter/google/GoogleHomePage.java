package com.apivista.cucumberseleniumstarter.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apivista.cucumberseleniumstarter.BasePage;

public class GoogleHomePage extends BasePage {
	@FindBy(name = "q")
	private WebElement searchInput;
	@FindBy(id = "search")
	private WebElement searchResults;

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}

	public void enterSearchString(String searchString) {
		searchInput.sendKeys(searchString);
	}

	public void pressReturnKey() {
		searchInput.sendKeys(Keys.RETURN);
	}

	public boolean resultsShown() {
		return searchResults.isDisplayed();
	}
}
