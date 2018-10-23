package com.apivista.cucumber_selenium_starter;

import static org.junit.Assert.assertTrue;

import com.apivista.cucumber_selenium_starter.sample.GoogleHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends BaseStepDefinitions{

//	private WebDriver webDriver;
	private GoogleHomePage googleHomePage = new GoogleHomePage(driver, wait);
//
//	@Before
//	public void setup() {
//		System.out.println("----------------------------------- Before");
//
//		googleHomePage = new GoogleHomePage(driver, wait);
//	}
//
//	@After
//	public void tearDown() {
//		webDriver.quit();
//	}

	@Given("I navigate to the Google homepage")
	public void i_navigate_to_the_Google_homepage() throws InterruptedException {
		googleHomePage.navigateTo(GoogleHomePage.GOOGLE_HOMEPAGE_URL);
	}

	@When("I enter {string} into the search bar")
	public void i_enter_into_the_search_bar(String searchString) {
		googleHomePage.enterSearchString(searchString);
		;
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
