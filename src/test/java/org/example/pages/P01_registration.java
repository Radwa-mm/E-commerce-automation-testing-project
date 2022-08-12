package org.example.pages;

import io.cucumber.java.en.And;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_registration {

    public P01_registration()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy (className = "ico-register")
    public WebElement registerBtn;

    @FindBy (id = "gender-female")
    public WebElement genderRadio;

    @FindBy (id = "FirstName")
    public WebElement firstNameField;

    @FindBy (id = "LastName")
    public WebElement lastNameField;

    @FindBy (name = "DateOfBirthDay")
    public static WebElement DateOfBirthDay;

    @FindBy (name = "DateOfBirthMonth")
    public static WebElement DateOfBirthMonth;

    @FindBy (name = "DateOfBirthYear")
    public static WebElement DateOfBirthYear;

    @FindBy (id = "Email")
    public WebElement mailField;

    @FindBy (id="Password")
    public WebElement password;

    @FindBy (id="ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy (id="register-button")
    public WebElement finalRegisterBtn;

    @FindBy (className = "result")
    public WebElement successMsg;



}
