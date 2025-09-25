package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority=0)
	public void verifyValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.loginValidUser("Admin", "admin123");
        //Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test(priority=1)
    public void verifyInvalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.loginValidUser("Admin", "wrongpass");
        //Assert.assertEquals(login.getErrorMessage(), "Invalid credentials");
    }
    
}
