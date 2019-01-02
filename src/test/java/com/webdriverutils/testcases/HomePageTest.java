package com.webdriverutils.testcases;

import com.webdriverutils.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.automation.uiactionshelper.ElementActions.getText;
import static com.automation.uiactionshelper.KeyBoardActions.clear;
import static com.automation.uiactionshelper.KeyBoardActions.type;
import static com.automation.uiactionshelper.MouseActions.click;

public class HomePageTest extends BaseTest {

    @Test
    public void HomePageCheck() {
        clear("User Name");
        type("User Name", "Admin");
        clear("Password");
        type("Password", "admin123");
        click("Login", HomePage.class);
        Assert.assertEquals(getText("Assign Leave"), "Assign Leave", "Assign Leave label validation");
        click("Time Menu");
        click("Leave Menu");
        click("HomePage Holder");
        click("Logout");
    }


}
