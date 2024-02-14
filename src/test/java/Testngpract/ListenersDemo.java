package Testngpract;

import org.testng.annotations.Test;//package Testngpract;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Testngpract.Listenersclass.class)
public class ListenersDemo {
//@Test
//    public void login() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://qa.rugartisan.com/");
//    driver.manage().window().maximize();
//    WebElement ignore=	driver.findElement(By.xpath("//butoon[contains(text(),'Ignore')]"));
//
//    ignore.click();
//    driver.findElement(By.xpath("//a[@class=\"phpdebugbar-close-btn\"]")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath(" //ul[@class=\"links\"]/li/span[text()='Sign in']")).click();
//    Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sunil.suri1101@gmail.com");
//        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("147852");
//        driver.findElement(By.xpath("//button[@id=\"btn-submit\"]")).click();
//        Assert.assertEquals(driver.getTitle(),"Luxury Custom Area Rugs Online In USA | Custom Rug Sizes | Custom Size Area Rugs In Any Size, Shape, Design &amp; Color | Rug Artisan");
//
//
//    }
@Test
public  void testpass(){
    System.out.println("Passed test case");
    Assert.assertTrue(true);
}
//
    @Test
    public  void testfail(){
    System.out.println("Failed test case");
    Assert.assertTrue(false);
    }

    @Test
    public  void skipfail(){
        System.out.println("skip test case");
        throw new SkipException("skip exception throw");
    }
}
