package Testngpract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSourceURL {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement imagelogo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        System.out.println("SRc attribute value: "+imagelogo.getAttribute("src"));

        driver.quit();
    }
}
