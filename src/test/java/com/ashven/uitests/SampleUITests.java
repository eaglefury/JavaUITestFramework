package com.ashven.uitests;

import com.ashven.uitestframework.pageobjects.HomePage;
import com.ashven.uitestframework.pageobjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class SampleUITests extends TestBase {

    private final String HOMEPAGE_TITLE_TEXT = "Best Buy Canada";

    @Test
    public void ValidateBestBuyHomePage()
    {
        HomePage homePage = new HomePage(this.driver);
        homePage.Navigate();
        Assert.assertTrue(homePage.GetPageTitle().contains(HOMEPAGE_TITLE_TEXT));
        SearchResultsPage page = homePage.Search("TV");
    }
}
