package com.webdriverutils.helper;

import com.automation.ElementActionsHelper.UIActions;
import com.webdriverutils.runcontext.RunContext;
import org.openqa.selenium.By;

public class ElementActions extends UIActions {

    public static void sendKeys(String eleName, String text) {
        By element = RunContext.ElementCollection.get(eleName);
        sendKeys(element, text);
    }

    public static void click(String eleName) {
        click(RunContext.ElementCollection.get(eleName));
    }

    public static String getText(String eleName) {
        return getText(RunContext.ElementCollection.get(eleName));
    }


    public static void clear(String element) {
        clear(RunContext.ElementCollection.get(element));
    }
}
