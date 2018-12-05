package com.webdriverutils.pages;


import com.automation.executionhelper.IdentifierCollection;
import org.openqa.selenium.By;

public class Login {


    private String userName = "User Name";
    private String password = "Password";
    private String login = "Login";
    private String errorMessage = "Error Message";

    public Login() {
        IdentifierCollection.identifierCollection.put(userName, By.id("txtUsername"));
        IdentifierCollection.identifierCollection.put(password, By.id("txtPassword"));
        IdentifierCollection.identifierCollection.put(login, By.id("btnLogin"));
        IdentifierCollection.identifierCollection.put(errorMessage, By.id("spanMessage"));
    }
}
