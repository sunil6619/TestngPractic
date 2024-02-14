//package HeadLessBrowserTesting;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.checkerframework.checker.units.qual.C;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//public class HeadlessBrowserDemo {
//@Test
//    public  void googlesearch() throws InterruptedException {
//        // for chrome
//        WebDriverManager.chromedriver().setup();
////        ChromeOptions options= new ChromeOptions();
////        options.addArguments("headless");
////        WebDriver driver= new ChromeDriver(options);
//        WebDriver driver= new ChromeDriver();
//        Reporter.log("Browser launched");
////        ---------------------------------------
//        // for firefox
////        WebDriverManager.firefoxdriver().setup();
////        FirefoxOptions options= new FirefoxOptions();
////        options.addArguments("--headless");
////        WebDriver driver= new FirefoxDriver(options);
//        driver.get("https://www.google.com/");
//        Reporter.log("URl launched");
//        System.out.println("Before search: "+driver.getTitle());
//        WebElement searchbox=driver.findElement(By.name("q"));
//        searchbox.sendKeys("India Gate");
//        Reporter.log("keyword entered");
//        searchbox.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//        System.out.println("After search: "+driver.getTitle());
//        Thread.sleep(3000);
//        driver.quit();
//
//    }
//}
