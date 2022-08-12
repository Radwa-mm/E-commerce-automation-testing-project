package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    public static SoftAssert soft;

   @Before

    public static void openBrowser()
   {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aratech\\IdeaProjects\\FinalProject\\src\\main\\resources\\chromedriver.exe");
       driver = new ChromeDriver();
       soft = new SoftAssert();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.navigate().to("https://demo.nopcommerce.com/");

   }

   @After

    public static void closeBrowser() throws InterruptedException {

       Thread.sleep(3000);
       driver.quit();
   }
}
