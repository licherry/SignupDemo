package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.pages.SignInPage;
import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

/**
 * Created by chenli on 4/20/16.
 */
public class SignInPageSteps extends DriverFactory{
    @When("^she inputs email as \"([^\"]*)\"$")
    public void she_inputs_email_as(String email) throws Throwable {
        new SignInPage(driver).sheInputsEmailAs(email);
    }

    @And("^she inputs password as \"([^\"]*)\"$")
    public void she_inputs_password_as(String password) throws Throwable {
        new SignInPage(driver).sheInputsPasswordAs(password);
    }

    @And("^she signs-in$")
    public void she_sign_in() throws Throwable {
        new SignInPage(driver).sheSignsIn();
    }
}
