//package Testngpract;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.hc.client5.http.utils.Base64;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class EncodePassword {
//
//    public static void main(String[] args) throws InterruptedException {
//
////        // encode password
////        String password="admin123";
////
////        byte[] encodedPassword=Base64.encodeBase64(password.getBytes());
////        System.out.println(new String(encodedPassword));
//
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
//        // decode password
//        byte[] decodedPassword=Base64.decodeBase64("YWRtaW4xMjM=");
//        driver.findElement(By.name("password")).sendKeys(new String(decodedPassword));
//
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
//
//    }
//}
