package com.webdriverutils.testcases;

import com.automation.browser.Browser;
import com.automation.uiactionshelper.ElementActions;
import com.webdriverutils.pages.Login;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCases extends ElementActions {

    Login login;

    @AfterSuite
    public void endTest() {
        Browser.getInstance().quit();
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("WEBDRIVER_HELPER_CONFIG", "automation-config.properties");
        login = new Login();
    }


    @Test
    public void validationMessagePassword() {
        type("User Name", "Admin");
        click("Login");
        String errorMessage = getText("Error Message");
        Assert.assertEquals(errorMessage, "Password cannot be empty");
    }


    @Test
    public void validationMessageUser() {
        clear("User Name");
        type("Password", "admin123");
        click("Login");
        String errorMessage = getText("Error Message");
        Assert.assertEquals(errorMessage, "Username cannot be empty");
    }

}
