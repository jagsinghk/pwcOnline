package com.apivista.cucumberseleniumstarter.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import com.apivista.cucumberseleniumstarter.BasePage;

public class SearchResultsPage extends BasePage {

    private String resultsContainerLocator = "//section[@class='container content main-content padding']";
    private String articlesLocator = "//span[@class='article-type']";


	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public void isOnSearchResultsPage() {
        driver.findElement(By.xpath(resultsContainerLocator));
	}

    public int getNumberOfResults() {

        List<WebElement> elements = driver.findElements(By.xpath(articlesLocator));
        return elements.size();

    }
}
