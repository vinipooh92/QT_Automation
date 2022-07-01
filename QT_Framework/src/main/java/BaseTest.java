import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;
    private static ExtentTest test;
    private static ExtentReports report;

    @BeforeSuite
    public void beforeSuite()
    {
        System.setProperty("webdriver.chrome.driver","E:\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        ExtentReportClass.startTest("Demo");
        ExtentReportClass.testInfo("This is the first line");

    }

    @AfterTest
    public void afterSuite()
    {
        if(null != driver)
        {
            driver.close();
            driver.quit();
        }
        ExtentReportClass.testInfo("End test");
        ExtentReportClass.EndTest();

    }

    public WebDriver getWebDriver()
    {
        return  driver;
    }
}
