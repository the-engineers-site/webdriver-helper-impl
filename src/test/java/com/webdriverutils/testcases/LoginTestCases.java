package com.webdriverutils.testcases;

import com.automation.browser.Driver;
import com.webdriverutils.helper.ElementActions;
import com.webdriverutils.pages.Login;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCases {

    Login login;

    @AfterSuite
    public void endTest() {
        Driver.getInstance().quit();
    }

    @BeforeClass
    public void beforeClass() {
        login = new Login();
    }


    @Test
    public void validationMessagePassword() {
        ElementActions.sendKeys("User Name", "Admin");
        ElementActions.click("Login");
        String errorMessage = ElementActions.getText("Error Message");
        Assert.assertEquals(errorMessage, "Password cannot be empty");
    }


    @Test
    public void validationMessageUser() {
        ElementActions.clear("User Name");
        ElementActions.sendKeys("Password", "admin123");
        ElementActions.click("Login");
        String errorMessage = ElementActions.getText("Error Message");
        Assert.assertEquals(errorMessage, "Username cannot be empty");
    }

}
