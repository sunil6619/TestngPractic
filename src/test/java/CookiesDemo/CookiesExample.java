package CookiesDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //capture all cookies
        Set <Cookie> cookieslist=driver.manage().getCookies();
        //print size/number of cookies
        System.out.println("Size: "+cookieslist.size());

//        for (Cookie ck:cookieslist){
//            System.out.println(ck.getName()+ ":" +ck.getValue());
//        }
          // get specific cookie according to name
//        System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
        // create Cookie
        Cookie cookie= new Cookie("TestCookie","www.amazon.in");
        // add Cookie to browser
        driver.manage().addCookie(cookie);
        cookieslist=driver.manage().getCookies();
        //print size/number of cookies
        System.out.println("After adding Cookie Size: "+cookieslist.size());

        for (Cookie ck:cookieslist){
            System.out.println(ck.getName()+ ":" +ck.getValue());
        }
        // delete cookie
//        driver.manage().deleteCookie(cookie);
//        driver.manage().deleteCookieNamed("TestCookie");
        driver.manage().deleteAllCookies();
        cookieslist=driver.manage().getCookies();
        System.out.println("After deleting Cookie Size: "+cookieslist.size());

        for (Cookie ck:cookieslist){
            System.out.println(ck.getName()+ ":" +ck.getValue());
        }
    }

}
