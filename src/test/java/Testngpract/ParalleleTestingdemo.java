package Testngpract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParalleleTestingdemo {
@Test
    public  void verifytitle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public  void verifylogo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        Assert.assertEquals(driver.getTitle(),"Swag Labs");
       WebElement logo= driver.findElement(By.xpath("//div[@class=\"login_logo\"]"));
       Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(2000);
       driver.quit();
    }




}
