package com.thoughtworks.chen.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by chenli on 4/14/16.
 */
public class HomePage {
    WebDriver driver;
    @FindBy(css = "a[href='/users/sign_out']")
    private WebElement signOutLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void she_should_be_logged_into_the_application() throws Throwable {
        boolean signOutLinkDisplayed = signOutLink.isDisplayed();
        Assert.assertTrue(signOutLinkDisplayed);
    }
}
