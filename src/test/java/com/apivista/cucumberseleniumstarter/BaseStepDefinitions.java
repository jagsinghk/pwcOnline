package com.apivista.cucumberseleniumstarter;

import org.openqa.selenium.WebDriver;

import com.apivista.cucumberseleniumstarter.utils.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStepDefinitions {
	private WebDriver driver;

	@Before
	public void setup() {
		DriverFactory df = new DriverFactory();
		driver = df.getDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
