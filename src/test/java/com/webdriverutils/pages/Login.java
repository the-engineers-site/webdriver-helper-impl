package com.webdriverutils.pages;

import com.automation.finders.ElementFinder;
import com.webdriverutils.runcontext.RunContext;
import org.openqa.selenium.By;

public class Login {


    private String userName = "User Name";
    private String password = "Password";
    private String login = "Login";
    private String errorMessage = "Error Message";

    public Login() {
        RunContext.ElementCollection.put(userName, By.id("txtUsername"));
        RunContext.ElementCollection.put(password, By.id("txtPassword"));
        RunContext.ElementCollection.put(login, By.id("btnLogin"));
        RunContext.ElementCollection.put(errorMessage, By.id("spanMessage"));
    }
}
