package com.apivista.cucumber_selenium_starter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		System.out.println("----------------------------------- Base page constructor");
		this.driver = driver;
		this.wait = wait;
	}

	public void navigateTo(String url) {
		System.out.println("----------------------------------- URL:"+url);


		driver.get(url);
	}

	// Click Method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}

	// Write Text
	public void enterText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}

	// Read Text
	public String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}
}
