package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReport {

     ExtentSparkReporter htmlReporter;
     ExtentReports reports;
     ExtentTest test;
@BeforeTest
     public void startreport(){
    htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
         reports = new ExtentReports();
         reports.attachReporter(htmlReporter);

         // add environment details
         reports.setSystemInfo("Machine","testpc");
         reports.setSystemInfo("OS  ","Windows 11");
         reports.setSystemInfo("user","Sunil");
         reports.setSystemInfo("Browser ","Chrome");

         // configuration to change look nad feel
         htmlReporter.config().setDocumentTitle("Extent Report Demo");
         htmlReporter.config().setReportName("Test Report");
         htmlReporter.config().setTheme(Theme.STANDARD);
         htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

     }
     @Test
     public void launchbrowserandopenurl(){
      test= reports.createTest("Launch browser  and open url ");
         Assert.assertTrue(true);
     }
    @Test
    public void verifytitle(){
        test= reports.createTest("Verify title ");
        Assert.assertTrue(false);
    }

    @Test
    public void verifylogo(){
        test= reports.createTest("Verify Logo ");
        Assert.assertTrue(true);
    }
    @Test
    public void verifyemail(){
        test= reports.createTest("Verify Email ");
        throw new SkipException("Skipped");
    }

    @AfterMethod

    public void getTestresult(ITestResult result){

    if (result.getStatus()==ITestResult.FAILURE){
         test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " Fail ", ExtentColor.RED));
         test.fail(result.getThrowable());
    }
   else if (result.getStatus()==ITestResult.SUCCESS){
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ " Pass ", ExtentColor.GREEN));
    }
    else if (result.getStatus()==ITestResult.SKIP){
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " Skip ", ExtentColor.YELLOW));
    }
    }
    @AfterTest
 public void teardown(){
    reports.flush();
 }
}
