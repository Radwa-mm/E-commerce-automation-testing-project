package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage home = new P03_homePage();

    //facebook scenario

    @Given("user opens facebook link")
    public void clickFacebook (){
        home.facebook.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void newTab(String url) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        System.out.println("number of tabs:" + tabs.size());

        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println("new tab: " + Hooks.driver.getCurrentUrl());

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url, "url is not as expected");

    }

    //twitter scenario

    @Given("user opens twitter link")
    public void clickTwitter (){
        home.twitter.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    //rss scenario

    @Given("user opens rss link")
    public void clickRss (){
        home.rss.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    //youtube scenario

    @Given("user opens youtube link")
    public void clickYoutube (){
        home.youtube.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }




}
