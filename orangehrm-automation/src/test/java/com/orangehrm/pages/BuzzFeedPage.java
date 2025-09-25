package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuzzFeedPage {
	private WebDriver driver;

    // Locators
    private By postTextArea = By.className("oxd-buzz-post-input"); 
    private By postBtn = By.xpath("//button[@type=\"submit\"]");
    private By latestPost = By.xpath("//*[@id=\"Buzz Newsfeed\"]/div/div[3]/div[1]/div/div[2]/div/p[1]");
    private By likeBtn = By.xpath("//*[@id=\"heart-svg\"]");
    private By commentBtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[3]/div[1]/button[1]/i");
    private By threeDotBtn = By.xpath("//*[@id=\"Buzz Newsfeed\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/li/button");
    private By deletePostBtn = By.xpath("//*[@id=\"Buzz Newsfeed\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/li/ul/li[1]");
    private By editPostBtn = By.xpath("//*[@id=\"Buzz Newsfeed\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/li/ul/li[2]");

    // Constructor
    public BuzzFeedPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void createPost(String text) {
        driver.findElement(postTextArea).sendKeys(text);
        driver.findElement(postBtn).click();
    }

    public String getLatestPost() {
        return driver.findElement(latestPost).getText();
    }

    public void likeLatestPost() {
        driver.findElement(likeBtn).click();
    }

    public void addComment(String text) {
    	driver.findElement(commentBtn).click();
    	
    	Actions action = new Actions(driver);
    	
    	Actions seriseOfActions = action
    			.sendKeys(text)
    			.sendKeys(Keys.ENTER);
    	
    	seriseOfActions.build().perform();
    }

    public void deleteLatestPost() {
    	driver.findElement(threeDotBtn).click();
        driver.findElement(deletePostBtn).click();
        driver.switchTo().alert().accept(); // Confirm delete
    }
}
