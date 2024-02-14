package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerClass implements ITestListener {

    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    public  void configurereport(){
        htmlReporter= new ExtentSparkReporter("ExtentReportDemo1.html");
        reports= new ExtentReports();
        reports.attachReporter(htmlReporter);

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



    public void onStart(ITestContext Result){     // starts only once before Test case
        configurereport();
        System.out.println("On start method invoked");
    }
    public void onFinish(ITestContext Result){
        System.out.println("On Finish method invoked");
        reports.flush();
    }
    public void onTestFailure(ITestResult Result){
        System.out.println("Name of test method failed : "+Result.getName());
        test= reports.createTest(Result.getName());
        test.log(Status.FAIL, MarkupHelper.createLabel(Result.getName(), ExtentColor.RED));
        test.fail(Result.getThrowable());
    }
    public void onTestSkipped(ITestResult Result){
        System.out.println("Name of test method skipped : "+Result.getName());
        test= reports.createTest(Result.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel(Result.getName(), ExtentColor.YELLOW));
    }
    // this start after every@Test method
    public void onTestStart(ITestResult Result){
        System.out.println("Name of test method started : "+Result.getName());
    }
    public void onTestSuccess(ITestResult Result){
        System.out.println("Name of test method success : "+Result.getName());
        test= reports.createTest(Result.getName());
        test.log(Status.PASS, MarkupHelper.createLabel(Result.getName(), ExtentColor.GREEN));

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result){


    }
}
