package Testngpract;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.annotations.*;
public class Demo1 {
//@BeforeClass
//    public void beforeclass(){
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    public void afterclass(){
//        System.out.println("After Class");
//    }
//
//    @BeforeMethod
//    public void beforemethod(){
//        System.out.println("Before method");
//    }
//@AfterMethod
//    public void afterethod(){
//        System.out.println("Aftermethod");
//    }
//    @Test (description = "This is test case 1.")
//    @Test(timeOut = 200
//    @Test (priority = 1)
@Test(groups="Test1demo")
@Parameters({"Softwarename"})
    public void test1(String name) throws InterruptedException {
//    Thread.sleep(4000);
        System.out.println("testcase 1 "+name);
    }

//    @Test (groups="Test1demo")
//    public void test2()
//    {
//        System.out.println("testcase2");
//    }
//
//    @Test (groups="Test2demo")
//    public void test3()
//    {
//        System.out.println("testcase3");
//    }
//    @Test (groups="Test2demo")
//    public void test4()
//    {
//        System.out.println("testcase4");
//    }
}
