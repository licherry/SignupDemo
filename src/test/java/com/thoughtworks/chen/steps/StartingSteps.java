package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


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
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current URL is " + driver.getCurrentUrl());
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException e) {
                System.err.println(e.getMessage());
            }
        }
        new DriverFactory().destroyDriver();
    }

    @Given("^the user is on landing page$")
    public void setUp() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }

}
