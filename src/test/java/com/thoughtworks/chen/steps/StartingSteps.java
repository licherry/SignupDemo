package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


import java.util.concurrent.TimeUnit;

/**
 * Created by chenli on 4/14/16.
 */
public class StartingSteps extends DriverFactory {


    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    @Given("^the user is on landing page$")
    public void setUp() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }

}
