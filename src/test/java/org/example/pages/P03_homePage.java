package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {

    public P03_homePage()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy (id = "customerCurrency")
    public static WebElement currenciesList;

    //list
    @FindBy (className = "price")
    public List<WebElement> elements;

    @FindBy (xpath = "//div[@class=\"product-grid home-page-product-grid\"]")
    public static WebElement items;



    //search feature locators
    @FindBy (css = "a[href=\"/search\"]")
    public WebElement searchPage;

    @FindBy (id = "q")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class=\"button-1 search-button\"]")
    public WebElement searchBtn;

    @FindBy (className = "product-item")
    public List<WebElement> searchResults;

    @FindBy (className = "item-box")
    public WebElement searchResult;

    @FindBy(css = "div[class=\"sku\"] >span[class=\"value\"]")
    public WebElement resultSku;


    //hover feature locators

//    @FindBy (linkText = "Computers")
//    public WebElement computersCat;
//
//    @FindBy (linkText = "Electronics")
//    public WebElement electronicsCat;
//
//    @FindBy (linkText = "Apparel")
//    public WebElement apparelCat;

    @FindBy (xpath = "//ul[@class=\"top-menu notmobile\"]/li")
    public List<WebElement> sevenCategories;


    @FindBy (css = "div[class=\"page-title\"] h1")
    public WebElement pageTitle;


    //sliders feature locators

    @FindBy (xpath = "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]//parent::a")
    public WebElement firstSlider;

    @FindBy (xpath = "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]//parent::a")
    public WebElement secondSlider;

    //follow us locators

    @FindBy (xpath = "//a[@href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebook;

    @FindBy (xpath = "//a[@href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitter;

    @FindBy (xpath = "//a[@href=\"/news/rss/1\"]")
    public WebElement rss;

    @FindBy (xpath = "//a[@href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtube;


    // wishlist locators
    @FindBy (xpath = "//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]")
    public WebElement wishlistBtn;

    @FindBy (className = "content")
    public WebElement success;

    @FindBy (css = "div[class=\"bar-notification success\"]")
    public WebElement msgBackground;

    @FindBy (className = "wishlist-label")
    public WebElement wishlistTab;

    @FindBy (className = "qty-input")
    public WebElement quantity;







}
