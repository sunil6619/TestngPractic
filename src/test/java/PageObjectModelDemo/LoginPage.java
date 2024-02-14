package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
// without page factory
    WebDriver driver;
// contructor
    LoginPage(WebDriver d){
        driver=d;
    }
//    public void enterusername(String uname){
//        driver.findElement(By.id("user-name")).sendKeys(uname);
//    }
//    public void enterpassword(String pass){
//        driver.findElement(By.id("password")).sendKeys(pass);
//    }
//    public void clicklogin(){
//        driver.findElement(By.id("login-button")).click();
//    }
//

}
