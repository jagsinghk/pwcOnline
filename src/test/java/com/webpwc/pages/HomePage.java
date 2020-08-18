package com.apivista.cucumberseleniumstarter.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import org.openqa.selenium.Keys;
import com.apivista.cucumberseleniumstarter.BasePage;

public class HomePage extends BasePage {

    private String carousleLocator = "//li[@class='flex flex-active-slide']//h2";
    private String nextCarousleButtonLocator = "//a[@class='flex-next']";
    private String prevCarousleButtonLocator = "//a[@class='flex-prev']";
    private String magnifyGlassLocator = "//i[@class='btr bt-search']";
    private String searchInputLocator = "search-input";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getNumberOfCarousles() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(carousleLocator)));
        List<WebElement> elements = driver.findElements(By.xpath(carousleLocator));
        return Integer.toString(elements.size());
    }

    public void clickNextButtonOnCarousles() {
        driver.findElement(By.xpath(nextCarousleButtonLocator)).click();
    }

    public void clickPreviousButtonOnCarousles() {
        driver.findElement(By.xpath(prevCarousleButtonLocator)).click();
    }

    public void clickonMagnifyGlass() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(magnifyGlassLocator)));
        driver.findElement(By.xpath(magnifyGlassLocator)).click();
    }

    public void enterTextInSearchBar(String input) {
        driver.findElement(By.id(searchInputLocator)).sendKeys(input);
    }

    public void submitSearch() {
        driver.findElement(By.id(searchInputLocator)).sendKeys(Keys.RETURN);
    }
}
