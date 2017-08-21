package com.thoughtworks.chen.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chenli on 4/14/16.
 */
public class DriverFactory {
    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    private void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "tools/webdriver/chromedriver_2.31");
            driver = new ChromeDriver();
        } else if (browser.equals("firfox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("can't read browser type");
        }

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }


}
