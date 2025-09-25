package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

    // Locators
    private By username = By.xpath("//input[@name=\"username\"]");
    private By password = By.xpath("//input[@name=\"password\"]");
    private By loginBtn = By.xpath("//button[@type=\"submit\"]");
    private By errorMsg = By.className("oxd-alert-content-text");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pw) {
        driver.findElement(password).sendKeys(pw);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }

    public DashboardPage loginValidUser(String user, String pw) {
        enterUsername(user);
        enterPassword(pw);
        clickLoginBtn();
        return new DashboardPage(driver);
    }
}
