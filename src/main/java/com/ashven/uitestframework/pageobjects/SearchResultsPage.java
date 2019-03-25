package com.ashven.uitestframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {super(driver, null);}
    {
        PageFactory.initElements(driver, this);
    }
}
