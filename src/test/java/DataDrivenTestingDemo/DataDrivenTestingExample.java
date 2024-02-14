//package DataDrivenTestingDemo;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class DataDrivenTestingExample {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        XSSFWorkbook ExcelBook=null;
//        XSSFSheet ExcelWSheet;
//        XSSFRow Row;
//        XSSFCell Cell;
//
//        // create object of File class to open file
//
//        File excelfile= new File("S:\\RugDownloads\\Testdata.xlsx");
//        FileInputStream inputStream= null;
//        // create object of FileInputStream  to read data from file
//
//        try {
//             inputStream= new FileInputStream(excelfile);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        // Excel>Workbook>Sheet>row>cell
//        // create object of XSSFWorkbook to handle xlsx file
//
//        ExcelBook = new XSSFWorkbook(inputStream);
//        // to access sheet
//        ExcelWSheet =ExcelBook.getSheetAt(0);
//         //get total rows
//        int ttlrows=ExcelWSheet.getLastRowNum()+1;
//        //get total no of cells in a row
//        int ttlCells=ExcelWSheet.getRow(0).getLastCellNum();
//
//        for (int currentrow=0;currentrow<ttlrows;currentrow++)
//        {
//            // launch browser for reading data for login
//
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver= new ChromeDriver();
//            driver.get("https://www.saucedemo.com/");
//            Thread.sleep(2000);
//            driver.manage().window().maximize();
//            driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(0).toString());
//            driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(1).toString());
//            driver.findElement(By.id("login-button")).submit();
//            Thread.sleep(3000);
//
////            for(int currentcell=0;currentcell<ttlCells;currentcell++)
////            {
////                ExcelWSheet.getRow(currentrow).getCell(currentcell).toString();
////                System.out.println(ExcelWSheet.getRow(currentrow).getCell(currentcell).toString());
////                System.out.print("\t");
////
////            }
//            System.out.println()  ;
//        }
//
//    }
//}
