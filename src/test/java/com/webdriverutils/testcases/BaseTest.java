package com.webdriverutils.testcases;

import com.automation.browser.Browser;
import com.webdriverutils.pages.Login;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private Login login;

    @AfterSuite
    public void endTest() {
        Browser.getInstance().quit();
    }

    @BeforeSuite
    public void beforeClass() {
        System.setProperty("WEBDRIVER_HELPER_CONFIG", "automation-config.properties");
        login = new Login();
    }
}
