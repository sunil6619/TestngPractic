//package Testngpract;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class TestngParameterDemo {
////@Test
////@Parameters({"i","j"})
////    public void add(int a,int b){
////        System.out.println(a+b);
////    }
////    @Test
////    @Parameters({"i","j"})
////    public void sub(int a,int b){
////        System.out.println(a-b);
////    }
////    @Test
////    @Parameters({"i","j"})
////    public void multiply(int a,int b){
////        System.out.println(a*b);
////    }
//// new test case  google search using parameters
////   @Parameters({"keyword"})
////    @Test
////     public  void googlesearch(String searchdata)
////     {
////         WebDriverManager.chromedriver().setup();
////         WebDriver driver= new ChromeDriver();
////         driver.get("https://www.google.com/");
////         WebElement searchbox= driver.findElement(By.name("q"));
////         searchbox.sendKeys(searchdata);
////         Assert.assertEquals(searchdata,searchbox.getAttribute("value"));
////     }
//
////   Data providers Parametrization  example
//    // test data
//    // 1. India Qutub Minar
//    // 2. Agra Taj Mahal
//    // 3. Hyderabad charminar
//@DataProvider(name = "searchDataSet")
//    public Object[][] searchdata(){
//        Object[][] searchkeyword=new Object[3][2];
//        searchkeyword[0][0]="India";
//        searchkeyword[0][1]="Qutub Minar";
//        searchkeyword[1][0]="Agra";
//        searchkeyword[1][1]="Taj Mahal";
//        searchkeyword[2][0]="Hyderabad";
//        searchkeyword[2][1]="Charminar";
//        return searchkeyword;
//    }
//
//@Test(dataProvider = "searchDataSet")
//    public void googlesearch(String country,String monument){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com/");
//        WebElement searchbox= driver.findElement(By.name("q"));
//    searchbox.sendKeys("country + \" \"+ monument");
////        searchbox.sendKeys(country + " "+ monument);
//        WebElement searchbutton=driver.findElement(By.name("btnK"));
//        searchbutton.submit();
//
//    }
//
//
//}
