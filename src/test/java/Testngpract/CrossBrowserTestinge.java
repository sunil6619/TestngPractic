//package Testngpract;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//public class CrossBrowserTestinge {
//    WebDriver driver;
//    @BeforeMethod
//    @Parameters("browser")
//    public void launchbrowser(String browser) {
//
//        switch (browser.toLowerCase())
//        {
//            case"chrome":
//        WebDriverManager.chromedriver().setup();
//         driver=new ChromeDriver();
//        break;
//            case"msedge":
//                WebDriverManager.edgedriver().setup();
//                driver=new EdgeDriver();
//                break;
//
//            default:
//                driver= null;
//                break;
//        }
//    }
//    @Test
//    public void verifytitle(){
//        driver.get("https://www.google.com/");
//        String expectedTitle="Google";
//        String actualtitle=driver.getTitle();
//        Assert.assertEquals(expectedTitle,actualtitle);
//    }
//    @AfterMethod
// public void quit(){
//        driver.quit();
// }
//}
