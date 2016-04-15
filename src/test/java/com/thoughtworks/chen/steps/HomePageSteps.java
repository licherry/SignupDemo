package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.pages.HomePage;
import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.java.en.Then;

/**
 * Created by chenli on 4/14/16.
 */
public class HomePageSteps extends DriverFactory {
    @Then("^she should be logged in to the application$")
    public void she_should_be_logged_into_the_application() throws Throwable {
        new HomePage(driver).she_should_be_logged_into_the_application();
    }
}
