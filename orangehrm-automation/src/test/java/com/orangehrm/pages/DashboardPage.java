package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	private WebDriver driver;

    // Locators
    //private By welcomeMsg = By.id("welcome");
    private By buzzOption = By.xpath("//span[text()=\"Buzz\"]");

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    /*public String getWelcomeMessage() {
        return driver.findElement(welcomeMsg).getText();
    }*/

    public BuzzFeedPage goToBuzzFeedPage() {
        driver.findElement(buzzOption).click();
        return new BuzzFeedPage(driver);
    }
}
