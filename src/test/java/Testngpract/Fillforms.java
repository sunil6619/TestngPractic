//package Testngpract;
//
//import com.beust.ah.A;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//public class Fillforms {
//
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
////        driver.findElement(By.id("user-name")).sendKeys("standard_user");
////        driver.findElement(By.id("password")).sendKeys("secret_sauce");
////        driver.findElement(By.id("login-button")).submit();
//
//        //  fill form in single statment using Actions class
//        Actions act= new Actions(driver);
//        Action seriesofaction=act.moveToElement(driver.findElement(By.id("user-name"))).click()
//                        .sendKeys("standard_user", Keys.TAB).sendKeys("secret_sauce",Keys.ENTER).build();
//        seriesofaction.perform();
//        driver.quit();
//    }
//}
