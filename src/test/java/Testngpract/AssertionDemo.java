package Testngpract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
@Test
    public void testMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

    SoftAssert softverify= new SoftAssert();


        driver.get("https://testautomationpractice.blogspot.com/");
        String expectedTitle="Automation Testing Practice1";
        String actualTitle=driver.getTitle();
    softverify.assertEquals(actualTitle,expectedTitle,"Title verification");
    System.out.println("Verifying presence of wiki icon");
   WebElement icon=driver.findElement(By.className("wikipedia-icon"));
    softverify.assertTrue(icon.isDisplayed());
    System.out.println("Verifying presence of wiki search button");
     WebElement searchbutton=driver.findElement(By.className("wikipedia-search-button"));
    softverify.assertTrue(searchbutton.isDisplayed());

    // report all failure messages in case of softassert
    softverify.assertAll();

    }
}
