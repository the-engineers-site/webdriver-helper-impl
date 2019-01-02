package com.webdriverutils.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.automation.uiactionshelper.ElementActions.getText;
import static com.automation.uiactionshelper.KeyBoardActions.clear;
import static com.automation.uiactionshelper.KeyBoardActions.type;
import static com.automation.uiactionshelper.MouseActions.click;

public class LoginTestCases extends BaseTest {

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
