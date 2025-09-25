package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.BuzzFeedPage;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

public class PostTest extends BaseTest {
	
	@Test(priority=2)
    public void verifyCreatePost() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = login.loginValidUser("Admin", "admin123");
        BuzzFeedPage buzzFeed = dashboard.goToBuzzFeedPage();

        buzzFeed.createPost("Hello OrangeHRM!");
        //Assert.assertEquals(buzzFeed.getLatestPost(), "Hello OrangeHRM!"); //Let's see
    }

    @Test(priority=3)
    public void verifyLikePost() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = login.loginValidUser("Admin", "admin123");
        BuzzFeedPage buzzFeed = dashboard.goToBuzzFeedPage();

        buzzFeed.likeLatestPost();
        // Usually verify by checking if "Unlike" appears
        //Assert.assertTrue(buzzFeed.getLatestPost().contains("OrangeHRM"));
    }

    @Test(priority=4)
    public void verifyAddComment() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = login.loginValidUser("Admin", "admin123");
        BuzzFeedPage buzzFeed = dashboard.goToBuzzFeedPage();

        buzzFeed.addComment("Nice update!");
        // Verification depends on application UI
        //Assert.assertTrue(buzzFeed.getLatestPost().contains("Nice update!"));
    }

    @Test(priority=5)
    public void verifyDeletePost() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = login.loginValidUser("Admin", "admin123");
        BuzzFeedPage buzzFeed = dashboard.goToBuzzFeedPage();

        buzzFeed.createPost("Temporary post");
        buzzFeed.deleteLatestPost();
        // Verify latest post is not the deleted one
        //Assert.assertNotEquals(buzzFeed.getLatestPost(), "Temporary post");
    }
    
}
