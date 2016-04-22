package com.thoughtworks.chen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by chenli on 4/22/16.
 */
public class LoginPage {
    WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement emailTextBox;

    @FindBy(id = "user_password")
    private WebElement passwordTextBox;

    @FindBy(name = "commit")
    private WebElement signinButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void sheInputsEmailAs(String email) throws Throwable {
        emailTextBox.sendKeys(email);
    }

    public void sheInputsPasswordAs(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }
    public void sheSignsIn() throws Throwable {
        signinButton.click();
    }
}
