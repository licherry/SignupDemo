package com.thoughtworks.chen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by chenli on 4/14/16.
 */
public class LandingPage {
    WebDriver driver;
    @FindBy(linkText = "Sign up")
    private WebElement signupLink;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void she_chooses_to_sign_up() throws Throwable {
        signupLink.click();
    }
}
