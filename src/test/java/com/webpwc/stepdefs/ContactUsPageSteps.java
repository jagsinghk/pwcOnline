package com.apivista.cucumberseleniumstarter.google;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import com.apivista.cucumberseleniumstarter.utils.DriverFactory;
import com.apivista.cucumberseleniumstarter.utils.PropertyReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import java.util.List;




public class ContactUsPageSteps{

	private ContactUsPage contactUsPage = new ContactUsPage(new DriverFactory().getDriver());


	@Then("^I select ‘Contact us’ from the hamburger menu$")
        public void clicking_next_to_view_next_3() throws Throwable {
        contactUsPage.clickHamburgerMenu();
        contactUsPage.clickContactUsMenuItem();
    }

    @Then("^I am taken to the ‘Contact us’ page$")
        public void verify_on_contactUsPage() throws Throwable {
        contactUsPage.getTitle();
        assertEquals(contactUsPage.getTitle(),"Contact us - Digital Pulse");
     }

     @Then("^I am presented with the below options for contacts$")
         public void i_am_presented_with_below_option(List<String> contactUsOptionsList) throws Throwable {
            List<String> allContactUsOptions = contactUsPage.getContactUsPageOptions();
            boolean isEqual = allContactUsOptions.equals(contactUsOptionsList);
            assertTrue(isEqual);
     }

}
