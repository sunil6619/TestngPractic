package Testngpract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.Assert;
public class TestngDemo {
//    @BeforeSuite
//    public void beforesuite(){
//        System.out.println("Before Suite");
//    }
//    @AfterSuite
//    public void aftersuite(){
//        System.out.println("After Suite");
//    }
//
//@BeforeTest
//public void beforetest(){
//    System.out.println("Before Test");
//}
//
//    @AfterTest
//    public void aftertest(){
//        System.out.println("After Test");
//    }
//@Test

//    public void verifyPageTitle() {
//// launch browser
//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.google.com/");
//    String expectedTitle = "Google";
//    String actualTitle = driver.getTitle();
//    Assert.assertEquals(actualTitle, expectedTitle);
//    driver.quit();
//}
        @Test(invocationCount = 5)
       public void verifysecond(ITestContext context){
             int currentCount = context.getAllTestMethods()[1].getCurrentInvocationCount();
           System.out.println("Executing "+ currentCount);
       System.out.println("Second test");

    }
@Test (invocationCount = 3)
    public void third(ITestContext context){
       int currentcount=context.getAllTestMethods()[0].getCurrentInvocationCount();
    System.out.println("Executing "+ currentcount);
       System.out.println("Third test");

    }
//@Test(invocationCount = 10)
//public void testcase1(ITestContext testContext){
//    System.out.println("Running testcase 1");
//    int currentCount = testContext.getAllTestMethods()[1].getCurrentInvocationCount();
//    System.out.println("Executing count: " + currentCount);
//}
//    @Test(invocationCount = 10)
//    public void testcase2(ITestContext testContext){
//        System.out.println("Running testcase 2");
//        int currentCount = testContext.getAllTestMethods()[2].getCurrentInvocationCount();
//        System.out.println("Executing count: " + currentCount);
//    }

}
