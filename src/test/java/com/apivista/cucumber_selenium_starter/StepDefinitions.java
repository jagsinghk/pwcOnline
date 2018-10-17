package com.apivista.cucumber_selenium_starter;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
private WebDriver webDriver;
private GoogleHomePage googleHomePage;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		webDriver = new ChromeDriver();
		googleHomePage = new GoogleHomePage(webDriver);
	}
	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	@Given("I navigate to the Google homepage")
	public void i_navigate_to_the_Google_homepage() throws InterruptedException {
		googleHomePage.navigateTo();
	}

	@When("I enter {string} into the search bar")
	public void i_enter_into_the_search_bar(String searchString) {
		googleHomePage.enterSearchString(searchString);;
	}

	@When("I press the return key")
	public void i_press_the_return_key() {
		googleHomePage.pressReturnKey();
	}

	@Then("I see the results")
	public void i_see_the_results() {
		assertTrue(googleHomePage.resultsShown());
	}
}
