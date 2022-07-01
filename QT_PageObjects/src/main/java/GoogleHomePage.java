import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage
{
   private static WebDriver driver;
    public GoogleHomePage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    public void getUrl()
    {
        driver.get("https://www.google.com");
        ExtentReportClass.testPass("Successfully opened google chrome");
    }


}