package com.apivista.cucumberseleniumstarter.google;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;



import com.apivista.cucumberseleniumstarter.utils.DriverFactory;
import com.apivista.cucumberseleniumstarter.utils.PropertyReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageSteps{

	private SearchResultsPage searchResultsPage = new SearchResultsPage(new DriverFactory().getDriver());


    @Then("^I am taken to the search results page$")
        public void i_am_taken_to_search_results() throws Throwable {
        searchResultsPage.getTitle();
    }

    @Then("^I am presented with at least \"(.*?)\" search result$")
        public void i_see_at_least_1_result(String numberOfArticleResult) throws Throwable {
        assertEquals(true,searchResultsPage.getNumberOfResults()>Integer.parseInt(numberOfArticleResult));
    }
}
