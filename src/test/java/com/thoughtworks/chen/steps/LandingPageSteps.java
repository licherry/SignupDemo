package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.pages.LandingPage;
import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.java.en.When;

/**
 * Created by chenli on 4/14/16.
 */
public class LandingPageSteps extends DriverFactory {
    @When("^she chooses to sign up$")
    public void she_chooses_to_sign_up() throws Throwable {
        new LandingPage(driver).she_chooses_to_sign_up();
    }
}
