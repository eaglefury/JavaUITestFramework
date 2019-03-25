package com.ashven.uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected WebDriver driver;
    @BeforeClass
    public void BeforeClass()
    {
        //TODO : Add readme instructions to add to path variable
        // on agent and this line can be deleted to make platform agnostic
        System.setProperty("webdriver.gecko.driver", "C:\\Utils\\geckodriver.exe");

        //TODO: Get the driver for specific driver from properties configuration
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void AfterClass()
    {
        if (driver !=null)
        {
            driver.close();
        }
    }
}
