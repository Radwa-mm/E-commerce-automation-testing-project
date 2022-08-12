package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D06_homeSlidersStepDef {

    P03_homePage home = new P03_homePage();

    //first scenario
    @When("user clicks on the first home page slider")
    public void clickFirstSlider(){

        home.firstSlider.click();
    }

    @Then("user is directed to the correct first url")
    public void verifyFirstUrl() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020", "the first actual url is not the expected url");
        Hooks.soft.assertAll();
    }

    //second scenario
    @When("user clicks on the second home page slider")
    public void clickSecondSlider(){

        home.secondSlider.click();
    }

    @Then("user is directed to the correct second url")
    public void verifySecondUrl() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6", "the second actual url is not the expected url");
        Hooks.soft.assertAll();
    }


}
