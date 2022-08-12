package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_registration;

import org.openqa.selenium.support.ui.Select;

public class D01_registrationStepDef {
    P01_registration registration = new P01_registration();

    @Given("user goes to registration page")
    public void RegistrationPage()
    {
        //System.out.println("This is a test before start coding");
        registration.registerBtn.click();
    }

    @When("user select gender type")
    public void genderType(){
        //System.out.println("user select gender type");
        registration.genderRadio.click();

    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void name(){
        registration.firstNameField.sendKeys("automation");
        registration.lastNameField.sendKeys("tester");

    }
    @And("user enter date of birth")
    public void birthDate(){
        Select dropDay = new Select(registration.DateOfBirthDay);
        dropDay.selectByVisibleText("29");

        Select dropMonth = new Select(registration.DateOfBirthMonth);
        dropMonth.selectByVisibleText("March");

        Select dropYear = new Select(registration.DateOfBirthYear);
        dropYear.selectByVisibleText("1990");


    }

    @And("user enter email \"test@example.com\" field")
    public void mail (){
        registration.mailField.sendKeys("test@example.com");

    }

    @And ("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void passwords(){
        registration.password.sendKeys("P@ssw0rd");
        registration.ConfirmPassword.sendKeys("P@ssw0rd");


    }

    @And("user clicks on register button")
    public void clickRegister(){
        registration.finalRegisterBtn.click();

    }
    @Then("success message is displayed")
    public void successMsg(){
        Hooks.soft.assertTrue(registration.successMsg.getText().contains("Your registration completed"), "First Assertion Failed, no MSG");
        Hooks.soft.assertEquals(registration.successMsg.getCssValue("color"), "rgba(76, 177, 124, 1)", "Second Assertion Failed" );
        System.out.printf(registration.successMsg.getCssValue("color"));
    }

}
