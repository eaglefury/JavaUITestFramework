package com.ashven.uitestframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(className = "navigation-search-box")
    private WebElement searchBox;

    @FindBy(className = "navigation-search-button")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {super(driver, "http://www.bestbuy.ca");}
    {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage Search(String searchTerm)
    {
        searchBox.sendKeys(searchTerm);
        searchButton.click();
        return new SearchResultsPage(driver);
    }
}
