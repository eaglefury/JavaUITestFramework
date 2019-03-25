package com.ashven.uitestframework.pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    final protected WebDriver driver;
    final protected String baseUrl;

    BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.baseUrl = url;
    }

    public void Navigate()
    {
        driver.get(baseUrl);
    }
    public String GetPageTitle()
    {
        return driver.getTitle();
    }
}
