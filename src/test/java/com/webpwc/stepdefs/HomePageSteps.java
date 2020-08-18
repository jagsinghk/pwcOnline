package com.apivista.cucumberseleniumstarter.google;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import com.apivista.cucumberseleniumstarter.utils.DriverFactory;
import com.apivista.cucumberseleniumstarter.utils.PropertyReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {

	private HomePage homePage = new HomePage(new DriverFactory().getDriver());

	@Given("I navigate to the PwC Digital Pulse website")
	public void i_navigate_to_the_PWC_homepage() throws InterruptedException {
		homePage.navigateTo("https://www.digitalpulse.pwc.com.au/");
	}

	@When("I am viewing the ‘Home’ page")
    public void i_view_the_home_page() throws InterruptedException {
        homePage.getTitle();
        assertEquals(homePage.getTitle(),"Digital Pulse - Disruption, Innovation and Industry Change");
    }

    @Then("^I am presented with a carousel displaying \"(.*?)\" featured articles$")
        public void i_am_presented_with_carousel_containing_3_articles(String numberOfCarousles) throws Throwable {
        homePage.getNumberOfCarousles();
        assertEquals(homePage.getNumberOfCarousles(),numberOfCarousles);
    }

    @Then("^Clicking the ‘Next’ button on the carousel will load the next \"(.*?)\" featured articles$")
        public void clicking_next_to_view_next_3(String numberOfCarousles) throws Throwable {
        homePage.clickNextButtonOnCarousles();
        homePage.getNumberOfCarousles();
        assertEquals(homePage.getNumberOfCarousles(),numberOfCarousles);
    }

    @Then("^Clicking the ‘Previous’ button on the carousel will load the previous \"(.*?)\" featured articles$")
        public void clicking_previous_to_view_previous_3(String numberOfCarousles) throws Throwable {
        homePage.clickPreviousButtonOnCarousles();
        homePage.getNumberOfCarousles();
        assertEquals(homePage.getNumberOfCarousles(),numberOfCarousles);
    }

   @Then("^I click on the ‘Magnifying glass’ icon to perform a search$")
        public void when_user_clicks_on_magnifying_glass() throws Throwable {
        homePage.clickonMagnifyGlass();
    }

  @Then("^I enter the text \"(.*?)\"$")
        public void when_user_enters_text_search_bar(String searchString) throws Throwable {
        homePage.enterTextInSearchBar(searchString);
    }

  @When("^I submit the search$")
        public void when_user_submits_search() throws Throwable {
        homePage.submitSearch();
    }
}
