package com.thoughtworks.chen.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by chenli on 4/15/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-reports","json:target/cucumber-report.json"},
        glue = "com/thoughtworks/chen/steps",
        features = "classpath:features/"
)
public class RunFeatures {
}
