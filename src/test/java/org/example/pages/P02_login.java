package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy (className = "ico-login")
    public WebElement loginTab;

    @FindBy(id = "Email")
    public WebElement enterEmailField;

    @FindBy(id = "Password")
    public WebElement enterPasswordField;

    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    public WebElement loginButton0;

    @FindBy (className = "ico-account")
    public WebElement myAccount;

    @FindBy(className = "message-error")
    public WebElement unsuccessfulMsg;

    public void enterCredentialsSteps(String email, String password){

        enterEmailField.sendKeys(email);
        enterPasswordField.sendKeys(password);
    }


}
