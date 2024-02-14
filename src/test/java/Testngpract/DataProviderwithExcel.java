//package Testngpract;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.checkerframework.checker.units.qual.C;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class DataProviderwithExcel {
//
//WebDriver driver;
//@BeforeMethod
//    public void setup(){
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
//
//    }
//    @Test(dataProvider = "searchDataProvider")
//  public void searchkeyword(String keyword){
//   WebElement searchbox= driver.findElement(By.name("q"));
//      searchbox.sendKeys(keyword);
//      searchbox.sendKeys(Keys.ENTER);
//  }
//@DataProvider(name="searchDataProvider")
//  public Object[][] searchDataProviderMethod() throws IOException {
//    String filname= "S:\\RugDownloads\\Testdata.xlsx";
//    Object[][] searchData= getExceldata(filname,"Sheet2");
////    Object[][]searchData= new Object[2][1];
////    searchData[0][0]="Taj Mahal";
////    searchData[1][0]="India gate";
//    return  searchData;
//  }
//
//  // reading data from Excel sheet
//    public String[][]getExceldata(String filename, String sheetname) throws IOException {
//    String[][] data= null;
//   // open File in read open
//        FileInputStream inputStream= new FileInputStream(filename);
//        XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
//        XSSFSheet excelsheet= workbook.getSheet(sheetname);
//
//        // total no of rows
//        int ttlrows=excelsheet.getLastRowNum()+1;
//        //get total no of cells in a row
//        int ttlCells=excelsheet.getRow(0).getLastCellNum();
//        //  initiaze array
//        data= new String [ttlrows-1][ttlCells];
//         for (int currentrow=1;currentrow<ttlrows;currentrow++){
//              for (int currentcell=0;currentcell<ttlCells;currentcell++){
//           data[currentrow-1][currentcell]= excelsheet.getRow(currentrow).getCell(currentcell).getStringCellValue();
//              }
//
//         }
//         {
//
//
//         }
//    return  data;
//
//    }
//  @AfterMethod
//    public void quit()
//    {
//        driver.quit();
//    }
//}
