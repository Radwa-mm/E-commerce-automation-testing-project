package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D05_hoverCategoriesStepDef {

    Actions action = new Actions(Hooks.driver);
    P03_homePage home = new P03_homePage();
    ArrayList<WebElement> mainCategories;
    List<WebElement> subCategories;

    int selectedCategory;
    String locator;

    String selectedSubCategoryText;

    @Given("user selects a random category of the three main categories")
    public void selectCategory() {


        mainCategories = new ArrayList<WebElement>();
        mainCategories.add(home.sevenCategories.get(0));
        mainCategories.add(home.sevenCategories.get(1));
        mainCategories.add(home.sevenCategories.get(2));

        for (WebElement link : mainCategories){
            System.out.println(link.getText());
        }

        int min = 0;
        int max = 2;
        selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(selectedCategory);


    }

    @When("user hover on the selected category")
    public void hoverToCategory() throws InterruptedException {
        action.moveToElement(mainCategories.get(selectedCategory)).perform();

        Thread.sleep(1000);

    }

    @And("user click on sub category")
    public void userClickOnSubCategory() {
        selectedCategory = selectedCategory + 1;
        locator = "(//ul[@class='top-menu notmobile']//ul)[" + selectedCategory + "]/li";
        subCategories= Hooks.driver.findElements(By.xpath(locator));

        for (WebElement sub : subCategories){
            System.out.println(sub.getText());
        }
        System.out.println(subCategories.size());
        int subcount = subCategories.size();
        int min = 0;
        int max = subcount-1;
        int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
        selectedSubCategoryText = subCategories.get(selectedSubCategory).getText();
        System.out.println(selectedSubCategoryText);
        subCategories.get(selectedSubCategory).click();
    }


    @Then("sub category page is opened successfully")
    public void openedSubcategory(){
    Hooks.soft.assertEquals(home.pageTitle.getText(), selectedSubCategoryText.toLowerCase().trim(), "page title doesn't match subcategory");

    }


}
