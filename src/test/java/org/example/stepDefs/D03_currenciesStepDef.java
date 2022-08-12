package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage();
    JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;

    @Given("user clicks on currency dropdown list")
    public void clickCurrenciesList(){
        home.currenciesList.click();

    }

    @When("user elect Euro currency from the dropdown list")
    public void selectCurrency(){
        Select currency = new Select(home.currenciesList);
        currency.selectByVisibleText("Euro");
    }

    @Then("Euro Symbol is shown on the 4 products displayed in Home page")
    public void currencyChanged() throws InterruptedException {

        js.executeScript("arguments[0].scrollIntoView();", home.items);

        Thread.sleep(2000);

        for (WebElement element : home.elements){

            System.out.println(element.getText());
            Assert.assertTrue(element.getText().contains("€"),"euro symbol is not displayed");


    }
    }
}
