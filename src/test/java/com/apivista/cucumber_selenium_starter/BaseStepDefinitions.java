package com.apivista.cucumber_selenium_starter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStepDefinitions {
	public WebDriver driver;
	public WebDriverWait wait;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

		// Create a Chrome driver. All test and page classes use this driver.
		driver = new ChromeDriver();

		// Create a wait. All test and page classes use this wait.
		wait = new WebDriverWait(driver, 15);

		// Maximize Window
		driver.manage().window().maximize();
		System.out.println("----------------------------------- Base step");
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
