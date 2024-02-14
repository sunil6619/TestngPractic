package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

    // using page factory

    WebDriver driver;
    LoginPage2(WebDriver d)
    {
        driver=d;
        // this method will create web Elements
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement pass;
    @FindBy(id="login-button")
    WebElement login;

    public void enterusername(String uname){
//       username.sendKeys(uname);
    }
    public void enterpassword(String pwd){
//        pass.sendKeys(pwd);
    }
    public void clicklogin(){
        login.click();
    }

}
