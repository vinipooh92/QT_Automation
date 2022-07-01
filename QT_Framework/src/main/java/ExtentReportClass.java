import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeClass;

public class ExtentReportClass
{
    private static ExtentTest test;
    private static ExtentReports report;
    public static  void startTest(String testName)
    {
        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReport.html");
        test = report.startTest(testName);
    }

    public static void EndTest()
    {
        report.endTest(test);
        report.flush();
    }


    public static void testPass(String details)
    {
        test.log(LogStatus.PASS,details);
    }

    public static  void testFail(String details)
    {
        test.log(LogStatus.FAIL,details);
    }

    public static void testInfo(String details)
    {
        test.log(LogStatus.INFO,details);
    }

    public static void testError(String details)
    {
        test.log(LogStatus.ERROR,details);
    }

    public static void testWarning(String details)
    {
        test.log(LogStatus.WARNING,details);
    }

}
