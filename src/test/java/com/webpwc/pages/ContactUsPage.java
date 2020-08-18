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

public class ContactUsPage extends BasePage {

    private String hamBurgerMenuLocator = "//i[@class='btr bt-bars trigger']";
    private String contactUsLinkLocator = "menu-item-65";
    private String allContactUsHeadingsLocator = "//div[@class='span_3']//h2";

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

    public void clickHamburgerMenu() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(hamBurgerMenuLocator)));
        driver.findElement(By.xpath(hamBurgerMenuLocator)).click();
    }

    public String clickContactUsMenuItem() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(contactUsLinkLocator)));
        driver.findElement(By.id(contactUsLinkLocator)).click();
        return driver.getTitle();
    }

    public List<String> getContactUsPageOptions() {
        ArrayList<String> allContactUsOption=new ArrayList<String>();
        List<WebElement> elements = driver.findElements(By.xpath(allContactUsHeadingsLocator));
        for(WebElement e : elements) {
            System.out.println(e.getText().replace("\n"," "));
            allContactUsOption.add(e.getText().replace("\n"," "));
        }
        return allContactUsOption;
    }
}
