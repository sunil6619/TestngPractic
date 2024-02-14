package PageObjectModelDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // create object of Loginpage
//        LoginPage loginpg= new LoginPage(driver);
        LoginPage2 loginpg= new LoginPage2(driver);
        driver.get("https://www.saucedemo.com/");
        loginpg.enterusername("standard_user");
        loginpg.enterpassword("secret_sauce");
        loginpg.clicklogin();

    }
}
