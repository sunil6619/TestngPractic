package Testngpract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class usePropertiesfileDemo {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        ReadPropertiesfile ob= new ReadPropertiesfile();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.get(ob.getURL());
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys(ob.getusername());

//        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.name("password")).sendKeys(ob.getpassword());
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.quit();


    }
}
