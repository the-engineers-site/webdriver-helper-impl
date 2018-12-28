package com.webdriverutils.pages;


import com.automation.executionhelper.IdentifierCollection;
import org.openqa.selenium.By;

public class Login {


    private String userName = "User Name";
    private String password = "Password";
    private String login = "Login";
    private String errorMessage = "Error Message";

    public Login() {
        IdentifierCollection.put(userName, By.id("txtUsername"));
        IdentifierCollection.put(password, By.id("txtPassword"));
        IdentifierCollection.put(login, By.id("btnLogin"));
        IdentifierCollection.put(errorMessage, By.id("spanMessage"));
    }
}
